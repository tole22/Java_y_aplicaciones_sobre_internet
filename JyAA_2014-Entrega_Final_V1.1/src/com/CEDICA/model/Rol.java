package com.CEDICA.model;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="rol")
public class Rol {
	
	@Id @GeneratedValue
	private int id;
	private String rol;
	@ManyToMany(mappedBy="roles")	
	private List<Usuario> usuarios;
	
	public Rol(){}
	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
