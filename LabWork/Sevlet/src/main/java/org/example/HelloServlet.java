package org.example;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Get the output stream to write the response
        PrintWriter out = response.getWriter();

        // Display "Hello, World!" in the browser
        out.println("<html><body>");
        out.println("<h1>Hi Iam Aadarsh Tamanag</h1>");
        out.println("</body></html>");
    }
}

