package com.api.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dto.ItemsDto;
import com.api.model.Items;
import com.api.repository.ItemRepository;

@Service
@Transactional
public class ItemServiceImpl implements IItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public List<Items> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public Optional<Items> getItemById(Integer id) {
		return itemRepository.findById(id);
	}

	@Override
	public Items saveItem(ItemsDto item) {
		Items item1 = new Items(item.getName() , item.getPrice(), item.getDescription(), item.getAvailable());
		return itemRepository.save(item1);
	}

	@Override
	public Items partialUpdate(int id , int price ) {
		if (itemRepository.findById(id).isPresent()){
            Items existingItem = itemRepository.findById(id).get();
            existingItem.setPrice(price);
            Items updatedItem = itemRepository.save(existingItem);

            return updatedItem;
        }else{
            return null;
        }
	}

	@Override
	public void deleteItem(int id) {
		Items item = itemRepository.findById(id).get();
		itemRepository.delete(item);
	}
	

}
