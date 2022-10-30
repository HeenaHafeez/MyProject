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

	<form action="AssignSubject" method="get">
		<h3 align="center">Assign Subject with class</h3>

		<table align="center">
			<tr>
				<td><label>Subject Name</label></td>
				<td></td>
			</tr>
			<tr>
				<td align="center"><label>English</label></td>
				<td><input type="checkbox" name="sub" id="sub1" value="English">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>Hindi</label></td>
				<td><input type="checkbox" name="sub" id="sub2" value="Hindi">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>Maths(I)</label></td>
				<td><input type="checkbox" name="sub" id="sub3"
					value="Maths(I)">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>Sceince(I)</label></td>
				<td><input type="checkbox" name="sub" id="sub4"
					value="Sceince(I)">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>Sceince(II)</label></td>
				<td><input type="checkbox" name="sub" id="sub5"
					value="Sceince(II)">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>Marathi</label></td>
				<td><input type="checkbox" name="sub" id="sub6" value="Marathi">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>Maths(II)</label></td>
				<td><input type="checkbox" name="sub" id="sub7"
					value="Maths(II)">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><label>History</label></td>
				<td><input type="checkbox" name="sub" id="sub9" value="History">&nbsp;</td>
			</tr>
			<tr>
				<td>Class ID(STD)</td>
				<td><input type="text" name="class_id"></td>
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