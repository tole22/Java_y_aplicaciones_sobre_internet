package com.CEDICA.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class RegistroOperaciones {
	@Id @GeneratedValue
	private int id;
	private String operacion;
	private Date fecha;
	private String nombre_clase;
	private String id_entidad;
	
public RegistroOperaciones(){}
	
public RegistroOperaciones(String operacion, Date fecha, String nombre_clase, String id_entidad){
	this.operacion = operacion;
	this.fecha = fecha;	
	this.nombre_clase = nombre_clase;	
	this.id_entidad = id_entidad;			
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombre_clase() {
		return nombre_clase;
	}
	public void setNombre_clase(String nombre_clase) {
		this.nombre_clase = nombre_clase;
	}
	public String getId_entidad() {
		return id_entidad;
	}
	public void setId_entidad(String id_entidad) {
		this.id_entidad = id_entidad;
	} 
}
