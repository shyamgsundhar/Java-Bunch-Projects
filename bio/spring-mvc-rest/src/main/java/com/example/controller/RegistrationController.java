package com.example.controller;

import com.example.model.RegistrationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class RegistrationController {

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> registerUser(@RequestBody RegistrationRequest request) {
        // In a real application, you would encrypt the password and save the user data to a database.
        
        // Simulating a successful registration response
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "User registered successfully");
        response.put("username", request.getUsername());
        response.put("email", request.getEmail());
        
        return ResponseEntity.status(201).body(response);
    }
    
    // An optional endpoint to demonstrate form-urlencoded consumption if needed
    @PostMapping(value = "/register-form", consumes = "application/x-www-form-urlencoded")
    public ResponseEntity<Map<String, String>> registerUserForm(RegistrationRequest request) {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "User registered successfully via form data");
        response.put("username", request.getUsername());
        response.put("email", request.getEmail());
        
        return ResponseEntity.status(201).body(response);
    }
}
