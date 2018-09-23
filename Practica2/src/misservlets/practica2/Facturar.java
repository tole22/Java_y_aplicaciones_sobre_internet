package misservlets.practica2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Facturar
 */
@WebServlet("/Facturar")
public class Facturar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Facturar() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(true);
		int sum=0;
		String[] compra;
		compra =request.getParameterValues("prod");
		
		int cantProdEnVenta = (Integer)sesion.getAttribute("cantProductos");
		
		for (int i=1; i<=cantProdEnVenta; i++){
			response.getWriter().println("prodcuto"+sesion.getAttribute("golo"+i));	
		}
		
		for (int i=0; i<compra.length; i++) {
			
				sum=sesion.getAttribute("cant"+i);
				sum= sum + new Integer(compra[i]);
				
			
			
		
			
			}
		
	}

}
