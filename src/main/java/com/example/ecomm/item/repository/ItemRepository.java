package com.example.ecomm.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecomm.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
