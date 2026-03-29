package com.example.controller;

import com.example.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from Spring MVC REST Controller!");
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(
            new User(1, "john_doe", "john@example.com"),
            new User(2, "jane_doe", "jane@example.com")
        );
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        // Echo back the created user as an example
        user.setId(3); // Mock an auto-generated ID
        return ResponseEntity.status(201).body(user);
    }
}
