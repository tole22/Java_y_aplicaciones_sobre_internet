package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ICronica_ProfesionalDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Cronica_Profesional;

public class Cronica_ProfesionalDao extends GenericDaoHibernetJpaImpl<Cronica_Profesional> implements
		ICronica_ProfesionalDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Cronica_Profesional";
	 
		}

		
		public Cronica_Profesional findByCronica_Profesionalname(String Cronica_Profesionalname) {
			return null;
		}

		
		public List<Cronica_Profesional> retrieveAllAdminCronica_Profesional() {
			return null;
		}
	

}