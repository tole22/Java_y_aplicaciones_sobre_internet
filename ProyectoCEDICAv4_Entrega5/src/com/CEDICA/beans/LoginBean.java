package com.CEDICA.beans;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.CEDICA.dao.impl.UsuarioDao;
import com.CEDICA.model.Usuario;

public class LoginBean {
	
	String username;
	String password;
	
	public LoginBean() 
    {
    }
	
	public String login() {
		
		UsuarioDao userDao = new UsuarioDao();
		
		Usuario user = new Usuario();
		
		if(userDao.findByUsername(username)==null){
			
			System.out.print("no se encontro usuario");
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage message = new FacesMessage("Invalid Username");
			context.addMessage("loginForm", message);
			return "failure";
			
		}else{
			user=userDao.findByUsername(username);
			if(!user.getPassword().equals(password)){
				System.out.print("password incorrecto");
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("Invalid Password");
				context.addMessage("loginForm", message);
				return "failure";
			}
			
			
			
			String rol = user.getRoles().iterator().next().getRol().toString();
			
			if(rol.equals("ROLE_ADMIN")){ return "administrador"; }
			if(rol.equals("ROLE_VOLUNTARIO")){ return "voluntario"; }
			if(rol.equals("ROLE_COORDINADOR")){ return "coordinador"; }
			
			return "failure";
			
		}
	}
	
	
 
	public String getUsername() { return this.username; }
	public void setUsername(String data) { this.username = data; }
	public String getPassword() { return password; }
	public void setPassword(String data) {this.password = data; }
}
