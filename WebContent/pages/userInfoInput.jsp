<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input user info</title>
</head>
<body>
	<form action="/SportsStore/SaveUserInfoServlet" method="POST">
		<table align="center" bgcolor="#99FFCC" border="1" width="70%">
			<tr>
				<td colspan="2" align="center">User Details</td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" maxlength="25"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" maxlength="40"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit"		value="Submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>