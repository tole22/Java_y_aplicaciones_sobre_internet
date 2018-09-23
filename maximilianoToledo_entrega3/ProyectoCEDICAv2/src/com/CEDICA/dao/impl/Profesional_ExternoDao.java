package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IProfesional_ExternoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Profesional_Externo;

public class Profesional_ExternoDao extends GenericDaoHibernetJpaImpl<Profesional_Externo> implements
		IProfesional_ExternoDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Profesional_Externo";
	 
		}

		
		public Profesional_Externo findByProfesional_Externoname(String Profesional_Externoname) {
			return null;
		}

		
		public List<Profesional_Externo> retrieveAllAdminProfesional_Externo() {
			return null;
		}
	

}