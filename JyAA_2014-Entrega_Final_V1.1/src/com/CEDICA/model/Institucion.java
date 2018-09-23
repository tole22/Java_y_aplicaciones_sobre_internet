package com.CEDICA.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="institucion")
public class Institucion {
	
	@Id @GeneratedValue
	private int id;	
	private String nombre;
	private String email;
	private int vacantes;
	private String username;
	private String password;
	@OneToMany(mappedBy="institucion")
	private List<Solicitud> solicitudes; 
	
	public Institucion() {
		this.solicitudes = new ArrayList<Solicitud>();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVacantes() {
		return vacantes;
	}
	public void setVacantes(int vacantes) {
		this.vacantes = vacantes;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String usuario) {
		this.username = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String clave) {
		this.password = clave;
	}

}
