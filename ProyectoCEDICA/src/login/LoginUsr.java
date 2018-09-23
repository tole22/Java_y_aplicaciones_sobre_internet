package login;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class LoginUsr
 */
@WebServlet("/LoginUsr")
public class LoginUsr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUsr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	public String sesion_correcta(String user, String pass){
		
		
		//ADMIN
		String user_1="admin";
		String pass_1="admin";
		//COORDINADOR
		String user_2="coord";
		String pass_2="coord";
		//VOLUNTARIO
		String user_3="volunt";
		String pass_3="volunt";
		
		if(user.equals(user_1) && pass.equals(pass_1)){
			return "admin";
		}else if(user.equals(user_2) && pass.equals(pass_2)){
				return "coord";
		}else if(user.equals(user_3) && pass.equals(pass_3)){
			return "volunt";
		}else{
			return "nada";
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("usuario");
		String pass = request.getParameter("contra");
		
		
		if(user != "" && pass != ""){
			String resultado = sesion_correcta(user,pass);
			if( resultado != "nada"){
				HttpSession sesion = request.getSession(true);
				
				sesion.setAttribute("usuario", user);
				sesion.setAttribute("password", pass);
				sesion.setAttribute("permisos", resultado);
				if(resultado.equals("admin")){response.sendRedirect("admin/backend-admin.html");}
				if(resultado.equals("coord")){response.sendRedirect("coordinador/backend-coord.html");}
				if(resultado.equals("volunt")){response.sendRedirect("voluntario/backend-volunt.html");}
					
			}else{
				response.setContentType("text/html");
				response.getWriter().println("<html>");
				response.getWriter().println("<head>");
				response.getWriter().println("<meta charset='ISO-8859-1'>"+
				"<title>Ingresar </title>"+
				"<LINK href='css/style.css' rel='stylesheet' type='text/css'>");
				response.getWriter().println("</head>");
				response.getWriter().println("<body>");
				response.getWriter().println("<div class='cuerpo_index'>");
				response.getWriter().println("<h2>CAMPOS INCORRECTOS</h2>");
				response.getWriter().println("<a href='login.html'>VOLVER A INTENTAR</a>");
				response.getWriter().println("</div>");
				response.getWriter().println("</body>");
				response.getWriter().println("</html>");
			}
		}else{
			response.setContentType("text/html");
			response.getWriter().println("<html>");
			response.getWriter().println("<head>");
			response.getWriter().println("<meta charset='ISO-8859-1'>"+
			"<title>Ingresar </title>"+
			"<LINK href='css/style.css' rel='stylesheet' type='text/css'>");
			response.getWriter().println("</head>");
			response.getWriter().println("<body>");
			response.getWriter().println("<div class='cuerpo_index'>");
			response.getWriter().println("<h2>CAMPOS VACIOS POR FAVOR COMPLETELOS</h2>");
			response.getWriter().println("<a href='login.html'>VOLVER A INTENTAR</a>");
			response.getWriter().println("</div>");
			response.getWriter().println("</body>");
			response.getWriter().println("</html>");
			
		}
		
	}
	}


