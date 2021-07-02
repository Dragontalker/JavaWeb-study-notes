<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1" 
    	 errorPage="/error500.jsp"
    	 import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
</body>
</html>