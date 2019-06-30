package com.example.ecomm.order.service;

import java.util.List;

import com.example.ecomm.entity.Item;
import com.example.ecomm.entity.Order;

public interface OrderService {

	public List<Order> getAllOrders();
	
	public Order createOrder(Order order);
	
	
}
