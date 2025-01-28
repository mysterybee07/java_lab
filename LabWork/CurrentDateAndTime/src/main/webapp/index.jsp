<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Current Date and Time</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Current Date and Time in Nepal</h1>

    <%
        java.util.Date date = new java.util.Date();
        String currentDateTime = date.toString(); // Get the current date and time as a string
    %>

    <p><strong>Current Date and Time: </strong><%= currentDateTime %></p>

</body>
</html>
