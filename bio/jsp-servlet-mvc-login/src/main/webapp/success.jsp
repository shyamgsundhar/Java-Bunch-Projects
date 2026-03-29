<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <% // Ensure the user is actually authenticated before seeing this page if
        (session.getAttribute("loggedInUser")==null) { response.sendRedirect("login"); // redirect back to login servlet
        return; } %>
        <!DOCTYPE html>
        <html>

        <head>
            <title>Dashboard</title>
            <style>
                body {
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    text-align: center;
                    padding-top: 50px;
                    background-color: #f0f2f5;
                    margin: 0;
                }

                .dashboard {
                    background: white;
                    padding: 40px;
                    border-radius: 10px;
                    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
                    display: inline-block;
                    min-width: 400px;
                }

                h1 {
                    color: #28a745;
                    margin-top: 0;
                }

                p {
                    color: #606770;
                    line-height: 1.6;
                    margin-bottom: 25px;
                }

                a.logout-btn {
                    display: inline-block;
                    padding: 10px 24px;
                    background-color: #dc3545;
                    color: white;
                    text-decoration: none;
                    border-radius: 6px;
                    font-weight: bold;
                    transition: background-color 0.2s;
                }

                a.logout-btn:hover {
                    background-color: #c82333;
                }

                .profile-icon {
                    font-size: 48px;
                    margin-bottom: 10px;
                }
            </style>
        </head>

        <body>

            <div class="dashboard">
                <div class="profile-icon">👋</div>
                <h1>Welcome, <%= session.getAttribute("loggedInUser") %>!</h1>
                <p>You have successfully logged in using pure <strong>JSP & Servlet MVC architecture</strong><br>without
                    any Spring framework components.</p>

                <a href="logout" class="logout-btn">Logout</a>
            </div>

        </body>

        </html>