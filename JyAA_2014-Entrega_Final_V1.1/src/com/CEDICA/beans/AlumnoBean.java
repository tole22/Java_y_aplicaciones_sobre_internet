package com.CEDICA.beans;



import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.CEDICA.dao.impl.AlumnoDao;

import com.CEDICA.model.Alumno;



public class AlumnoBean implements Serializable{
	private static final long serialVersionUID = 1L;	
	private Alumno alumno;
	
	public AlumnoBean(){
		this.alumno = new Alumno();
	}	
	
	public Alumno getAlumno() {
		return alumno;
	}
	
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public String guardarSolicitudFamiliar(){
		AlumnoDao aspDao = new AlumnoDao();
//		System.out.println(this.Alumno.getNombre());
//		System.out.println(this.Alumno.getApellido());
//		System.out.println(this.Alumno.getFechaDeNac());
		aspDao.save(this.alumno);		
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage("La solicitud se ha guardado correctamente");
		context.addMessage("ingresoFamilia", message);		
		return "exito";
	}
}
