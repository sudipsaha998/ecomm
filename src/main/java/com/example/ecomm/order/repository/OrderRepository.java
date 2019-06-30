package com.example.ecomm.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecomm.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
