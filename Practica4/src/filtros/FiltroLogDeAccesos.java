package filtros;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FiltroLogDeAccesos
 */

public class FiltroLogDeAccesos implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroLogDeAccesos() {
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
		Connection con;
		Calendar cal = Calendar.getInstance();
		java.sql.Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());
		String ip_cliente = request.getRemoteAddr();		
		String recurso = ((HttpServletRequest) request).getRequestURI();
		String navegador = ((HttpServletRequest) request).getHeader("user-agent");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/jyaa2014_grupo8","root","");			
			Statement st = con.createStatement();
			String query="INSERT INTO server_req (fecha_y_hora, ip_cliente, recurso, navegador)" +
					"" +
					"					 VALUES ('"+timestamp+"','"+ip_cliente+"','"+recurso+"','"+navegador+"')";			
			int result= st.executeUpdate(query);			 
			System.out.println(result);
			st.close();
			con.close(); //en gral. devuelve la conexión al pool			
		} catch (SQLException e) {
			System.out.println("Error de SQL: " + e.getMessage());
			response.getWriter().print(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().print(e.getMessage());
		} 
		chain.doFilter(request, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
