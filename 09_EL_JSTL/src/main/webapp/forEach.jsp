<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="java.util.*"%> 
<%@ page import="com.dragontalker.pojo.Student"%> 
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>forEach.jsp</title>
		<style type="text/css">
			table {
				width: 500px;
				border: 1px solid black;
				border-collapse: collapse;
			}
			th, td {
				text-align: center;
				border: 1px solid black;
			}
		</style>
	</head>
	
	<body>
		<%-- 1. 遍历1到10, 输出 
			begin属性设置开始的索引
			end属性设置结束的索引
			var属性表示循环的变量
			
			for (int i = 0; i < 10; i++)
		--%>
		<table>
			<c:forEach begin="1" end="10" var="i">
				<tr>
					<td>第${ i }行</td>
				</tr>
			</c:forEach>
		</table>
		
		<hr>
		
		<%-- 2. 遍历objet数组 
		
				items表示遍历的数据源(遍历的集合)
		--%>
		<%
			request.setAttribute("arr", new String[]{"18610541354", "91869999888", "1866668888"});
		%>
		<c:forEach items="${ requestScope.arr }" var="item">
			${ item }<br>
		</c:forEach>
		
		<hr>
		
		<%-- 3. 遍历map --%>
		<%
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("key1", "value1");
			map.put("key2", "value2");
			map.put("key3", "value3");
			
			request.setAttribute("map", map);
		%>
		<c:forEach items="${ requestScope.map }" var="entry">
			<h1>${ entry.key } === ${ entry.value }</h1><br>
		</c:forEach>
		
		<hr>
		
		<%-- 4. 遍历list集合 --%>
		<%
			List<Student> studentList = new ArrayList<Student>();
		
			for (int i = 0; i < 10; i++) {
				int t = i + 1;
				studentList.add(new Student(t, "userName_" + t, "password_" + i, 18 + i, "phone_" + i));
			}
			
			request.setAttribute("students", studentList);
		%>
		<table>
			<tr>
				<th>编号</th>
				<th>用户名</th>
				<th>密码</th>
				<th>年龄</th>
				<th>电话</th>
				<th>操作</th>
			</tr>
			<c:forEach begin="2"  end="7" step="2" varStatus="status"
			items="${ requestScope.students }" var="student">
				<tr>
					<td>${ student.id }</td>
					<td>${ student.username }</td>
					<td>${ student.password }</td>
					<td>${ student.age }</td>
					<td>${ student.phone }</td>
					<td>${ status.current }</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>