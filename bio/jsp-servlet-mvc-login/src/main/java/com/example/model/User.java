package com.example.model;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Simulates business logic or database authentication verification.
     */
    public boolean isValid() {
        // Mock authentication: allow if username equals 'admin' and password is 'password123'
        return "admin".equals(this.username) && "password123".equals(this.password);
    }
}
