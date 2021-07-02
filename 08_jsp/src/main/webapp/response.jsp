<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>response.jsp 页面</h1>
	<hr>
	<br>
	<br>
	
	<%
		out.write("out输出1: <br>");
		out.write("out输出2: <br>");
		
		response.getWriter().write("resposne输出1: <br>");
		response.getWriter().write("resposne输出2: <br>");
		
	%>
</body>
</html>