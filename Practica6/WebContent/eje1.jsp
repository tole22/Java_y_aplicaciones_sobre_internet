<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" import="java.util.Calendar"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<%@ page import = "java.sql.*, javax.naming.*, javax.sql.*" %>
<%
try {
Context ctx = new InitialContext();
Context con = (Context) ctx.lookup("java:/comp/env");
DataSource ds = (DataSource) con.lookup("jdbc/MySQLDS");
java.sql.Connection sqlc = ds.getConnection();
out.println("se conecto!!");
Statement st = sqlc.createStatement();
ResultSet rs= st.executeQuery("Select * from mensajes_pt_6");
rs.next();
%>
<h1>
<%if (Calendar.getInstance().get(Calendar.AM_PM) == Calendar.AM){ %>
	<%=rs.getString(2) %>
<%} else{%>
	<%=rs.getString(3) %>
<%} %>
</h1>

<h3>Hoy es: <%= Calendar.getInstance().getTime()  %></h3>
<% 

//while (rs.next()) {

rs.close(); st.close();
} catch (Exception e) {e.printStackTrace();}
%>
</body>
</html>