package com.foodeliver.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodeliver.user.repositories.UserRepo;

@SpringBootTest
class UserApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private UserRepo repo;
	@Test
	public void userById() {
		assertEquals(1, 2);
		assertNotNull(repo);
		//assertEquals("abhi", repo.);
	}

}
