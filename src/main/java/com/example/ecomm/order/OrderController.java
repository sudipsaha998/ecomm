package com.example.ecomm.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecomm.entity.Order;
import com.example.ecomm.order.service.OrderService;


@RestController
@RequestMapping(value = "/order")
public class OrderController {

	private OrderService orderService;
	
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping(value = "/all")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@PostMapping(value = "/{email}")
	public Order createOrder(@PathVariable(name = "email") String email, Order order) {
		order.setUserEmailId(email);
		return orderService.createOrder(order);
	}
	
}
