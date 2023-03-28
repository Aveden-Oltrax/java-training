<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="register-user" method="post">
		Email ID: <input type="email" name="uname"> <br> <br>
		First Name: <input type="text" name="fname"> <br> <br>
		Last Name: <input type="text" name="lname"> <br> <br>
		Password: <input type="password" name="password"> <br> <br>
		Gender: <br>
		<input type="radio" id="Male" name="gender" value="Male">
        <label for="Male">Male</label>
        <br> 
        <input type="radio" id="Female" name="gender" value="Female"> 
        <label for="Female">Female</label><br> <br>
        <br> 
		
		<label for="date-input">Date Of Birth: </label> <input type="date" id="date-input" name="date-input"> <br> <br>
		
		Location: <input type="text" name="location"> <br> <br> 
		<input type="submit" value="Register">

	</form>

</body>
</html>