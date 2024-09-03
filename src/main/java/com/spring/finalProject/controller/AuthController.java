package com.spring.finalProject.controller;

import com.spring.finalProject.model.User;
import com.spring.finalProject.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to the Home Page!";
    }

    // Endpoint for user registration
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.registerUser(user);
    }

    // Endpoint for user login
    @PostMapping("/login")
    public User login(@RequestParam String username, @RequestParam String password) {
        return authService.loginUser(username, password);
    }
}
