package com.api.service;

import java.util.List;
import java.util.Optional;

import com.api.dto.ItemsDto;
import com.api.model.Items;

public interface IItemService {
	public List<Items> getAllItems();

	public Optional<Items> getItemById(Integer id);
	public Items saveItem(ItemsDto item);
	public Items partialUpdate(int id ,int price);
	public void deleteItem(int id);
}
