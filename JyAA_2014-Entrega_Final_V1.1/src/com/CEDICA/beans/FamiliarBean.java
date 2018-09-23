package com.CEDICA.beans;

import java.io.Serializable;

import com.CEDICA.model.Familiar;

public class FamiliarBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Familiar familiar;
	
	public FamiliarBean() {
		this.familiar =  new Familiar();
	}
	
	public Familiar getFamiliar() {
		return familiar;
	}
	
	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}
}
