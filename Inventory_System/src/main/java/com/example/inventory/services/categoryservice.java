package com.example.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.entity.category;
import com.example.inventory.repository.CategoryRepository;



@Service
public class categoryservice {
	@Autowired
    private CategoryRepository repository;
	
	public category saveProduct(category product) {
        return repository.save(product);
    }

    public List<category> saveProducts(List<category> products) {
        return repository.saveAll(products);
    }

    public List<category> getProducts() {
        return repository.findAll();
    }

    public category getProductById(int category_id) {
        return repository.findById(category_id).orElse(null);
    }

    public category getProductByName(String category_name) {
        //return repository.findBycategory_name(category_name);
      return null;
    }

    public String deleteProduct(int category_id) {
        repository.deleteById(category_id);
        return "product removed !! " + category_id;
    }

    public category updateProduct(category product) {
    	category existingProduct = repository.findById(product.getcategory_id()).orElse(null);
        existingProduct.setcategory_name(product.getcategory_name());
        return repository.save(existingProduct);
    }

}
