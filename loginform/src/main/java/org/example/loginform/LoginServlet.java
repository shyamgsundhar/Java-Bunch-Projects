package org.example.loginform;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    Map<String,String> users = new HashMap<>();
    public void init() {
        users.put("admin","admin123");
        users.put("manager","manager123");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(users.containsKey(username) && users.get(username).equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("user","username");
            response.sendRedirect("home");
        }else{
            response.getWriter().println("Invalid ID and Password");
        }
    }

    @Override
    public void destroy() {
       super.destroy();
    }
}