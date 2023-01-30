package com.example.inventory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.product_category;

public interface ProductCategoryRepository extends JpaRepository<product_category,Integer>{
	Optional<product_category> findById(Integer product_id);
}
