package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.product_details;

public interface ProductRepository extends JpaRepository<product_details,Integer>{
	product_details findByName(String product_name);
}
