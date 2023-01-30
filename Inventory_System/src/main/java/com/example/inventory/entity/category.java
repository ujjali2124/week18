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
@Table(name ="category")
public class category {
	
	@Id
    @GeneratedValue
    private int category_id;
    private String category_name;
    
    public Integer getcategory_id() {
		// TODO Auto-generated method stub
		return category_id;
	}

	public String getcategory_name() {
		// TODO Auto-generated method stub
		return category_name;
	}

	public void setcategory_name(String getcategory_name) {
			// TODO Auto-generated method stub
			this.category_name = getcategory_name;
			
	}
}
