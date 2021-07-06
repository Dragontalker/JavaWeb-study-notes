<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login.jsp</title>
</head>
<body>
	This is login.jsp.
	<form action="http://localhost:8080/15_filter/loginServlet" method="GET">
		User Name: <input type="text" name="username" /> <br>
		Password: <input type="password" name="password" /> <br>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>