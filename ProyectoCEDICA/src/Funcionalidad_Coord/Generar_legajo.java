package Funcionalidad_Coord;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Generar_legajo
 */
@WebServlet("/Generar_legajo")
public class Generar_legajo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Generar_legajo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String alu = request.getParameter("alumno");
		String param = request.getParameter("param");
		
		
		if(param.equals("familiar")){
			
			response.setContentType("text/html");
			response.getWriter().print("<html>");
			response.getWriter().print("<head>");
			response.getWriter().print("<meta charset='ISO-8859-1'>"+
			"<title>Legajos </title>"+
			"<LINK href='css/style.css' rel='stylesheet' type='text/css'>");
			response.getWriter().print("</head>");
			response.getWriter().print("<body>");
			response.getWriter().print("<div class='cuerpo_index'>");
			response.getWriter().print("<img alt='CEDICA' src='./imagenes/CEDICA.png' width='25%'/>");
			response.getWriter().print("<div class='div-amarillo'><h1>Maximiliano Toledo</h1>");
			response.getWriter().print("</div>");
			response.getWriter().print("<div class='texto-negrita'>");
			response.getWriter().println("Fecha de ingreso a CEDICA:12/1/2014<br>");
			response.getWriter().println("Sede:HLP<br>");
			response.getWriter().print("<p style='text-decoration:underline;'>Datos Personales del Alumno</p>");
			response.getWriter().println("DNI:36365588");
			response.getWriter().println("Fecha Nacimiento: 21/6/1991 <br>");
			response.getWriter().println("Lugar de nacimiento (localidad y provincia): City Bell <br>Domicilio (calle, nro, dpto. y piso): 460 esq 12 b <br>Teléfono:4721064<br>Diagnóstico: Bueno<br>Obra Social:PAMI");
			response.getWriter().print("<p style='text-decoration:underline;'>DATOS PERSONALES DE FAMILIARES / TUTORES</p>");
			response.getWriter().print("Nombre de la madre: Ana<br> DNI:15336655<br>Actividad: Ama de casa <br> Dirección:460 esq 12b<br>Teléfono móvil:4721064<br>Correo electrónico:anatoledo@hotmail.com");
			response.getWriter().print("Nombre del padre: Carlos<br> DNI:15336655<br>Actividad: Ingeniero <br> Dirección:460 esq 12b<br>Teléfono móvil:4721064<br>Correo electrónico:carlostoledo@hotmail.com");
			response.getWriter().print("</div>");
			response.getWriter().print("<a href='coordinador/backend-coord.html'><h3>Volver</h3></a>");
			response.getWriter().print("</div>");
			response.getWriter().print("</body>");
			response.getWriter().print("</html>");
			
		}else{
			response.setContentType("text/html");
			response.getWriter().print("<html>");
			response.getWriter().print("<head>");
			response.getWriter().print("<meta charset='ISO-8859-1'>"+
			"<title>Legajos </title>"+
			"<LINK href='css/style.css' rel='stylesheet' type='text/css'>");
			response.getWriter().print("</head>");
			response.getWriter().print("<body>");
			response.getWriter().print("<div class='cuerpo_index'>");
			response.getWriter().print("<img alt='CEDICA' src='./imagenes/CEDICA.png' width='25%'/>");
			response.getWriter().print("<div class='div-amarillo'><h1>Maximiliano Toledo</h1>");
			response.getWriter().print("</div>");
			response.getWriter().print("<div class='texto-negrita'>");
			response.getWriter().println("Fecha de ingreso a CEDICA:12/1/2014<br>");
			response.getWriter().println("Sede:HLP<br>");
			
			response.getWriter().print("<p style='text-decoration:underline;'>Datos Personales del Alumno</p>");
			response.getWriter().println("DNI:36365588");
			response.getWriter().println("Fecha Nacimiento: 21/6/1991 <br>");
			response.getWriter().println("Lugar de nacimiento (localidad y provincia): City Bell <br>Domicilio (calle, nro, dpto. y piso): 460 esq 12 b <br>Teléfono:4721064<br>Diagnóstico: Bueno<br>Obra Social:PAMI");
			response.getWriter().print("<p style='text-decoration:underline;'>DATOS DE LA INSTITUCIÓN</p>");
			response.getWriter().print("Nombre: Cedica <br> Dirección (calle, nro, dpto. y piso): 120 y 50<br>Teléfono:4217788<br>Correo electrónico:cedica@hotmail.com<br>Referente:Cedica Junior<br>Director: Enzo Toledo");
			response.getWriter().print("<p style='text-decoration:underline;'>DATOS PERSONALES DE FAMILIARES / TUTORES</p>");
			response.getWriter().print("Nombre de la madre: Ana<br> DNI:15336655<br>Actividad: Ama de casa <br> Dirección:460 esq 12b<br>Teléfono móvil:4721064<br>Correo electrónico:anatoledo@hotmail.com");
			response.getWriter().print("Nombre del padre: Carlos<br> DNI:15336655<br>Actividad: Ingeniero <br> Dirección:460 esq 12b<br>Teléfono móvil:4721064<br>Correo electrónico:carlostoledo@hotmail.com");
			response.getWriter().print("</div>");
			response.getWriter().print("<a href='coordinador/backend-coord.html'><h3>Volver</h3></a>");
			response.getWriter().print("</div>");
			response.getWriter().print("</body>");
			response.getWriter().print("</html>");
			
		}
		
		
	}

}
