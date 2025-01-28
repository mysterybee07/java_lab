package org.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.*;

@WebServlet(name = "SubmitFormServlet", urlPatterns = "/submitForm")
public class SubmitFormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");

        // Get form data from the request
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Get the output stream to write the response
        PrintWriter out = response.getWriter();

        // Display the submitted data
        out.println("<html><body>");
        out.println("<h1>Form Submission</h1>");
        out.println("<p>Your Name: " + name + "</p>");
        out.println("<p>Your Email: " + email + "</p>");
        out.println("</body></html>");
    }
}

