<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8" 
    	 errorPage="/error500.jsp"
    	 import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		private Integer id;
		private String name;
		private static Map<String, Object> map;
	%>
	
	<%!
		static {
			map = new HashMap<String, Object>();
			map.put("key1", "value1");
			map.put("key2", "value2");
			map.put("key3", "value3");
		}
	%>
	
	<%!
		public int abc() {
			return 12;
		}
	%>
	
	<%=12  %>
	<%=12.12  %>
	<%="我是字符串"  %>
	<%=request.getAttribute("username")  %>
	
	<%
		int i =12;
		if (i == 12) {
			out.println("国哥好帅!");
		} else {
			out.println("国哥又骗人了!");
		}
	%>
	
	<%
		for (int j = 0; j < 10; j++) {
			out.println("#" + j);
		}
	%>
</body>
</html>