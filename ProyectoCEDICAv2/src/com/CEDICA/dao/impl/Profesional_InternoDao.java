package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IProfesional_InternoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Profesional_Interno;

public class Profesional_InternoDao extends GenericDaoHibernetJpaImpl<Profesional_Interno> implements
		IProfesional_InternoDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Profesional_Interno";
	 
		}

		
		public Profesional_Interno findByProfesional_Internoname(String Profesional_Internoname) {
			return null;
		}

		
		public List<Profesional_Interno> retrieveAllAdminProfesional_Interno() {
			return null;
		}
	

}