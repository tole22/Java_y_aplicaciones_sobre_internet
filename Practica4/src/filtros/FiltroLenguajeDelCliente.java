package filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FiltroLenguajeDelCliente
 */

public class FiltroLenguajeDelCliente implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroLenguajeDelCliente() {
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
		
		String navegador = ((HttpServletRequest) request).getHeader("Accept-Language");
		
		String naveg = navegador.substring(0,2);
		//System.out.println(naveg);
		ParamGetRequestWraper warpedRequest = new ParamGetRequestWraper((HttpServletRequest)request,naveg);
		chain.doFilter((HttpServletRequest)warpedRequest, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
