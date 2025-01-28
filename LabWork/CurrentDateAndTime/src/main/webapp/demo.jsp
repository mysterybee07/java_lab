<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP Implicit Objects</title>
</head>
<body>
    <h1>JSP Implicit Objects Demonstration</h1>

    <h2>Request Object</h2>
    <p><strong>Request Method:</strong> <%= request.getMethod() %></p>
    <p><strong>Request URI:</strong> <%= request.getRequestURI() %></p>

    <h2>Response Object</h2>
    <p><strong>Content Type:</strong> <%= response.getContentType() %></p>

    <h2>Session Object</h2>
    <%
        // Check if a session exists; if not, create a new one
        session = request.getSession(true);

        // Get an attribute from the session or create one if it doesn't exist
        String counter = (String) session.getAttribute("counter");
        if (counter == null) {
            counter = "1";
        } else {
            int count = Integer.parseInt(counter) + 1;
            counter = String.valueOf(count);
        }

        // Save the updated value back into the session
        session.setAttribute("counter", counter);
    %>
    <p><strong>Session ID:</strong> <%= session.getId() %></p>
    <p><strong>Session Counter (refresh the page to increment):</strong> <%= counter %></p>
</body>
</html>
