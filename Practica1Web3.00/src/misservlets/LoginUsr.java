package misservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if(user != "" && pass != "" ){
			if(user.equals("maxi") && pass.equals("maxi")){
				response.sendRedirect("loginCorrecto.html");
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
