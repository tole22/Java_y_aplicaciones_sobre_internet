package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ILegajoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Legajo;

public class LegajoDao extends GenericDaoHibernetJpaImpl<Legajo> implements
		ILegajoDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Legajo";
	 
		}

		
		public Legajo findByLegajoname(String Legajoname) {
			return null;
		}

		
		public List<Legajo> retrieveAllAdminLegajo() {
			return null;
		}
	

}