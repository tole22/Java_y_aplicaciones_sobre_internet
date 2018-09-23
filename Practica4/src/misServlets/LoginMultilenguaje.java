package misServlets;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginMultilenguaje
 */

public class LoginMultilenguaje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginMultilenguaje() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getAttribute("idiom") != null){
		String idioma = (String) request.getAttribute("idiom");
		switch (idioma){
		case"es":{
			imprimir_pagina_español(response);
			break;
		}
		case"en":{
			imprimir_pagina_ingles();
			break;
		}
		}
		}else{
			System.out.println("No se recibio el idioma");
		}
	}

	private void imprimir_pagina_ingles() {
		System.out.println("se imprimira en ingles");
		
	}

	private void imprimir_pagina_español( HttpServletResponse response) {
		System.out.println("se imprimira en español");
		File f = new File( "C:\\texto_es.properties");
		BufferedReader entrada;
		try {
		entrada = new BufferedReader( new FileReader( f ) );
		String linea;
		
		linea = entrada.readLine();
		
		response.setContentType("text/html");
		response.getWriter().print("<html>");
		response.getWriter().print("<head>");
		response.getWriter().print("<meta charset='ISO-8859-1'>"+
		"<title>"+ linea.substring(4,linea.length()) +"</title>");
		response.getWriter().print("</head>");
		response.getWriter().print("<body>");
		linea = entrada.readLine();
		response.getWriter().print(linea.substring(4,linea.length()));
		response.getWriter().print("<input type='text' /><br>");
		linea = entrada.readLine();
		response.getWriter().print(linea.substring(4,linea.length()));
		response.getWriter().print("<input type='text' /><br>");
		linea = entrada.readLine();
		response.getWriter().print("<input type='submit' value='"+linea.substring(4,linea.length())+"' /><br>");
		response.getWriter().print("</body>");
		response.getWriter().print("</html>");
		
		}catch (IOException e) {
		e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
