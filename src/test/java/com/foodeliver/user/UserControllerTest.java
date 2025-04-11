package com.foodeliver.user;


import com.foodeliver.user.controller.Usercontroller;
import com.foodeliver.user.entity.User;
import com.foodeliver.user.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

 class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private Usercontroller userController;

    @BeforeEach
     void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddUser() {
        User user = new User(1, "Abhi", "Mumbai", "abhi@123","");
        when(userService.addUser(user)).thenReturn(user);

        ResponseEntity<User> response = userController.addUser(user);

        assertEquals(201, response.getStatusCodeValue());
        assertEquals(user, response.getBody());
        verify(userService, times(1)).addUser(user);
    }

    @Test
     void testGetAllUsers() {
        List<User> users = Arrays.asList(
                new User(1, "Abhi", "Mumbai", "pass1","abad"),
                new User(2, "Ravi", "Pune", "pass2","abad")
        );

        when(userService.getAllUser()).thenReturn(users);

        ResponseEntity<List<User>> response = userController.getAllUser();

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(2, response.getBody().size());
        verify(userService, times(1)).getAllUser();
    }

    @Test
     void testFindById() {
        User user = new User(1, "Abhi", "Mumbai", "pass1","abad");

        when(userService.findtUserById(1)).thenReturn(user);

        ResponseEntity<User> response = userController.findById(1);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(user, response.getBody());
        verify(userService, times(1)).findtUserById(1);
    }
}

