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
@Table(name ="user_details")
public class user_details {
	
	@Id
    @GeneratedValue
    private int user_id;
    private String user_name;
    private String password;
    private String confirm_password;
    private int userCategory_id;
    
    public Integer getuser_id() {
		// TODO Auto-generated method stub
		return user_id;
	}
    
    public String getuser_name() {
		// TODO Auto-generated method stub
		return user_name;
	}

    public String getpassword() {
		// TODO Auto-generated method stub
		return password;
	}

    public String getconfirm_password() {
		// TODO Auto-generated method stub
		return confirm_password;
	}

    public Integer getuserCategory_id() {
		// TODO Auto-generated method stub
		return userCategory_id;
	}
    
	public void setuser_name(String getuser_name) {
		// TODO Auto-generated method stub
		this.user_name = getuser_name;
		
	}
	
	public void setpassword(String getpassword) {
		// TODO Auto-generated method stub
		this.password = getpassword;
		
	}
	public void setconfirm_password(String getconfirm_password) {
		// TODO Auto-generated method stub
		this.confirm_password = getconfirm_password;
		
	}
	
	public void setuserCategory_id(Integer getuserCategory_id) {
		// TODO Auto-generated method stub
		this.userCategory_id = getuserCategory_id;
		
	}
}
