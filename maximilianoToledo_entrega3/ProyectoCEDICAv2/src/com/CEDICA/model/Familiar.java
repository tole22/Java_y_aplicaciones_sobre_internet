package com.CEDICA.model;

import javax.persistence.Entity;

@Entity
public class Familiar extends Persona {
	public    String tipo;
	public    String tel_celular;
	public    String email;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTel_celular() {
		return tel_celular;
	}
	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
