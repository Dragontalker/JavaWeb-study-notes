<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="com.dragontalker.pojo.Student"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Exercise 2</title>
	</head>
	
	<body>
		<%-- 练习二: jsp输出一个表格, 内含10个学生的信息 --%>
		
		<%
			List<Student> studentList = new ArrayList<Student>();
			for (int i = 0; i < 10; i++) {
				int t = i + 1;
				studentList.add(new Student(t, "name_" + t, age = 18 + t, "phone_" + t));
			}
		%>
		
	</body>
</html>