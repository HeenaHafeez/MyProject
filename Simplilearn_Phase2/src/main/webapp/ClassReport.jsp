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
	<%
	String name;
	name = request.getParameter("class-name");
	%>
	<div align="center">
		<label for="class-names">Choose class name:</label> <select
			name="classname">
			<option value="class"><%=name%></option>
		</select>

	</div>
	<h4 align="center">Class Report</h4>
	<div align="center">
		<form action="ClassReport" method="get">
			<table border="2px">
				<tr>
					<td>Student Name</td>
					<td>Class Name</td>
					<td>Teacher Name</td>
					<td>Subject Name
					<td>
				</tr>
				<%
				Iterator itr;
				%>
				<%
				List data = (List) request.getAttribute("data");
				for (itr = data.iterator(); itr.hasNext();) {
				%>
				<tr>

					<td><span><%=itr.next()%></span></td>
					<td><span><%=itr.next()%></span></td>
					<td><span><%=itr.next()%></span></td>
					<td><span><%=itr.next()%></span></td>
				</tr>
				<%
				}
				%>

			</table>
			<br> <br> <br> <br> <br>
			<div align="center">
				<a href="Home.jsp">Go Back To Home Screen</a>
			</div>


		</form>



	</div>
</body>
</html>