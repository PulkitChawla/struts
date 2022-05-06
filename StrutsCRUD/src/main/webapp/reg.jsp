<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<s:form name="form" action="registeruser.action" method="post">
		<s:textfield label="Full Name" name="name" />
		<s:textfield label="Email" name="email" />
		<s:password label="Password" name="pwd" />
		<s:textfield label="Confirm Password" name="cpwd"/>
		<s:textfield label="Phone" name="phone"/>
		<s:submit value="Register" method="register"/>
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>