package com.example.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.inventory.entity.product_details;
import java.util.List;
import com.example.inventory.services.productservices;

@RestController
public class productcontroller {
	
	@Autowired
    private productservices service;
	
	@PostMapping("/addProduct")
    public product_details addProduct(@RequestBody product_details product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<product_details> addProducts(@RequestBody List<product_details> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<product_details> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{product_id}")
    public product_details findProductById(@PathVariable int product_id) {
        return service.getProductById(product_id);
    }

    @GetMapping("/product/{product_name}")
    public product_details findProductByName(@PathVariable String product_name) {
        return service.getProductByName(product_name);
    }

    // Route needs to be unique... 
    //
    //@PutMapping("/update")
    //public product_details updateProduct(@RequestBody product_details product) {
    //    return service.updateProduct(product);
    //}

    @DeleteMapping("/delete/{product_id}")
    public String deleteProduct(@PathVariable int product_id) {
        return service.deleteProduct(product_id);
    }

}
