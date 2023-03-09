<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>USING GET METHOD </h2>
	<br>
	<form action="checkUserGet" method="get">
		User Name: <input type="text" name="uname"><br>
		<br> <input type="Submit" name="Send"><br>
		<br>
	</form>
	<br><br>
	<h2>USING POST METHOD </h2>
	<br>
	<form action="checkUserPost" method="post">
		User Name: <input type="text" name="uname"><br>
		<br> <input type="Submit" name="Send"><br>
		<br>
	</form>
</body>
</html>