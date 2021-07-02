<%@page import="java.util.*"%>
<%@page import="com.dragontalker.pojo.Person"%>
<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>c.jsp</title>
	</head>
	
	<body>
		<%
			Person person = new Person();
			person.setName("国哥好帅");
			person.setPhone(new String[]{"18610541354", "18688886666", "18699997888"});
			
			List<String> cities = new ArrayList<String>();
			cities.add("北京");
			cities.add("上海");
			cities.add("深证");
			person.setCities(cities);
			
			Map<String, String> map = new HashMap<>();
			map.put("key1", "value1");
			map.put("key2", "value2");
			map.put("key3", "value3");
			person.setMap(map);
			
			pageContext.setAttribute("person", person);
		%>
		
		<br>
		
		输出Person: ${ person.name }
		
		<br>
		
		${ person.map }
		
		<br>
		
		${ person.phone[2] }
		
		<br>
		
		${ person.cities }
	</body>
</html>