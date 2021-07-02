<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="com.dragontalker.pojo.Student"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Exercise 2</title>
		<style type="text/css">
			table {
				border: 1px black solid;
				width: 600px;
				border-collapse: collapse;
			}
			td, th{
				text-align: center;
				border: 1px black solid;
			}
		</style>
	</head>
	
	<body>
		<%-- 练习二: jsp输出一个表格, 内含10个学生的信息 --%>
		
		<%
			
		%>
		
		<table>
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>电话</td>
				<td>操作</td>
			</tr>
		<%
			for (Student student : studentList) { %>
				<tr>
					<td><%=student.getId() %></td>
					<td><%=student.getName() %></td>
					<td><%=student.getAge() %></td>
					<td><%=student.getPhone() %></td>
					<td> 修改 / 删除 </td>
				</tr>
		<%	} %>
		</table>
	</body>
</html>