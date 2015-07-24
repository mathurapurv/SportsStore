<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display user info</title>


<%
String name = (String)request.getAttribute("name");
String address = (String)request.getAttribute("address");
%>


</head>
<body>
		<table align="center" bgcolor="#99FFCC" border="1" width="70%">
			<tr>
				<td colspan="2" align="center">User Details</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${name}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td><%=address%></td>
			</tr>
		</table>
</body>
</html>