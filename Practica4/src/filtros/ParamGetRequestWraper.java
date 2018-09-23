package filtros;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class ParamGetRequestWraper extends HttpServletRequestWrapper {
	
	
	public ParamGetRequestWraper(HttpServletRequest request, String parametro) {
		super(request);
		request.setAttribute("idiom", parametro);
		
	}

	
}
