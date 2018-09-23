package misServlets3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

/**
 * Servlet implementation class Controla
 */
@WebServlet("/Controla")
public class Controla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controla() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String selec = request.getParameter("selecc");
		String name = request.getParameter("nombre");
		
	
		if(selec==null || name.equals("")){
			response.sendRedirect("inicio.html");
		}else{
			switch ( selec ) {
		      case "serv_hola":
		    	  response.sendRedirect("/misServlets/Bienvenida?nombre="+name);
		           break;
		      case "serv_productos":
		    	  response.sendRedirect("/compras/login.html");
		    	  /*ServletContext ctx=this.getServletContext();
		    	  RequestDispatcher dispatcher=ctx.getRequestDispatcher("/login.html");
		    	  if (dispatcher!=null) dispatcher.forward(request,response);
		    	  */
		           break;
		      case "google":
		    	  response.sendRedirect("http://www.google.com.ar");
		           break;
		      }
		}
	}

}
