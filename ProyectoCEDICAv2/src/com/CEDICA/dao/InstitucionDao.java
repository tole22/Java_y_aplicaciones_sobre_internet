package com.CEDICA.dao;

import java.util.List;


import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Institucion;

public class InstitucionDao extends GenericDaoHibernetJpaImpl<Institucion> implements
		IInstitucionDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Institucion";
	 
		}

		
		public Institucion findByInstitucionname(String Institucionname) {
			return null;
		}

		
		public List<Institucion> retrieveAllAdminInstitucion() {
			return null;
		}
	

}