<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %>
   <%@ page import="java.util.List" %>
   <%@ page import="model.ItemsPresupuesto" %> 
   <%@ page import="access.FactoryDAO" %>
   
   <%@ page import="access.MySqlJPAFactoryDAO" %>
   <%@ page import="javax.persistence.*" %>
 
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Presupuesto</title>
</head>
<body>
<h3>Presupuestos online de fiestas de casamiento</h3>
<%
FactoryDAO fDAO = new FactoryDAO().getFactory();

List<ItemsPresupuesto> item = (List<ItemsPresupuesto>) fDAO.getItemsPresupuestoDAO().listar();

%>
Seleccione los items e ingrese la cantidad de items deseada: 
<form action="GenerarPresupuesto" method="post">
<table border='1' style='width:300px'>
	<tr>
	<th>Item</th>
	<th>Precio</th>
	<th>Cantidad</th>
	</tr>
<%
for (ItemsPresupuesto items : item) {
	%>
	<tr>
	<th><%= items.getDescripcion() %> </th>
	<th>$<%= items.getPrecio() %> </th>
	<th><input type="text" name="<%= items.getId() %>" value="0" size="5" /><% if( items.getCompra_por_cantidad().equals("no")){%>0=NO 1=SI<% }else{%>Ingrese cantidad<% } %></th>
	</tr>
	<% 
}
%>
</table>
<br>
<h3>Ingrese su nombre y email</h3>
Nombre:<input type="text" name="nombre"  size="15" /><br>
Email:<input type="text" name="email"  size="15" /><br><br>
<input type="submit" value="Enviar"> 
</form>
</body>
</html>