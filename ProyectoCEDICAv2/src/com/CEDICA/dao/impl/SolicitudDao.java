package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ISolicitudDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Solicitud;

public class SolicitudDao extends GenericDaoHibernetJpaImpl<Solicitud> implements
		ISolicitudDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Solicitud";
	 
		}

		
		public Solicitud findBySolicitudname(String Solicitudname) {
			return null;
		}

		
		public List<Solicitud> retrieveAllAdminSolicitud() {
			return null;
		}
	

}