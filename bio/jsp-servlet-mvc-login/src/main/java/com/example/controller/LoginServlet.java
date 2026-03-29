package com.example.controller;

import com.example.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Controller servlet handling login requests.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Handle GET request - simply forward to the View (JSP page)
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
            
        // 1. Retrieve data from the request
        String username = request.getParameter("username");
        String password =  request.getParameter("password");
        
        // 2. Instantiate and interact with the Model
        User user = new User(username, password);
        
        // 3. Process business logic and route to appropriate View
        if (user.isValid()) {
            // Success: Create a session and redirect to success page
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", user.getUsername());
            response.sendRedirect("success.jsp"); // use redirect to prevent form resubmission
        } else {
            // Failure: Set an error message and forward back to login page
            request.setAttribute("errorMessage", "Invalid username or password.");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
