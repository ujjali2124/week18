package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.product_details;

public interface ProductRepository extends JpaRepository<product_details,Integer>{
	//product_details findByproduct_name(String product_name);
}
