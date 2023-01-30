package com.example.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.entity.user_details;
import com.example.inventory.services.userdetailservices;

@RestController
public class userdetailcontroller {

	@Autowired
    private userdetailservices service;
	
	@PostMapping("/adduser")
    public user_details adduser(@RequestBody user_details user) {
        return service.saveuser(user);
    }

    @PostMapping("/adduser")
    public List<user_details> adduser(@RequestBody List<user_details> user) {
        return service.saveusers(user);
    }

    @GetMapping("/user")
    public List<user_details> findAlluser() {
        return service.getusers();
    }

    @GetMapping("/userById/{user_id}")
    public user_details finduserById(@PathVariable int user_id) {
        return service.getuserById(user_id);
    }

    @GetMapping("/user/{user_name}")
    public user_details finduserByName(@PathVariable String user_name) {
        return service.getuserByName(user_name);
    }

    @PutMapping("/update")
    public user_details updateuser(@RequestBody user_details user) {
        return service.updateuser(user);
    }

    @DeleteMapping("/delete/{user_id}")
    public String deleteuser(@PathVariable int user_id) {
        return service.deleteuser(user_id);
    }
}
