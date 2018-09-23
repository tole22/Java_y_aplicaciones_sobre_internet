<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Hashtable" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>table,th,td{border:1px solid black;border-collapse:collapse;}th,td{padding:5px;}</style>
<title>Productos</title>
</head>
<body>
	<h3>
<%
	
	String mensaje = (String) session.getAttribute("usuario");
	if(mensaje != null){
%>
		Canasta de compras de: 
		<%= mensaje %>
<%
	}
%>
	</h3>
<%


Hashtable<String,String> productos = (Hashtable<String,String>) application.getAttribute("catalogo_stock");


int n = productos.size();
n= n/3;

//PREGUNTO SI ESTAN LOS PRODUCTOS CARGADOS EN LA SESION

if(session.getAttribute("cantProductos")==null){
	//cant productos en la sesion
	session.setAttribute("cantProductos",n);
	
	//guardo los productos en la sesion con la cantidad comprada en 0
	for(int i=1;i<=n;i++){
		session.setAttribute("golo"+i, productos.get("golo"+i));
		session.setAttribute("pu"+i, productos.get("pu"+i));
		session.setAttribute("cantCompra"+i, 0);
			
	}
}

%>
<h2>Seleccione los Productos</h2>


<form method='POST' action='confirmarProductos.jsp'>

<table border='1' style='width:300px'>
	      <tr>
			  <th>Nombre Producto</th>
			  <th>Precio Unitario</th>
			  <th>Stock Disponible</th>
			  <th>Cantidad a Comprar</th>
		  </tr>
<% 		  
for(int i=1;i<=n;i++){
%>	
			<tr>
			  <td><%= productos.get("golo"+i) %></td>
			  <td><%= productos.get("pu"+i) %></td>
			  <td><%= productos.get("cant"+i) %></td>
			  <%
			  String cant;
			  if(session.getAttribute("cant_a_comprar_golo"+i) !=null){
				  cant= session.getAttribute("cant_a_comprar_golo"+i).toString();
			  }else{
				  cant="0";
			  }
			  %>
			  <td><input type='text' size='8' name="cant_golo<%= i %>" value="<%= cant %>" /></td>
			</tr>
<%			  
}
%>
</table>

<input type="submit" value="Confirmar">
</form>
<br> <a href='/Practica5/TerminarSesion'>Salir</a>

</body>
</html>