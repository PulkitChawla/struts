<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="LogController" method="post">
Enter Email<input type="text" name="email"><br><br>
Enter Password<input type="text" name="pwd"><br><br>
<input type="submit" value="Login">
<input type="reset" value="Reset">
</form>
</body>
</html>