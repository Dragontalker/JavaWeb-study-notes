<%@page import="org.eclipse.jdt.internal.compiler.parser.RecoveredRequiresStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>a.jsp</title>
</head>
<body>
	<%
		System.out.println("a.jsp executed...");
		Object user = session.getAttribute("user");
	
		if (user == null) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
	%>
	This is a.jsp.
</body>
</html>