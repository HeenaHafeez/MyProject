<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
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
	<h4 align="center">Student Assigned Details</h4>
	<div align="center">
		<form action="ShowStudent" method="get">
			<table border="2px">
				<tr>
					<td>Student ID</td>
					<td>Student Name</td>
					<td>Class Name</td>
				</tr>
				<%
					Iterator itr;
				%>
				<%
					List data = (List) request.getAttribute("data");
					for(itr=data.iterator();itr.hasNext();)
					{
				%>
				<tr>

					<td><span><%=itr.next()%></span></td>
					<td><span><%=itr.next()%></span></td>
					<td><span><%=itr.next()%></span></td>
				</tr>
				<%} %>

			</table>
			<br>
		<br>
		<br>
		<br>
		<br>
		<div align="center">
			<a href="Home.jsp">Go Back To Home Screen</a>
		</div>
			

		</form>



	</div>
</body>
</html>