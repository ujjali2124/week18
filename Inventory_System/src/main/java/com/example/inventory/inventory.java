package com.example.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@EntityScan(basePackages = "com.example.inventory") 
public class inventory {

	public static void main(String[] args) {
		SpringApplication.run(inventory.class, args);
	}

}
