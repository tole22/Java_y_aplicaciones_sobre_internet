package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ISolicitud_En_EsperaDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Solicitud_En_Espera;

public class Solicitud_En_EsperaDao extends GenericDaoHibernetJpaImpl<Solicitud_En_Espera> implements
		ISolicitud_En_EsperaDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Solicitud_En_Espera";
	 
		}

		
		public Solicitud_En_Espera findBySolicitud_En_Esperaname(String Solicitud_En_Esperaname) {
			return null;
		}

		
		public List<Solicitud_En_Espera> retrieveAllAdminSolicitud_En_Espera() {
			return null;
		}
	

}