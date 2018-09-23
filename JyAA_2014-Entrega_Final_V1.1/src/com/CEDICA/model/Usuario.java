package com.CEDICA.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="usuario")
public class Usuario {
	@Id @GeneratedValue
	private int id;
	private String username;
	private String password;	
	@ManyToMany(cascade={CascadeType.PERSIST})
	@JoinTable(name="roles_usuarios", 
		joinColumns= @JoinColumn(name="id_usuario",	referencedColumnName="id"),
		inverseJoinColumns= @JoinColumn(name="id_rol", referencedColumnName="id")
	)
	private List<Rol> roles = new ArrayList<Rol>();
	
	public Usuario(){}
	
	public Usuario(String username, String password, Rol rol){
		this.username = username;
		this.password = password;		 
		this.roles.add(rol);		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	public void setRol(Rol rol){
		
		this.roles.add(rol);		
	}
	public Rol getRol(){
		return this.roles.iterator().next();		
	}
	@Override
	public String toString() {

		return username;
	}
	
	
	

}
