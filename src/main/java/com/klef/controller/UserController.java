package com.klef.controller;

import com.klef.model.User;
import com.klef.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;

    // Test API
    @GetMapping("/test")
    public String test() {
        return "Backend is running successfully!";
    }

    // Get all users
    @GetMapping("/users")
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    // Add user
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }
}