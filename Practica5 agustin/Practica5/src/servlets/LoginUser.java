package servlets;

import java.util.Hashtable;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import listeners.InicializaUsuarios;

/**
 * Servlet implementation class LoginUser
 */

public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
       
    
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		String nomyape = request.getParameter("nomyape");
		String direccion = request.getParameter("direccion");
		try{		
			if(usuario != "" && clave != "" && nomyape != "" && direccion != ""){	
				
				HttpSession sesion = request.getSession(true);
				
				Hashtable<String, String> login = InicializaUsuarios.getLogins(); 
				response.setContentType("text/html");
				/*response.getWriter().println(login.size());		
				response.getWriter().println(sesion.getId());	*/					
				if (login.size() != 0  && login.get(usuario).equals(clave)){				
					sesion.setAttribute("usuario", usuario);
					sesion.setAttribute("clave", clave);
					sesion.setAttribute("nomyape", nomyape);
					sesion.setAttribute("direccion", direccion);
					response.sendRedirect("/Practica5/jsp_pages/Productos.jsp");
					return;
				}else{
					System.out.println("Looginnull");
					sesion.invalidate();
				}													
			} 
		}catch( Exception e) {			
			e.printStackTrace();			
		}		
		response.sendRedirect("/Practica5/jsp_pages/login.jsp?msj=Usuario Invalido");
	
  }

}
