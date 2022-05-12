<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<center>
<h1>Login Form</h1>
<html:form action="UserLoginAction" method="post">
   Email :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="email" />
        <br><br><br>
    Password : <html:password property="pwd" />
        <br><br>
        <html:submit value="login" />
        <html:submit value="clear"/>
    </html:form>
</center>
</body>
</html>