package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventory.entity.product_category;

public interface ProductCategoryRepository extends JpaRepository<product_category,Integer>{
	//Optional<product_category> findByproduce_id(Integer product_id);
}
