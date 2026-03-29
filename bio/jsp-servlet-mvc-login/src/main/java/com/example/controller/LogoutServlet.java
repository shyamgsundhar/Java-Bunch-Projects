package com.example.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Controller servlet handling logout requests.
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Get existing session without creating a new one
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate(); // Destroy the session to log out
        }
        
        // Redirect back to the login page
        response.sendRedirect("login"); 
    }
}
