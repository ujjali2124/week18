package com.example.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.entity.user_details;
import com.example.inventory.repository.userdetailRepository;

@Service
public class userdetailservices {

	@Autowired
    private userdetailRepository repository;
	
	public user_details saveuser(user_details user) {
        return repository.save(user);
    }

    public List<user_details> saveusers(List<user_details> user) {
        return repository.saveAll(user);
    }

    public List<user_details> getusers() {
        return repository.findAll();
    }

    public user_details getuserById(int user_id) {
        return repository.findById(user_id).orElse(null);
    }

    public user_details getuserByName(String user_name) {
        return repository.findByName(user_name);
    }

    public String deleteuser(int user_id) {
        repository.deleteById(user_id);
        return "user removed !! " + user_id;
    }

    public user_details updateuser(user_details user) {
    	user_details existinguser = repository.findById(user.getuser_id()).orElse(null);
        existinguser.setuser_name(user.getuser_name());
        existinguser.setpassword(user.getpassword());
        existinguser.setconfirm_password(user.getconfirm_password());
        existinguser.setuserCategory_id(user.getuserCategory_id());
        return repository.save(existinguser);
    }
}
