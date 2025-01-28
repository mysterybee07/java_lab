package org.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class PreferenceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Check if user is logged in via session
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login");
            return;
        }

        // Retrieve user preferences from cookies
        Cookie[] cookies = request.getCookies();
        String userPreference = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("userPreference".equals(cookie.getName())) {
                    userPreference = cookie.getValue();
                }
            }
        }

        // Display preference form
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Welcome, " + session.getAttribute("username") + "</h3>");
        out.println("<form action='preferences' method='POST'>");
        out.println("Choose your preference: <input type='text' name='preference' value='" + (userPreference != null ? userPreference : "") + "'><br>");
        out.println("<input type='submit' value='Save Preference'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Save user preference in a cookie
        String preference = request.getParameter("preference");

        Cookie preferenceCookie = new Cookie("userPreference", preference);
        preferenceCookie.setMaxAge(60 * 60 * 24); // 1 day
        response.addCookie(preferenceCookie);

        // Redirect back to preference page
        response.sendRedirect("preferences");
    }
}
