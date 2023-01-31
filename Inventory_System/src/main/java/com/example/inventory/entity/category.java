package com.example.inventory.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
