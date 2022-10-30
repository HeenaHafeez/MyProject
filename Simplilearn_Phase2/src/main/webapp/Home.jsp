<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="azure">
	<h2 align="center">Welcome To Learner's Academy</h2>
	<%
	String admin_name = (String) session.getAttribute("Name");
	%>
	<h5 align="left" style="position: relative; top: 40px">
		Welcome
		<%=admin_name%></h5>
	<h5 align="right">
		<a href="AdminLogin.jsp">Logout</a>
	</h5>
	<hr color="Blue" size="6">
	<div align="center">

		<a href="AssignSubject.jsp">Assign Subject for all classes</a> <br>
		<a href="Teacher.jsp">Teacher Master Details</a> <br> <a
			href="Class.jsp">Class Master Details</a> <br> <a
			href="AssignTeacher.jsp">Assign Teacher for all classes</a> <br>
		<a href="ShowStudentData">View Master List of Students</a>
		<a href="ClassReport">View Class Report</a>
		
	</div>
</body>
</html>