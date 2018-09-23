package jyaa.servicios;

import java.util.Date;
import java.util.List;

import jyaa.dao.DaoPersona;
import jyaa.dao.DaosFactory;
import jyaa.modelo.Persona;



public class RegistrarPersonaService {
	
	DaoPersona dao=DaosFactory.getPersonDAO();
	
	public void registrarPersona(String nombre, String apellido , Date fechaNacimiento ,String email){
		Persona p= new Persona();
		p.setApellido(apellido);
		p.setEmail(email);
		p.setNombre(nombre);
		if(fechaNacimiento!=null){
			p.setFechaNacimiento(new java.sql.Date(fechaNacimiento.getTime()));
		}
		
		this.getDao().guardar(p);
	}
	
	public DaoPersona getDao() {
		return dao;
	}

	public List<Persona> getListaPersonas() {
		return this.getDao().listar();
	}
	
}
