package misServlets;

import java.util.Hashtable;
import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginUser
 */

public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Hashtable<String, String> logins = new Hashtable<String, String>();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {		 
		 logins.put("agustin", "tiki");
		 logins.put("maxi", "tolebala");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
        
		
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		String nomyape = request.getParameter("nomyape");
		String direccion = request.getParameter("direccion");
				
		if(usuario != "" && clave != "" && nomyape != "" && direccion != ""){		
			if(logins.get(usuario).equals(clave)){
				HttpSession sesion = request.getSession(true);
				
				sesion.setAttribute("usuario", usuario);
				sesion.setAttribute("clave", clave);
				sesion.setAttribute("nomyape", nomyape);
				sesion.setAttribute("direccion", direccion);
				response.sendRedirect("Productos");
				return;
			}							
		}
		response.sendRedirect("login.html");
	}

}
