package misservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContadorVisitas
 */
@WebServlet("/ContadorVisitas")
public class ContadorVisitas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public int contador;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContadorVisitas() {
        super();
        //inicializamos la variable contador
        contador = 1;
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int tmp = contador;
	    //incrementamos la variable contador
	    contador++;
	    response.getWriter().println("<html>");
	    response.getWriter().println("<body>");
	    response.getWriter().println("<h1>Numero de peticiones " + tmp +"</h1>");
	    response.getWriter().println("</body>");
	    response.getWriter().println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
