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
	String error = (String) request.getAttribute("Error");
	if (error == null) {
		error = " ";
	}
	%>
	<font color="green"> <%=error%>
	</font>

	<form action="Teacher" method="get">
		<h3 align="center">Assign Teacher with class</h3>

		<table align="center">
			<tr>
				<td><label>Class Name</label></td>
				<td></td>
			</tr>
			<tr>
				<td align="center"><label>V STD</label></td>
				<td><input type="checkbox" name="class_id" id="sub1"
					value="V STD">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>VI STD</label></td>
				<td><input type="checkbox" name="class_id" id="class_id"
					value="VI STD">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>VII STD</label></td>
				<td><input type="checkbox" name="class_id" id="class_id"
					value="VII STD">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>VIII STD</label></td>
				<td><input type="checkbox" name="class_id" id="class_id"
					value="VIII STD">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>IX STD</label></td>
				<td><input type="checkbox" name="class_id" id="class_id"
					value="IX STD">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>X STD</label></td>
				<td><input type="checkbox" name="class_id" id="class_id"
					value="X STD">&nbsp;</td>
			</tr>

			<tr>
				<td>Teacher Name</td>
				<td><input type="text" name="teach_name"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"
					style="position: relative; top: 10px; left: 180%;"></td>
				<td><input type="reset" Value="Reset"
					style="position: relative; top: 10px; left: 5%;"></td>
			</tr>

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

</body>
</html>