package com.example.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.entity.product_details;
import com.example.inventory.repository.ProductRepository;

@Service
public class productservices {
	
	@Autowired
    private ProductRepository repository;
	
	public product_details saveProduct(product_details product) {
        return repository.save(product);
    }

    public List<product_details> saveProducts(List<product_details> products) {
        return repository.saveAll(products);
    }

    public List<product_details> getProducts() {
        return repository.findAll();
    }

    public product_details getProductById(int product_id) {
        return repository.findById(product_id).orElse(null);
    }

    public product_details getProductByName(String product_name) {
        return repository.findByName(product_name);
    }

    public String deleteProduct(int product_id) {
        repository.deleteById(product_id);
        return "product removed !! " + product_id;
    }

    public product_details updateProduct(product_details product) {
    	product_details existingProduct = repository.findById(product.getproduct_id()).orElse(null);
        existingProduct.setproduct_name(product.getproduct_name());
        existingProduct.setproduct_cost(product.getproduct_cost());
        existingProduct.setproduct_description(product.getproduct_description());
        return repository.save(existingProduct);
    }
	
}
