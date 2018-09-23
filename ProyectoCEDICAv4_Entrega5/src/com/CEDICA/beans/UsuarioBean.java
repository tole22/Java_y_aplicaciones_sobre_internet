package com.CEDICA.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.CEDICA.dao.impl.RolDao;
import com.CEDICA.dao.impl.UsuarioDao;
import com.CEDICA.model.Rol;
import com.CEDICA.model.Usuario;

public class UsuarioBean {

	String username;
	String password;
	Integer rol;
	public List<Usuario> lista;
	
	public UsuarioBean() 
    {
		UsuarioDao userDao = new UsuarioDao();	
		lista=userDao.list();	
		
    }
	
	public String nuevo_usuario() {
		
		UsuarioDao userDao = new UsuarioDao();
		RolDao rolDao = new RolDao();
		
		
		Rol rol = new Rol();
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		if(userDao.findByUsername(username)==null){
			
			rol = rolDao.findById(this.rol);
			
			Usuario user = new Usuario(username,password,rol);
			userDao.save(user);
			
			FacesMessage message = new FacesMessage("Usuario agregado correctamente");
			context.addMessage("comentario", message);
			return "succes";
		}
			FacesMessage message = new FacesMessage("Ya existe un usuario con ese username");
			context.addMessage("formularioNuevoUsuario", message);
			return "failure";
		
		}
	
	public List<Usuario> getLista(){
		UsuarioDao userDao = new UsuarioDao();	
		lista=userDao.list();
		return lista;
	}
	
	
	public String borrar_usuario(Usuario u){
		UsuarioDao userDao = new UsuarioDao();	
		userDao.delete(u);
		return null;
	}
	
	public String modificar_usuario(Usuario u){
		UsuarioDao userDao = new UsuarioDao();
		System.out.println(username+password+rol.toString()+u.getUsername());
		
		if(username != ""){ 
				u.setUsername(username);
				userDao.update(u);
				}
		if(password != ""){ 
			u.setPassword(password);
			userDao.update(u);
			}
		if(rol > 0){
			RolDao rolDao = new RolDao();
			Rol rol = new Rol();
			rol = rolDao.findById(this.rol);
			
			u.getRoles().remove(0);
			u.getRoles().add(rol);
			
			userDao.update(u);
			}
		return null;
	}
	
	
 
	public String getUsername() { return this.username; }
	public void setUsername(String data) { this.username = data; }
	public String getPassword() { return password; }
	public void setPassword(String data) {this.password = data; }
	public Integer getRol() { return this.rol; }
	public void setRol(Integer data) { this.rol = data; }

}
