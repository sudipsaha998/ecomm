package com.example.ecomm.item.service;

import java.util.List;

import com.example.ecomm.entity.Item;

public interface ItemService {

	public List<Item> getAllItems();
	
	public Item getItem(int id);
	
	public Item addItem(Item item);
	
	public Item updateItem(int id, Item item);
	
	public void removeItem(int id);
}
