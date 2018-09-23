package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IAlumnoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Alumno;

public class AlumnoDao extends GenericDaoHibernetJpaImpl<Alumno> implements
		IAlumnoDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Alumno";
	 
		}

		
		public Alumno findByAlumnoname(String Alumnoname) {
			return null;
		}

		
		public List<Alumno> retrieveAllAdminAlumno() {
			return null;
		}
	

}