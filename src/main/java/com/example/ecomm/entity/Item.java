package com.example.ecomm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String name;
	private double price;
	private int quantity;
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(int id, String name, double price, int count) {
		super();
		this.itemId = id;
		this.name = name;
		this.price = price;
		this.quantity = count;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(int id) {
		this.itemId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantity;
		result = prime * result + (int) (itemId ^ (itemId >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (quantity != other.quantity)
			return false;
		if (itemId != other.itemId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}
