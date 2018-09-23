package listeners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class InicializaStock
 *
 */
@WebListener
public class InicializaStock implements ServletContextListener {
	public static Hashtable<String, String> productos = new Hashtable<String, String>();
	
    /**
     * Default constructor. 
     */
    public InicializaStock() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce) {
    	try {
    		String path = sce.getServletContext().getInitParameter("stock");
	    	InputStream is = sce.getServletContext().getResourceAsStream(path);
	    	BufferedReader buffer = new BufferedReader(new InputStreamReader(is)); 
	    	int posComa1=0;
	    	int posComa2=0;
	    	int i=1;
	    	String linea = buffer.readLine();			
			while (linea != null){
				posComa1 = linea.indexOf(",");
				posComa2 = linea.indexOf(",", posComa1 + 1);	
				String nombre_prod = linea.substring(0, posComa1);
				productos.put("golo"+i, nombre_prod);				
				String precio_prod = linea.substring(posComa1 + 1,posComa2);
				productos.put("pu"+i, precio_prod);
				String cantidad_prod = linea.substring(posComa2 + 1);
				productos.put("cant"+i, cantidad_prod);
				linea = buffer.readLine();
				i++;
			}		
		}catch (IOException e) {
			e.printStackTrace();
		}
    	sce.getServletContext().setAttribute("catalogo_stock", productos);
    	System.out.println(productos.toString());
    }    	
   
    
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
