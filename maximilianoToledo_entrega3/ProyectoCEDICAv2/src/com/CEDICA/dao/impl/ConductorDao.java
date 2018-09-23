package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IConductorDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Conductor;

public class ConductorDao extends GenericDaoHibernetJpaImpl<Conductor> implements
		IConductorDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Conductor";
	 
		}

		
		public Conductor findByConductorname(String Conductorname) {
			return null;
		}

		
		public List<Conductor> retrieveAllAdminConductor() {
			return null;
		}
	

}