package com.CEDICA.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;

import com.CEDICA.dao.impl.RolDao;
import com.CEDICA.dao.impl.UsuarioDao;
import com.CEDICA.model.Rol;
import com.CEDICA.model.Usuario;

public class UsuarioBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private	String username;
	private	String password;
	private	Integer rol;
	private Usuario user;
	private List<Usuario> lista;
	private List<Usuario> listaFiltrada;
	private List<Rol> roles;
	
	
	public UsuarioBean() 
    {
		UsuarioDao userDao = new UsuarioDao();	
		lista = userDao.list();	
		RolDao rolDao = new RolDao();
		roles = rolDao.list();
    }
	
	public List<Rol> getRoles(){
		return this.roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public Usuario getUser(){
		return this.user;
	}
	public void nuevo_usuario(ActionEvent event) {
		
		UsuarioDao userDao = new UsuarioDao();
		RolDao rolDao = new RolDao();
		
		
		Rol rol = new Rol();
		
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;		
		boolean exito = false;
		if(userDao.findByUsername(username)==null){			
			rol = rolDao.findById(this.rol);			
			Usuario user = new Usuario(username,password,rol);
			userDao.save(user);
			this.lista.add(user);
			this.setListaFiltrada(this.lista);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "usuario '"+this.username+"' agregado correctamente.");
			exito = true;
		}else{
			message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Atención!", "Ya existe un usuario con el nombre '"+this.username+"' .");			
		}	
		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("exito", exito);
		context.addCallbackParam("view", "/views/administrador/listado_usuarios.xhtml");
	}
	
	public List<Usuario> getLista(){		
		return lista;
	}
	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}
	public List<Usuario> getListaFiltrada() {
		return listaFiltrada;
	}
	public void setListaFiltrada(List<Usuario> listaFiltrada) {
		this.listaFiltrada = listaFiltrada;
	}
	
	public void borrar_usuario(Usuario u){		
		UsuarioDao userDao = new UsuarioDao();		
		userDao.delete(u);
		this.lista.remove(u);
		this.setListaFiltrada(this.lista);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "El usuario '"+u.getUsername()+"' fue borrado correctamente."));
	}
	
		
	public void onRowEdit(RowEditEvent event) {
		Usuario usuarioActual = (Usuario) event.getObject();
		this.modificar_usuario(usuarioActual);
        FacesMessage msg = new FacesMessage("Usuario Editado", "Los cambios sobre el usuario '"+usuarioActual.getUsername()+"' se realizaron correctamente.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        System.out.println(usuarioActual.getUsername()+" - "+usuarioActual.getPassword()+" - "+usuarioActual.getRol().getRol());
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edición Cancelada", ((Usuario) event.getObject()).getUsername());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }   
	
		
	public void modificar_usuario(Usuario user){
		UsuarioDao userDao = new UsuarioDao();
		RolDao rolDao = new RolDao();
		Rol rol = new Rol();		
		rol = rolDao.findById(this.rol);		
		ArrayList<Rol> roles = new ArrayList<Rol>();
		roles.add(rol);
		user.setRoles(roles);
		userDao.update(user);		
	}
	
	
	public String getUsername() { return this.username; }
	public void setUsername(String data) { this.username = data; }
	public String getPassword() { return password; }
	public void setPassword(String data) {this.password = data; }
	public Integer getRol() { return this.rol; }
	public void setRol(Integer data) { this.rol = data; }

}
