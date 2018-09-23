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
	private String localidad;
	private String direccion;
	private String director;
	private String telefono;
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	
	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}
	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

}
