<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<style>
html:submit{
	font-size:40px;
}
</style>
<script>
function textReset(id) {
	document.getElementById(id).innerHTML = "";
}

function validate(){
	var name=document.regbean.name.value;
	var email=document.regbean.email.value;
	var pwd=document.regbean.pwd.value;
	var cpwd=document.regbean.cpwd.value;
	var ph=document.regbean.phone.value;
	var coun=document.regbean.country.value;
	
	  if(name==""){
	    document.getElementById('n').innerHTML ="please enter your name";
	    return false;
	  }
	  
	  else if(email==""){
		    document.getElementById('e').innerHTML ="please enter your email";
		    return false;
		  }
	  else if(pwd==""){
		  
		    document.getElementById('p').innerHTML ="please enter your password";
		   
		    return false;
		  }
	  else if(cpwd==""){
		    document.getElementById('cp').innerHTML ="please enter password again";
		    return false;
		  }
	  if(pwd!=cpwd){
		  alert("Password does not match.");
		  return false;
	  } 
	 
	   if(ph==""){
		    document.getElementById('ph').innerHTML ="please enter your contact";
		    return false;
		  }
	}
</script>
</head>
<body>
<center>
<h1>Registration Form</h1>
	<table>
    <html:form action="UserRegisterAction" onsubmit="return validate()" >
	<tr><td>Enter Name:<span style="color:red" >*</span></td> &nbsp;<td><html:text onchange="textReset('n')" property="name"/><span id="n" style="color:red"></span></td></tr>
    <tr><td>Enter Email:<span style="color:red">*</span></td>&nbsp;&nbsp;<td> <html:text onchange="textReset('e')" property="email"/><span id="e" style="color:red"></span></td></tr>
    <tr><td>Enter Password:<span style="color:red">*</span></td> &nbsp;&nbsp;<td> <html:text onchange="textReset('p')" property="pwd"/><span id="p" style="color:red"></span></td></tr>
    <tr><td>ReEnter Password:<span style="color:red">*</span></td>&nbsp;&nbsp;&nbsp;<td> <html:text onchange="textReset('cp')" property="cpwd"/><span id="cp" style="color:red"></span></td></tr>
    <tr><td>Enter Contact No:<span style="color:red">*</span></td><td><html:text onchange="textReset('ph')" styleId="contact" property="phone"/><span id="ph" style="color:red"></span></td></tr>
    <tr><td>Select Country:<span style="color:red">*</span></td>
    <td><select name="country">
     <option>Select Any Country</option>
     <option value="India" selected>India</option>
     <option value="Bangladesh">Bangladesh</option>
     <option value="Australia">Australia</option>
     <option value="America">America</option>
    </select> </td></tr>
    <tr><td>Select Gender:<span style="color:red">*</span></td>
    <td><input type="radio" name="gender" checked value="male" >Male
   <input type="radio" name="gender" value="female">Female 
   </td>
    </table>
    <br>
    <input type="submit" value="register" >
     <input type="reset" value="reset">
    </html:form>
</center>
</body>
</html>