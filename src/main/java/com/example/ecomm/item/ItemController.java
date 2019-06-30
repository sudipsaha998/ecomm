package com.example.ecomm.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecomm.entity.Item;
import com.example.ecomm.item.service.ItemService;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

	ItemService itemService;
	
	@Autowired
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping(value = "/all")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	@GetMapping(value = "/{id}")
	public Item getItem(@PathVariable(name = "{id}") int id) {
		return itemService.getItem(id);
	}
	
	@PostMapping(value = "/add")
	public Item addItem(Item item) {
		return itemService.addItem(item);
	}
	
	@PutMapping(value = "/{id}")
	public Item updateItem(@PathVariable(name = "id") int id, Item item) {
		return itemService.updateItem(id, item);
	}
	
	@DeleteMapping(value = "/{id}")
	public void removeItem(@PathVariable(name = "id") int id) {
		itemService.removeItem(id);
	}
}
