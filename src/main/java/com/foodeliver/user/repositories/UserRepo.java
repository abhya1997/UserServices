package com.foodeliver.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodeliver.user.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	
}
