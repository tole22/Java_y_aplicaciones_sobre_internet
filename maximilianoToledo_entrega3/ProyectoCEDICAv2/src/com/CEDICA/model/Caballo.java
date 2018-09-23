package com.CEDICA.model;

import java.util.Date;
import javax.persistence.*;


@Entity
public class Caballo {
	@Id @GeneratedValue
	public	int id;
	public  Date nacimiento;
	public  String sexo;
	public  String raza;
	public  String pelaje;
	public  String peso;
	public  String alzada;
	public Conductor conductor_afin;
	
	public Caballo(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getAlzada() {
		return alzada;
	}
	public void setAlzada(String alzada) {
		this.alzada = alzada;
	}
	public Conductor getConductor_afin() {
		return conductor_afin;
	}
	public void setConductor_afin(Conductor conductor_afin) {
		this.conductor_afin = conductor_afin;
	}
}
