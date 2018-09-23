package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ISolicitud_En_AutorizacionDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Solicitud_En_Autorizacion;

public class Solicitud_En_AutorizacionDao extends GenericDaoHibernetJpaImpl<Solicitud_En_Autorizacion> implements
		ISolicitud_En_AutorizacionDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Solicitud_En_Autorizacion";
	 
		}

		
		public Solicitud_En_Autorizacion findBySolicitud_En_Autorizacionname(String Solicitud_En_Autorizacionname) {
			return null;
		}

		
		public List<Solicitud_En_Autorizacion> retrieveAllAdminSolicitud_En_Autorizacion() {
			return null;
		}
	

}