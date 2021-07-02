<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Exercise 1</title>
		<style type="text/css">
			table {
				width: 700px;
			}
		</style>
	</head>
	
	<body>
		<%-- 练习一: 在jsp页面中输出九九乘法口诀表 --%>
		<h1 align="center">九九乘法口诀表</h1>
		<hr>
		<br>
		
		<table align="center">
			<% for (int i = 1; i <= 9; i++) { %>
				<tr>
				<% for (int j = 1; j <= i; j++) { %>
					<td><%= j + " x " + i + " = " + (i * j) %></td>		
				<%	} %>
				</tr>
			<% } %>
		</table>
	</body>
</html>