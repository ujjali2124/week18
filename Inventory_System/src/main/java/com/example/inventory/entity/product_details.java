package com.example.inventory.entity;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="product_details")
public class product_details {
	
	@Id
    @GeneratedValue
    private int product_id;
    private String product_name;
    private int product_cost;
    private String product_description;
    
	public Integer getproduct_id() {
		// TODO Auto-generated method stub
		return product_id;
	}

	public String getproduct_name() {
		// TODO Auto-generated method stub
		return product_name;
	}

	public Integer getproduct_cost() {
		// TODO Auto-generated method stub
		return product_cost;
	}

	public String getproduct_description() {
		// TODO Auto-generated method stub
		return product_description;
	}

	public void setproduct_name(String getproduct_name) {
		// TODO Auto-generated method stub
		this.product_name = getproduct_name;
		
	}

	public void setproduct_cost(Integer getproduct_cost) {
		// TODO Auto-generated method stub
		this.product_cost = getproduct_cost;
		
	}

	public void setproduct_description(String getproduct_description) {
		// TODO Auto-generated method stub
		this.product_description = getproduct_description;
		
	}
    

}
