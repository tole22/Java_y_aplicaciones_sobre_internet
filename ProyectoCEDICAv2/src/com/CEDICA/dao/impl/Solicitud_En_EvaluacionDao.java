package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ISolicitud_En_EvaluacionDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Solicitud_En_Evaluacion;

public class Solicitud_En_EvaluacionDao extends GenericDaoHibernetJpaImpl<Solicitud_En_Evaluacion> implements
		ISolicitud_En_EvaluacionDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Solicitud_En_Evaluacion";
	 
		}

		
		public Solicitud_En_Evaluacion findBySolicitud_En_Evaluacionname(String Solicitud_En_Evaluacionname) {
			return null;
		}

		
		public List<Solicitud_En_Evaluacion> retrieveAllAdminSolicitud_En_Evaluacion() {
			return null;
		}
	

}