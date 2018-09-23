<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contador de Visitas</title>
</head>
<body>
<h1> Bienvenido al Contador de Visitas </h1>
<%! private int contPag=0;
	public void addCont(){ 
		contPag++;
	}
%>
<% addCont();%>
<p>Esta página la visitaron: <%=contPag %> usuarios</p>
</body>
</html>