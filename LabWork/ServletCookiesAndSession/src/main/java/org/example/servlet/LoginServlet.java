package org.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Display the login form
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form action='login' method='POST'>");
        out.println("Username: <input type='text' name='username'><br>");
        out.println("Password: <input type='password' name='password'><br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple authentication logic (For demonstration purposes)
        if ("aadarsh".equals(username) && "aadarsh".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to preference page after login
            response.sendRedirect("preferences");
        } else {
            response.sendRedirect("login");
        }
    }
}

