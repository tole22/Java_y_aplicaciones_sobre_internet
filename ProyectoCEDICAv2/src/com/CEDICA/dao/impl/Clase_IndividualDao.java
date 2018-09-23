package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IClase_IndividualDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Clase_Individual;

public class Clase_IndividualDao extends GenericDaoHibernetJpaImpl<Clase_Individual> implements
		IClase_IndividualDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Clase_Individual";
	 
		}

		
		public Clase_Individual findByClase_Individualname(String Clase_Individualname) {
			return null;
		}

		
		public List<Clase_Individual> retrieveAllAdminClase_Individual() {
			return null;
		}
	

}