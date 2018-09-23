package com.CEDICA.dao.impl;


import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.CEDICA.dao.ISolicitudDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Solicitud;

public class SolicitudDao extends GenericDaoHibernetJpaImpl<Solicitud>
		implements ISolicitudDao {
	
	@SuppressWarnings("unchecked")
	public List<Solicitud> listByEstado(String estado){
		Query query = this.getEntityManager().createQuery("SELECT s FROM Solicitud s WHERE s.estado = :estado");
		query.setParameter("estado", estado);
		try{
			return (List<Solicitud>) query.getResultList();	
		}catch(NoResultException nre ) {  
	        return null;  
	    }  
	}
}
