<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register page</title>
</head>
<body>

<form action="getUser">
Email id: <input type = "email" name = "email"  required/><br><br>
First Name: <input type = "text" name = "firstname" required/><br><br>
Last Name: <input type = "text" name = "lastname" required/><br><br>
Password: <input type = "password" name = "password" min="8" required/><br><br>

Gender : <br>

male:<input type = "radio" name = "gender" value= "male" /><br>
female: <input type = "radio" name = "gender" value= "female" /><br><br>
Date of Birth: <input type="date" name = "dob" required/><br><br>
Location <input type = "text" name="address" required/><br><br>
<input type="submit" value="register" /><br><br>
</form>

</body>
</html>