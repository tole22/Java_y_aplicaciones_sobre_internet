package com.CEDICA.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

import com.CEDICA.dao.impl.InstitucionDao;
import com.CEDICA.dao.impl.UsuarioDao;
import com.CEDICA.model.Institucion;
import com.CEDICA.model.Usuario;


public class LoginBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private boolean loggedIn;
	
	public LoginBean() 
    {	
		this.loggedIn = false;
    }
	
	public void login(ActionEvent event) {		
		UsuarioDao userDao = new UsuarioDao();		
		Usuario user = new Usuario();
		user=userDao.findByUsername(username);
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;		
		String salida = null;
		if(user==null || !user.getPassword().equals(password)){	
			this.loggedIn = false;
			System.out.print("no se encontro usuario");			
			message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Error de Login","El nombre de usuario o la clave son incorrectos...");
			salida = "failure";
		}else{
			this.loggedIn = true;
			HttpSession sesion = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			sesion.setAttribute("usuarioLogueado", user);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Iniciando Sesión...", "");	
			String rol = user.getRol().getRol();
			if(rol.equals("ROLE_ADMIN")){ salida = "/views/administrador/"; }
			if(rol.equals("ROLE_VOLUNTARIO")){ salida = "/views/voluntario/"; }
			if(rol.equals("ROLE_COORDINADOR")){ salida = "/views/coordinador/"; }	
		}				
		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("loggedIn", this.loggedIn);
		context.addCallbackParam("view", salida);		
	}
	
	public void loginInstitucion(ActionEvent event) {		
		InstitucionDao insDao = new InstitucionDao();		
		Institucion institucion = new Institucion();
		institucion=insDao.findByUsername(username);
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;		
		String salida = null;
		if(institucion==null || !institucion.getPassword().equals(password)){	
			this.loggedIn = false;
			System.out.print("no se encontro institucion");			
			message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Error de Login","El nombre de usuario o la clave son incorrectos...");
			salida = "failure";
		}else{
			this.loggedIn = true;
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Iniciando Sesión...", "");	
			salida = "/views/instituciones/index.xhtml"; 				
		}				
		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("loggedIn", this.loggedIn);
		context.addCallbackParam("view", salida);		
	}
	
	public void logout() {
	    HttpSession session = (HttpSession) FacesContext.getCurrentInstance() 
	                                        .getExternalContext().getSession(false);
	    
	    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cerrando Sesión...", username));
	    session.invalidate();
	    this.loggedIn = false;
	  }
 
	public String getUsername() { return this.username; }
	public void setUsername(String data) { this.username = data; }
	public String getPassword() { return password; }
	public void setPassword(String data) {this.password = data; }
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
}

