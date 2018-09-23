package com.CEDICA.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="familiar")
public class Familiar {
	@Id @GeneratedValue
	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	private String telefono;
	private String celular;
	private String mail;
	private String actividad;
	@ManyToMany(mappedBy="familiares")	
	private List<Alumno> alumnos;
	
	public Familiar(){}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public List<Alumno> getAspirantes() {
		return alumnos;
	}

	public void setAspirantes(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	 public boolean equals(Object obj) {
	        if(!(obj instanceof Familiar))
	            return false;
	         
	        Familiar fam = (Familiar) obj;
	         
	        return fam.getDni() == this.dni;
	    }
	 
	    public int hashCode() {
	        int hash = 1;            
	        if(this.nombre != null)
	            hash = hash * 29 + this.nombre.hashCode();
	 
	        return hash;
	    }
	
}
