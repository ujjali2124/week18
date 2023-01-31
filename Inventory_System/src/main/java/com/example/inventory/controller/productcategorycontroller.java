package com.example.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.entity.product_category;

import com.example.inventory.services.productcategoryservices;


@RestController
public class productcategorycontroller {
	

	@Autowired
    private productcategoryservices service;
	
    // Route needs to be unique... 
    //
    //@GetMapping("/products")
    //public List<product_category> findAllProducts() {
    //    return service.getProducts();
    //}

    // Route needs to be unique... 
    //
    //@GetMapping("/productById/{product_id}")
    //public product_category findProductById(@PathVariable int product_id) {
    //    return service.getProductById(product_id);
    //}


}
