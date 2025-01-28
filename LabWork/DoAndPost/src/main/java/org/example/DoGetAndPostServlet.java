package org.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class DoGetAndPostServlet extends HttpServlet {
    // Handle GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>GET request</h2>");
        out.println("<form method='POST' action='/DoGetAndPost/submit'>");
        out.println("Name: <input type='text' name='name'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    // Handle POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>POST request</h2>");
        out.println("<p>Received name: " + name + "</p>");
        out.println("<a href='/DoGetAndPost/'>Go back</a>");
        out.println("</body></html>");
    }
}
