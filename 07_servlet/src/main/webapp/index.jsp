<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<form action="http://localhost:8080/07_servlet/parameterServlet" method="GET">
		User Name: <input type="text" name="username">
		
		<br>
		
		Password: <input type="password" name="password">
		
		<br>
		
		Hobbies: <input type="checkbox" name="hobby" value="cpp">C++
		<input type="checkbox" name="hobby" value="java">Java
		<input type="checkbox" name="hobby" value="js">JavaScript 
		
		<br>
		
		<input type="submit" value="Submit">
	
	</form>
</body>
</html>