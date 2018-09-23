<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Calendar "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>
			<%if (Calendar.getInstance().get(Calendar.AM_PM) == Calendar.AM){ %>
				<%= config.getInitParameter("AM") %>
			<%} else{%>
				<%= config.getInitParameter("PM") %>
			<%} %>
		</h1>
		
		<h3>Hoy es: <%= Calendar.getInstance().getTime()  %></h3>
	</body>
</html>