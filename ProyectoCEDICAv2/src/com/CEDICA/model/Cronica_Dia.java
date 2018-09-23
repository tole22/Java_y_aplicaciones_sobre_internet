package com.CEDICA.model;

import java.util.Date;
import javax.persistence.*;


@Entity
public class Cronica_Dia {
	@Id @GeneratedValue
	public	int id;
	public    String texto_libre;
	public    Date fecha;
	
	public Cronica_Dia(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTexto_libre() {
		return texto_libre;
	}
	public void setTexto_libre(String texto_libre) {
		this.texto_libre = texto_libre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
