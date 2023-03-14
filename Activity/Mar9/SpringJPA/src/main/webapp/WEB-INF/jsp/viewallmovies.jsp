<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>View All Movies</h2>
	<a href="viewmoviebylaguage?lang=English">English</a>
	<br>
	<a href="viewmoviebylaguage?lang=Hindi">Hindi</a>
	<br>
	<a href="viewmoviebylaguage?lang=Others">Others</a>
	<br>

	<table border-color="#96D4D4" border="1px">
		<tr>
			<th>Movie Name</th>
			<th>Director</th>
			<th>Language</th>
			<th>Edit</th>
			<th>Delete</th>
		<tr>
			<c:forEach items="${movies}" var="m">
				<tr>
					<td>${m.movieName}</td>
					<td>${m.director}</td>
					<td>${m.language}</td>
					<td><a href = "editMovie?id=${m.movieId}">Edit</a></td>
					<td><a href = "deleteMovie?id=${m.movieId}">Delete</a></td>
				</tr>
			</c:forEach>
	</table>
	______________
	<p>${movies}</p>
	__________

</body>
</html>