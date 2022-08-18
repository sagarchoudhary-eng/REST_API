package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.dto.AllItemsDTO;
import com.api.dto.ItemsDto;
import com.api.model.Items;
import com.api.service.IItemService;

@RestController
public class ItemsController {
	
	@Autowired
	private IItemService service;
	
	@GetMapping("/items")
	public ResponseEntity<?> getItems(){
		List<Items> items = service.getAllItems(); 
		int totalItems = items.size();
		AllItemsDTO allItemsData = new AllItemsDTO(totalItems,items);
		return new ResponseEntity<>(allItemsData,HttpStatus.OK);
	}
	
	@GetMapping("/items/id/{id}")
	public ResponseEntity<?> getItemById(@PathVariable Integer id){
		try {
			return new ResponseEntity<>(service.getItemById(id),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/items")
	public ResponseEntity<?> saveItem(@RequestBody ItemsDto item){
		try {
			return new ResponseEntity<>(service.saveItem(item),HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
	}
	
	@PatchMapping("/items/id/{id}")
	public ResponseEntity<?> partialUpdateItem(@PathVariable Integer id,@PathVariable int price){
		try {
			return new ResponseEntity<>(service.partialUpdate(id, price),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		}
		
	}
	
	@DeleteMapping("/items/id/{id}")
	public ResponseEntity<?> deleteItem(@PathVariable Integer id){
		
		try {
			service.deleteItem(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
