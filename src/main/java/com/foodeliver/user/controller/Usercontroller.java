package com.foodeliver.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


import com.foodeliver.user.entity.User;
import com.foodeliver.user.services.UserService;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	//@Autowired
	private final UserService service;
	
	public Usercontroller(UserService service) {
		this.service=service;
	}
	
	@PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = service.addUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

	@GetMapping("/allUser")
	public ResponseEntity<List<User>> getAllUser(){
		List<User>list=service.getAllUser();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> findById(@PathVariable int id){
		
		
		User user=service.findtUserById(id);
	return	ResponseEntity.ok(user);
	}
	
}
