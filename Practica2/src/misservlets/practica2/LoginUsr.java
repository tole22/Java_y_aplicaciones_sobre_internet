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
 * Servlet implementation class LoginUsr
 */
@WebServlet("/LoginUsr")
public class LoginUsr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginUsr() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		 Hashtable<String, String> logins = new Hashtable<String, String>();
		 logins.put("", "");
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
		String user = request.getParameter("usuario");
		String pass = request.getParameter("contra");
		String names = request.getParameter("nombres");
		String codPost = request.getParameter("codigoPost");
		
		if(user != "" && pass != "" && names != "" && codPost != ""){
			if(user.equals("maxi") && pass.equals("maxi")){
				HttpSession sesion = request.getSession(true);
				
				sesion.setAttribute("usuario", user);
				sesion.setAttribute("password", pass);
				sesion.setAttribute("nombres", names);
				sesion.setAttribute("condigoPostal", codPost);
				response.sendRedirect("Productos");
			}else{
				response.getWriter().println("CAMPOS INCORRECTOS");
				response.setContentType("text/html");
				response.getWriter().println("<a href='login.html'>VOLVER A INTENTAR</a>");
			}
		}else{
			response.getWriter().println("CAMPOS VACIOS POR FAVOR COMPLETELOS");
			response.setContentType("text/html");
			response.getWriter().println("<a href='login.html'>VOLVER A INTENTAR</a>");
			
			
		}
		
	}
	}


