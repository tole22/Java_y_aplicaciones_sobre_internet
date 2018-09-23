package filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FiltroControlaSession
 */
@WebFilter("/FiltroControlaSession")
public class FiltroControlaSession implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroControlaSession() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		//Cargamos la sesion
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpSession session= httpRequest.getSession(false);
		   usuario = null;
		
		//Preguntamos por un objeto en la sesion
		if(session!=null){
			usuario=session.getAttribute("usuario");
			}
		if(session==null || usuario==null){
			if(session==null){System.out.println("Session ");}
			if(usuario==null){System.out.println("usuario");}
			System.out.println("Session Invalid");
		}else{ System.out.println("Session valid");}
		
		if (session==null || usuario==null) {//if we have no session
		try {
		httpRequest.getRequestDispatcher("/login.html").forward(request, response);
		return;
		}
		catch (ServletException e) { }
		catch (IOException e) {}
		}
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
