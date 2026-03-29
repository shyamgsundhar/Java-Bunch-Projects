<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login - MVC Pattern</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f2f5; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }
        .login-container { background: white; padding: 40px; border-radius: 10px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); width: 320px; }
        h2 { text-align: center; color: #1c1e21; margin-bottom: 24px; }
        .form-group { margin-bottom: 20px; }
        .form-group label { display: block; margin-bottom: 8px; color: #606770; font-size: 14px; font-weight: 600;}
        .form-group input { width: 100%; padding: 12px; border: 1px solid #ccd0d5; border-radius: 6px; box-sizing: border-box; font-size: 16px; transition: border-color 0.15s ease-in-out; }
        .form-group input:focus { border-color: #1877f2; outline: none; box-shadow: 0 0 0 2px rgba(24,119,242,0.2); }
        .btn { width: 100%; padding: 12px; background-color: #1877f2; color: white; border: none; border-radius: 6px; cursor: pointer; font-size: 16px; font-weight: bold; transition: background-color 0.2s; }
        .btn:hover { background-color: #166fe5; }
        .error { color: #dc3545; text-align: center; margin-bottom: 20px; padding: 10px; background-color: #f8d7da; border: 1px solid #f5c6cb; border-radius: 5px; font-size: 14px; }
        .hint { text-align: center; margin-top: 15px; font-size: 13px; color: #666; }
    </style>
</head>
<body>

<div class="login-container">
    <h2>Welcome Back</h2>
    
    <%-- View logic to display error message if given by Controller --%>
    <%
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
    %>
        <div class="error"><%= errorMessage %></div>
    <%
        }
    %>

    <form action="login" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" placeholder="Enter username" required>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter password" required>
        </div>
        <button type="submit" class="btn">Login</button>
    </form>
    
    <div class="hint">
        <em>Test credentials: admin / password123</em>
    </div>
</div>

</body>
</html>
