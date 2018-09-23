<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido a Compras - Login</title>
</head>
<body>
	<h1>Bienvenido a Compras</h1><br>	
	<h2>Ingrese sus datos</h2>
	<form action="/Practica5/LoginUser" method="post">
		<label>Nombre y Apellido</label><input type="text" name="nomyape"/>
		<label>Dirección</label><input type="text" name="direccion"/>
		<label>Usuario</label><input type="text" name="usuario"/>
		<label>Clave</label><input type="password" name="clave"/>		
		<input type="submit" value="Acceder"> 
	</form>
	<%
	String mensaje = request.getParameter("msj");
	if(mensaje != null){
	%>
	<p style="color : red">	<%= mensaje %></p>
	<%} %>
</body>
</html>