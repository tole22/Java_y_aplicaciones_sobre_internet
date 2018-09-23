package misservlets.practica2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import java.util.Hashtable;

/**
 * Servlet implementation class Productos
 */
@WebServlet("/Productos")
public class Productos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Hashtable<String, String> productos = new Hashtable<String, String>();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Productos() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException{
    	
    	
		productos.put("golo1", "Chupetin");
		productos.put("pu1", "2");
		productos.put("cant1", "800");
		productos.put("golo2", "chocolate");
		productos.put("pu2", "10");
		productos.put("cant2", "200");
		productos.put("golo3", "Turron");
		productos.put("pu3", "7");
		productos.put("cant3", "400");
		
		
		
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(true);
		int n = productos.size();
		n= n/3;
		
		//PREGUNTO SI ESTAN LOS PRODUCTOS CARGADOS EN LA SESION
		
		if(sesion.getAttribute("cantProductos")==null){
				//cant productos en la sesion
				sesion.setAttribute("cantProductos",n);
				
				//guardo los productos en la sesion con la cantidad comprada en 0
				for(int i=1;i<=n;i++){
					sesion.setAttribute("golo"+i, productos.get("golo"+i));
					sesion.setAttribute("pu"+i, productos.get("pu"+i));
					sesion.setAttribute("cantCompra"+i, 0);
					
				}
		}
	
		response.setContentType("text/html");
		response.getWriter().println("<h2>Seleccione los Productos</h2>");
		response.getWriter().println("<html>"
				+ "<head>"
				+ " <style>table,th,td{border:1px solid black;border-collapse:collapse;}th,td{padding:5px;}</style>"+
				"</head>"+ "<body>"+
				"<table style='width:300px'><tr>");
		
		
		//FORMULARIO
		response.getWriter().print("<form method='POST' action=Facturar>");
		
		response.getWriter().println("<table border='1' style='width:300px'/>"+
			      "<tr>"+
				  "<th>Nombre Producto</th>"+
				  "<th>Precio Unitario</th>"+
				  "<th>Stock Disponible</th>"+
				  "<th>Cantidad a Comprar</th>"+
				  "</tr>");
		for(int i=1;i<=n;i++){
			response.getWriter().println("<tr>"+
					  "<td>"+productos.get("golo"+i)+"</td>"+
					  "<td>"+productos.get("pu"+i)+"</td>"+
					  "<td>"+productos.get("cant"+i)+"</td>"+
					  "<td><input type='text' size='8' name='prod' value='0'></td>"+
					  "</tr>");
		}
		response.getWriter().print("</table>");
		response.getWriter().print("<input type='submit' value='FACTURAR'>");
		//FIN FORM
		response.getWriter().print("</form>");
		
		response.getWriter().println("<br> <a href='TerminarSesion'><h4>Salir</h4></a>");
		/*response.getWriter().println("");
		response.getWriter().println("");
		response.getWriter().println("");*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
