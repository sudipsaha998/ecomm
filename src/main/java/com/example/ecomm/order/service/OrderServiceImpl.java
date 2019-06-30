package com.example.ecomm.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecomm.entity.Item;
import com.example.ecomm.entity.Order;
import com.example.ecomm.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	OrderRepository orderRepository;
	
	@Autowired
	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

}
