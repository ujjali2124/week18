package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.category;
import com.example.inventory.entity.product_details;

public interface CategoryRepository extends JpaRepository<category,Integer>{
	category findByName(String category_name);

}
