<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercise 1</title>
</head>
<body>
	<%-- 练习一: 在jsp页面中输出九九乘法口诀表 --%>
	
	<%
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				%>
				<%= i + " x " + j + " = " + (i * j) %>
	<%		
			}
		}
	%>
</body>
</html>