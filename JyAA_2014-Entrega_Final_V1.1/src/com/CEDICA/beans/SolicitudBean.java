package com.CEDICA.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.CEDICA.dao.impl.AlumnoDao;
import com.CEDICA.dao.impl.InstitucionDao;
import com.CEDICA.dao.impl.SolicitudDao;

import com.CEDICA.model.Alumno;
import com.CEDICA.model.Familiar;
import com.CEDICA.model.Institucion;
import com.CEDICA.model.Solicitud;
public class SolicitudBean implements Serializable{
	private static final long serialVersionUID = 1L;	
	private Solicitud solicitud;
	private Familiar familiar;
	private List<Familiar> familiares;
	private List<Solicitud> lista;
	private List<Solicitud> listaFiltrada;
	
	public SolicitudBean() {
		this.solicitud = new Solicitud();
		SolicitudDao solicitudDao = new SolicitudDao();
		this.lista = solicitudDao.list();
		this.familiar = new Familiar();		
		this.familiares = new ArrayList<Familiar>();			
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public List<Solicitud> getLista() {
		return lista;
	}

	public void setLista(List<Solicitud> lista) {
		this.lista = lista;
	}

	public List<Solicitud> getListaFiltrada() {
		return listaFiltrada;
	}

	public void setListaFiltrada(List<Solicitud> listaFiltrada) {
		this.listaFiltrada = listaFiltrada;
	}

	public Familiar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}	

	public List<Familiar> getFamiliares() {
		return familiares;
	}

	public void setFamiliares(List<Familiar> familiares) {
		this.familiares = familiares;
	}
	
	public void reinit(){
		this.familiar = new Familiar();		
	}
	
	public void guardarSolicitud(ActionEvent event){		
		
		SolicitudDao solicitudDao = new SolicitudDao();
		AlumnoDao aluDao = new AlumnoDao();
		Alumno alumno = this.solicitud.getAlumno();		
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;		
		boolean exito = false;
		if(aluDao.findByDNI(alumno.getDni()) == null && !this.familiares.isEmpty() && alumno.getNombre() != null){
			if(this.solicitud.getEstado() != null){				
				//es para modificar
				solicitudDao.update(this.solicitud);
				message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "La solicitud para el Aspirante '"+alumno.getNombre()+" "+alumno.getApellido()+"' fue modificada correctamente.");
				exito = true;
			}else{				
				//es para guardar una nueva solicitud
				Institucion inst = this.solicitud.getInstitucion();
				if(inst.getUsername() == null){
					this.solicitud.setInstitucion(null);//para q no guarde una institucion en null en la bd
				}else{
					InstitucionDao instDao = new InstitucionDao();
					instDao.save(inst);
				}
				alumno.setFamiliares(this.familiares);
				alumno.setEstado("Lista_de_Espera");
				this.solicitud.setFecha(Calendar.getInstance().getTime());
				this.solicitud.setEstado("En Proceso");
	//			aspDao.save(Alumno); No hace falta porque el cascade=PERSIST persiste al Alumno cuando hago el save de la solicitud
				solicitudDao.save(this.solicitud);
				this.lista.add(this.solicitud);
				this.setListaFiltrada(this.lista);
				this.reinit();
				message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "La solicitud para el Aspirante '"+alumno.getNombre()+" "+alumno.getApellido()+"' fue agregada correctamente.");
				exito = true;
			}
		}else{
			if(this.familiares.isEmpty()){
				message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Atención!", "El Aspirante debe tener como mínimo un familiar agregado.");
			}else{
				if(this.solicitud.getEstado() != null){
					solicitudDao.update(this.solicitud);
					message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "La solicitud para el Aspirante '"+alumno.getNombre()+" "+alumno.getApellido()+"' fue modificada correctamente.");
					exito = true;
				}else{
					message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Atención!", "El Aspirante con DNI '"+alumno.getDni()+"' ya existe en el sistema.");
				}
			}
		}		
		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("exito", exito);
		context.addCallbackParam("view", "/views/solicitudes/listado.xhtml");			
	}
	
	public void editarSolicitud(Solicitud solicitud){
		this.solicitud = solicitud;
		this.familiares = solicitud.getAlumno().getFamiliares();
		RequestContext context = RequestContext.getCurrentInstance();
		context.addCallbackParam("exito", true);
		context.addCallbackParam("view", "/views/solicitudes/nueva_solicitud_particular.xhtml");
	}
	
	public void borrarSolicitud(Solicitud solicitud){
		
	}
}
