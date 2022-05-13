<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<script>
function validate(){
	var email=document.logbean.email.value;
	var pwd=document.logbean.pwd.value;
	
	if(email==""){
	    document.getElementById('e').innerHTML ="please enter your email";
	    return false;
	  }
     else if(pwd==""){
	    document.getElementById('p').innerHTML ="please enter your password";
	    return false;
	  }
}


</script>
</head>
<body>
<center>
<h1>Login Form</h1>
<html:form action="UserLoginAction" method="post" onsubmit="return validate()">
   Email :<span style="color:red" >*</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="email" /><span id="e" style="color:red"></span>
        <br><br><br>
    Password :<span style="color:red" >*</span> <html:password property="pwd" /><span id="p" style="color:red"></span>
        <br><br>
        <input type="submit" value="login" >
     <input type="reset" value="reset">
    </html:form>
</center>
</body>
</html>