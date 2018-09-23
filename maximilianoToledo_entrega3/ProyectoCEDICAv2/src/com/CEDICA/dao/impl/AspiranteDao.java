package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IAspiranteDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Aspirante;

public class AspiranteDao extends GenericDaoHibernetJpaImpl<Aspirante> implements
		IAspiranteDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Aspirante";
	 
		}

		
		public Aspirante findByAspirantename(String Aspirantename) {
			return null;
		}

		
		public List<Aspirante> retrieveAllAdminAspirante() {
			return null;
		}
	

}