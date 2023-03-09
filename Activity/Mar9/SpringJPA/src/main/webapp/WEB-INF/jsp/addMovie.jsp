<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>ADD NEW MOVIE</h1>

	<form action="insertMovie" method="post">

		Movie Name: <input type="text" name="mname"><br> <br>

		Movie director: <input type="text" name="dir"><br> <br>

		Language: <select name="lang">
			<option value="English">English</option>
			<option value="Hindi">Hindi</option>
			<option value="Others">Others</option>
		</select><br>
		<br> <input type="submit" value="Insert Movie">
	</form>
</body>
</html>