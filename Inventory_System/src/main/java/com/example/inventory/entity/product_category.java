package com.example.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="product_category")
public class product_category {
	
	@Id
    @GeneratedValue
    private int product_id;
    private int category_id;
    
    public Integer getproduct_id() {
		// TODO Auto-generated method stub
		return product_id;
	}
    
    public Integer getcategory_id() {
		// TODO Auto-generated method stub
		return category_id;
	}
    
    public void setproduct_id(Integer getproduct_id) {
		// TODO Auto-generated method stub
		this.product_id = getproduct_id;
		
	}
    public void setcategory_id(Integer getcategory_id) {
		// TODO Auto-generated method stub
		this.category_id = getcategory_id;
		
	}

}
