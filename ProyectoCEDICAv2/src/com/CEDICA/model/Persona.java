package com.CEDICA.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Persona {
	@Id @GeneratedValue
	public	int id;
	public 	String nombre;
	public	String apellido;
	public	Integer dni;
	public  Date fecha_nacimiento;
	public  String tel;
	public  String email;
	public  String lugar_residencia;
	public  String provincia;
	
	public Persona(){}
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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
	
	public String getLugarResidencia() {
		return lugar_residencia;
	}
	public void setLugarResidencia(String lugar) {
		this.lugar_residencia = lugar;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
