package misservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Encuesta
 */
@WebServlet("/Encuesta")
public class Encuesta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public int perro;
	public int gato;
	public int kamaleon;
	public int riquelme;
	public int mulita;
	public int tortuga;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Encuesta() {
        super();
        perro=gato=kamaleon=riquelme=mulita=tortuga=0;
         
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mascota = request.getParameter("mascota");
		if(mascota.equals("perro")){ perro++;}
		if(mascota.equals("gato")){ gato++;}
		if(mascota.equals("tortuga")){ tortuga++;}
		if(mascota.equals("kamaleon")){ kamaleon++;}
		if(mascota.equals("riquelme")){ riquelme++;}
		if(mascota.equals("mulita")){ mulita++;}
		
		 response.getWriter().println("<h1>perro " + perro +"</h1>");
		 response.getWriter().println("<h1>gato " + gato +"</h1>");
		 response.getWriter().println("<h1>tortuga " + tortuga +"</h1>");
		 response.getWriter().println("<h1>kamaleon " + kamaleon +"</h1>");
		 response.getWriter().println("<h1>riquelme " + riquelme +"</h1>");
		 response.getWriter().println("<h1>mulita " + mulita +"</h1>");
		 
		 
		 response.setContentType("text/html");
		 response.getWriter().println("<br><br><br>");
		response.getWriter().println("<a href='mascotas.html'>VOLVER A MASCOTAS</a>");
	}

}
