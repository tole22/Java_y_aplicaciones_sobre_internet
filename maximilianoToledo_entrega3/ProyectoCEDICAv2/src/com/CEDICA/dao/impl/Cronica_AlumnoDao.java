package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ICronica_AlumnoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Cronica_Alumno;

public class Cronica_AlumnoDao extends GenericDaoHibernetJpaImpl<Cronica_Alumno> implements
		ICronica_AlumnoDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Cronica_Alumno";
	 
		}

		
		public Cronica_Alumno findByCronica_Alumnoname(String Cronica_Alumnoname) {
			return null;
		}

		
		public List<Cronica_Alumno> retrieveAllAdminCronica_Alumno() {
			return null;
		}
	

}