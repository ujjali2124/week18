package com.example.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.entity.product_category;
import com.example.inventory.repository.ProductCategoryRepository;

@Service
public class productcategoryservices {
	
	@Autowired
    private ProductCategoryRepository repository;
	
	public product_category saveProduct(product_category product) {
        return repository.save(product);
    }

    public List<product_category> saveProducts(List<product_category> products) {
        return repository.saveAll(products);
    }

    public List<product_category> getProducts() {
        return repository.findAll();
    }

    public product_category getProductById(int product_id) {
        return repository.findById(product_id).orElse(null);
    }

 
    public product_category updateProduct(product_category product) {
    	product_category existingProduct = repository.findById(product.getproduct_id()).orElse(null);
        existingProduct.setproduct_id(product.getproduct_id());
        existingProduct.setcategory_id(product.getcategory_id());
        return repository.save(existingProduct);
    }
	

}
