package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.user_details;

public interface userdetailRepository extends JpaRepository<user_details,Integer>{
	user_details findByName(String user_name);
}
