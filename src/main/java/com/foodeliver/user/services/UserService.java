package com.foodeliver.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodeliver.user.entity.User;
import com.foodeliver.user.repositories.UserRepo;

@Service
public class UserService {
	
	private final UserRepo repo;
	public UserService(UserRepo repo) {
		this.repo=repo;
	}
	
	public User addUser(User user) {
	
		return repo.save(user);
		
	}
	public List<User> getAllUser(){
		
		return repo.findAll();
				
		
	}
	public User findtUserById(int id) {
		User user=repo.getById(id);
		return user;
		
	}

}
