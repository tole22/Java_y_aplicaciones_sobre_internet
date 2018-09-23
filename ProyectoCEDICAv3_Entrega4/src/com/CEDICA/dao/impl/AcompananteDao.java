package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IAcompananteDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Acompanante;

public class AcompananteDao extends GenericDaoHibernetJpaImpl<Acompanante> implements
		IAcompananteDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Acompanante";
	 
		}

		
		public Acompanante findByAcompanantename(String Acompanantename) {
			return null;
		}

		
		public List<Acompanante> retrieveAllAdminAcompanante() {
			return null;
		}
	

}