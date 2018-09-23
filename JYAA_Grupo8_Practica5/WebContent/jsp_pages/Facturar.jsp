<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facturar</title>
</head>
<body>

<% int cant=(Integer)session.getAttribute("cantProductos");%>
<h3>Su compra es:</h3>
<table border='1' style='width:300px'>
	      <tr>
			  <th>Nombre Producto</th>
			  <th>Precio Unitario</th>
			  <th>Cantidad</th>
			  <th>Precio Total</th>
		  </tr>
<% 
int total = 0;
for(int i=1;i<=cant;i++){
	if(!session.getAttribute("cant_a_comprar_golo"+i).equals("0") && !session.getAttribute("cant_a_comprar_golo"+i).equals("")){
%>		
	<tr>
	  <td><%= session.getAttribute("golo"+i) %></td>
	  <td><%= session.getAttribute("pu"+i) %></td>
	  <td><%= session.getAttribute("cant_a_comprar_golo"+i) %></td>
	  <% int c= Integer.parseInt(session.getAttribute("cant_a_comprar_golo"+i).toString());
	  int p=Integer.parseInt(session.getAttribute("pu"+i).toString());
	  total= total + (c*p);
	  %>
	 <td> <%= c*p %></td>
	</tr>
			
			<%
			}
} %>
</table>
<h3>Precio Total de la compra:<%= total%></h3>
<h2><a href="/Practica5/TerminarSesion">Finalizar Compra y Salir</a></h2>
</body>
</html>