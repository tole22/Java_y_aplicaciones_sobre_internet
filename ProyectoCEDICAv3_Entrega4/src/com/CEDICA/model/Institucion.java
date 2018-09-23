package com.CEDICA.model;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Institucion {
	@Id @GeneratedValue
	public	int id;
	public    String nombre;
	public    String direccion;
	public    String tel;
	public    String email;
	public    String referente;
	public    String director;
	public Alumno alumno;
	
	public Institucion(){}
	
	public int getId() {
		return this.id;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReferente() {
		return referente;
	}
	public void setReferente(String referente) {
		this.referente = referente;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
}
