package com.CEDICA.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

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
	private List<Solicitud> listaEspera;
	private List<Solicitud> listaEsperaFiltrada;
	
	
	public SolicitudBean() {
		this.solicitud = new Solicitud();
		SolicitudDao solicitudDao = new SolicitudDao();
		this.lista = solicitudDao.list();
		this.familiar = new Familiar();		
		this.familiares = new ArrayList<Familiar>();
		this.listaEspera = solicitudDao.listByEstado("Lista de Espera");
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
	
	public List<Solicitud> getListaEspera() {
		return listaEspera;
	}

	public void setListaEspera(List<Solicitud> listaEspera) {
		this.listaEspera = listaEspera;
	}

	public List<Solicitud> getListaEsperaFiltrada() {
		return listaEsperaFiltrada;
	}

	public void setListaEsperaFiltrada(List<Solicitud> listaEsperaFiltrada) {
		this.listaEsperaFiltrada = listaEsperaFiltrada;
	}

	public void reinit(){
		this.familiar = new Familiar();	
		this.solicitud = new Solicitud();
		this.familiares = new ArrayList<Familiar>();
	}
	
	public void reinitFamiliar(){
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
					this.solicitud.setTipo("Particular");
					this.solicitud.setEstado("En Proceso");
					this.solicitud.setInstitucion(null);//para q no guarde una institucion en null en la bd
				}else{	
					if(inst.getVacantes() == 0){
						message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Atención!", "La Institucíon '"+inst.getNombre()+"' no posee vacantes disponibles.");						
						FacesContext.getCurrentInstance().addMessage(null, message);
						context.addCallbackParam("exito", false);
						return;
					}
					this.solicitud.setTipo("Institución");
					this.solicitud.setEstado("Lista de Espera");
					inst.setVacantes(inst.getVacantes() - 1);
					alumno.setEstado("Lista de Espera");
					alumno.setDerivacionACEDICA("Por Institución");
					InstitucionDao instDao = new InstitucionDao();
					instDao.save(inst);
					this.listaEspera.add(solicitud);
				}
				alumno.setFamiliares(this.familiares);				
				java.util.Date date= new java.util.Date();
				Timestamp timeStamp = new Timestamp(date.getTime());
				this.solicitud.setFechaCreacion(timeStamp);
				this.solicitud.setFechaUltimaMod(timeStamp);
				System.out.println(this.solicitud.getFechaCreacion());				
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
					java.util.Date date= new java.util.Date();
					Timestamp timeStamp = new Timestamp(date.getTime());
					this.solicitud.setFechaUltimaMod(timeStamp);
					System.out.println(this.solicitud.getFechaUltimaMod());
					solicitudDao.update(this.solicitud);
					message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "La solicitud para el Aspirante '"+alumno.getNombre()+" "+alumno.getApellido()+"' fue modificada correctamente.");
					exito = true;
					this.reinit();
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
		String tipoSolicitud = this.solicitud.getTipo().equals("Particular") ? "particular" : "institucion";		
		RequestContext context = RequestContext.getCurrentInstance();
		context.addCallbackParam("exito", true);
		context.addCallbackParam("view", "/views/solicitudes/nueva_solicitud_"+tipoSolicitud+".xhtml");
	}
	
	public void finalizarSolicitud(Solicitud solicitud){
		SolicitudDao solicitudDao = new SolicitudDao();
		solicitud.setEstado("Lista de Espera");		
		solicitudDao.update(solicitud);
		this.listaEspera.add(solicitud);
		this.setListaEsperaFiltrada(this.listaEspera);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "La Solicitud para el aspirante '"+solicitud.getAlumno().getApellido()+", "+solicitud.getAlumno().getNombre()+"' fue pasada a Lista de Espera."));
	}
	
	public void incorporarAspirante(Solicitud solicitud){
		SolicitudDao solicitudDao = new SolicitudDao();
		solicitud.setEstado("Aceptado");
		java.util.Date date= new java.util.Date();
		Timestamp timeStamp = new Timestamp(date.getTime());
		solicitud.getAlumno().setFechaDeIngreso(timeStamp);
		solicitudDao.update(solicitud);
		this.listaEspera.remove(solicitud);
		this.setListaEsperaFiltrada(this.listaEspera);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "El aspirante '"+solicitud.getAlumno().getApellido()+", "+solicitud.getAlumno().getNombre()+"' fue incorporado como alumno de CEDICA."));
	}
	
	public void darBajaListener(SelectEvent event){
		Solicitud solicitud = (Solicitud) event.getObject();
		SolicitudDao solicitudDao = new SolicitudDao();	
		solicitud.setEstado("Rechazado");
		solicitudDao.update(solicitud);
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada...", "La Solicitud para el aspirante '"+solicitud.getAlumno().getNombre()+" "+solicitud.getAlumno().getApellido()+"' fue rechazada correctamente.");        
        FacesContext.getCurrentInstance().addMessage(null, message);
		this.reinit();
	}
	
	public void enviarSolicitudBaja(){
		RequestContext.getCurrentInstance().closeDialog(this.solicitud);		
	}
	
	public void borrarSolicitud(Solicitud solicitud){
		this.solicitud = solicitud;
		Map<String,Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("draggable", false);		
		options.put("contentHeight", 280);
		options.put("contentWidth", 490);
		RequestContext.getCurrentInstance().openDialog("dar_de_baja",options,null);
	}
}
