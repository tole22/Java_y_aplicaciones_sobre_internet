package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IClase_TallerDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Clase_Taller;

public class Clase_TallerDao extends GenericDaoHibernetJpaImpl<Clase_Taller> implements
		IClase_TallerDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Clase_Taller";
	 
		}

		
		public Clase_Taller findByClase_Tallername(String Clase_Tallername) {
			return null;
		}

		
		public List<Clase_Taller> retrieveAllAdminClase_Taller() {
			return null;
		}
	

}