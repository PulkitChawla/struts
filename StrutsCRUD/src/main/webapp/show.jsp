<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*,dao.*" %>
<%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Data Page</title>
</head>
<body>
<center>
<h1>Retrieve data from database</h1>
<table border="1">
<tr>
<td>Name</td>
<td>Email</td>
<td>Phone</td>
<%
try{
	Connection con=Dao.getConnection();
	PreparedStatement ps=con.prepareStatement("select * from reg");

ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("phone") %></td>
</tr>
<%
}
con.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 
</center>
</body>
</html>