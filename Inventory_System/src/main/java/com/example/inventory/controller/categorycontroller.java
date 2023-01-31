package com.example.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.entity.category;
import com.example.inventory.services.categoryservice;



@RestController
public class categorycontroller {
	
	@Autowired
    private categoryservice service;
	
	@PostMapping("/addCategory")
    public category addProduct(@RequestBody category product) {
        return service.saveProduct(product);
    }

    //@PostMapping("/addCategory")
    //public List<category> addProducts(@RequestBody List<category> products) {
    //    return service.saveProducts(products);
    //}

    @GetMapping("/Category")
    public List<category> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/categoryById/{category_id}")
    public category findProductById(@PathVariable int category_id) {
        return service.getProductById(category_id);
    }

    @GetMapping("/category/{category_name}")
    public category findProductByName(@PathVariable String category_name) {
        return service.getProductByName(category_name);
    }

    @PutMapping("/update")
    public category updateProduct(@RequestBody category product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{category_id}")
    public String deleteProduct(@PathVariable int category_id) {
        return service.deleteProduct(category_id);
    }

}
