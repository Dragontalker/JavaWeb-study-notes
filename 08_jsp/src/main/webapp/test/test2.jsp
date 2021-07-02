<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="com.dragontalker.pojo.Student"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Exercise 2</title>
		<style type="text/css">
			table {
				border: 1px red solid;
				width: 600px;
				border-collapse: collapse;
			}
			td, th{
				border: 1px red solid;
			}
		</style>
	</head>
	
	<body>
		<%-- 练习二: jsp输出一个表格, 内含10个学生的信息 --%>
		
		<%
			List<Student> studentList = new ArrayList<Student>();
			for (int i = 0; i < 10; i++) {
				int t = i + 1;
				studentList.add(new Student(t, "name_" + t, 18 + t, "phone_" + t));
			}
		%>
		
		<table>
		<%
			for (Student student : studentList) { %>
				<tr>
					<td><%=student.getId() %></td>
					<td><%=student.getName() %></td>
					<td><%=student.getAge() %></td>
					<td><%=student.getPhone() %></td>
				</tr>
		<%	} %>
		</table>
	</body>
</html>