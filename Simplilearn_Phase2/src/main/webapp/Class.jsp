<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class Details</title>
</head>
<body bgcolor="azure">
<h2 align="center">Welcome To Learner's Academy</h2>
<%
	String admin_name=(String)session.getAttribute("Name");
%>
<h5 align="left" style="position:relative; top:40px">Welcome <%=admin_name %></h5>
<h5 align="right"><a href="AdminLogin.jsp">Logout</a></h5>
	<hr color="Blue" size="6">

   <%
	 String error = (String)request.getAttribute("Error");
	 if(error ==null)
	 {
		 error=" ";
	 }
	%>
	<font color="green">
	
	<%=error %>
	
	</font>
	<form action="ClassServlet" method="get">
		<h3 align="center">Save Class Details</h3>

		<table align="center">
			<tr align="center">
				<td>Class ID</td>
				<td><input type="text" name="class_id"></td>
			</tr>
			<tr>
				<td>Class Std</td>
				<td><input type="text" name="class_std"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" style="position:relative; top:10px; left:200%;"></td>
				<td><input type="reset" Value="Reset" style="position:relative; top:10px; left:5%;"></td>
			</tr>
		</table><br><br><br><br><br>
		<div align="center">
			<a href="Home.jsp">Go Back To Home Screen</a>
		</div>

	</form>

</body>
</html>