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
		<form action="ClassReport" method="get">
			<label for="class-names">Choose class name:</label> <select
				name="class-name" id="class-names">
				<option value="Vth Standard">Vth Standard</option>
				<option value="6">VIth Standard</option>
				<option value="7">VIIth Standard</option>
				<option value="8">VIIIth Standard</option>
				<option value="9">IX Standard</option>
				<option value="10">X Standard</option>
			</select>
            <input type="submit" value="Get Data">
		</form>



	</div>
</body>
</html>