package com.example.ecomm.item.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecomm.entity.Item;
import com.example.ecomm.item.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	ItemRepository itemRepo;
	Map<Long,Item> ui = new HashMap<Long,Item>();
	
	
	@Autowired
	public void setItemRepo(ItemRepository itemRepo) {
		this.itemRepo = itemRepo;
	}

	@Override
	public List<Item> getAllItems(){
		return itemRepo.findAll();
	}

	@Override
	public Item getItem(int id) {
		// TODO Auto-generated method stub
		Item item = null;
		Optional<Item> optional = itemRepo.findById(id);
		if(optional.isPresent()) {
			item = optional.get();
		}
		
		return item;
	}

	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}

	@Override
	public Item updateItem(int id, Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}

	@Override
	public void removeItem(int id) {
		// TODO Auto-generated method stub
		itemRepo.deleteById(id);
	}

}
