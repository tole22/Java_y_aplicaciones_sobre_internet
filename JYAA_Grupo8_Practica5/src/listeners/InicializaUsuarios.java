package listeners;


import java.util.Hashtable;


import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;




public class InicializaUsuarios implements HttpSessionListener {
	private static Hashtable<String, String> logins = new Hashtable<String, String>();
    /**
     * Default constructor. 
     */
    public InicializaUsuarios() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0) {
    
    	
    	logins.put("agustin", "tiki");
		logins.put("maxi", "tolebala");
	
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }
    
    public static Hashtable<String, String> getLogins(){ 
    	return logins; 
    	}
	
}
