package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ICronica_DiaDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Cronica_Dia;

public class Cronica_DiaDao extends GenericDaoHibernetJpaImpl<Cronica_Dia> implements
		ICronica_DiaDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Cronica_Dia";
	 
		}

		
		public Cronica_Dia findByCronica_Dianame(String Cronica_Dianame) {
			return null;
		}

		
		public List<Cronica_Dia> retrieveAllAdminCronica_Dia() {
			return null;
		}
	

}