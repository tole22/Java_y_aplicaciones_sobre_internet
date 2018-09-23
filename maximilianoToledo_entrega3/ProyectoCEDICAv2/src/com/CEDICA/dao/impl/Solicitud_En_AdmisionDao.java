package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ISolicitud_En_AdmisionDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Solicitud_En_Admision;

public class Solicitud_En_AdmisionDao extends GenericDaoHibernetJpaImpl<Solicitud_En_Admision> implements
		ISolicitud_En_AdmisionDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Solicitud_En_Admision";
	 
		}

		
		public Solicitud_En_Admision findBySolicitud_En_Admisionname(String Solicitud_En_Admisionname) {
			return null;
		}

		
		public List<Solicitud_En_Admision> retrieveAllAdminSolicitud_En_Admision() {
			return null;
		}
	

}