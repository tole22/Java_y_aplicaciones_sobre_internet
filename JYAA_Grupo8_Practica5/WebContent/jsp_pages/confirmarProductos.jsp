<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 int cant=(Integer)session.getAttribute("cantProductos");

for(int i=1;i<=cant;i++){
	String p = (String)request.getParameter("cant_golo"+i);
	session.setAttribute("cant_a_comprar_golo"+i, p  );	
}
%>
<h3>Su compra será:</h3>
<% for(int i=1;i<=cant;i++){
		
			if(!session.getAttribute("cant_a_comprar_golo"+i).equals("0") && !session.getAttribute("cant_a_comprar_golo"+i).equals("")){
			%>
			Golosina:
			<%= session.getAttribute("golo"+i) %>;Cantidad:
			<%= session.getAttribute("cant_a_comprar_golo"+i) %>
			<br>
			<%
			}
} %>
<h2><a href="/Practica5/jsp_pages/Facturar.jsp">Continuar con la compra</a></h2>
<h2><a href="/Practica5/jsp_pages/Productos.jsp">Regresar a Seleccionar Productos</a></h2>
<h2><a href="/Practica5/TerminarSesion">Cancelar la compra</a></h2>
</body>
</html>