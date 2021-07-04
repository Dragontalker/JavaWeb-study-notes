<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<title>Login</title>
	</head>
	
	<body>
		<form action="http://localhost:8080/13_cookie/loginServlet" method="GET">
			用户名: <input type="text" name="username" value="${ cookie.username.value }"><br>
			密码: <input type="password" name="password" id=""><br>
			<input type="submit" value="登录" >
		</form>
	</body>

</html>