<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body bgcolor="azure">
	<h2 align="center">Welcome To Learner's Academy</h2>
	<hr color="Blue" size="6">
	<%
	String error = (String) request.getAttribute("Error");
	if (error == null) {
		error = " ";
	}
	%>
	<font color="red"> <%=error%>

	</font>
	<form action="AdminController" method="post">

		<table align="center">
			<tr align="center">
				<td>User ID</td>
				<td><input type="text" name="UserId"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"
					style="position: relative; top: 10px; left: 200%;"></td>
				<td><input type="reset" Value="Reset"
					style="position: relative; top: 10px; left: 5%;"></td>
			</tr>
		</table>

	</form>

</body>
</html>