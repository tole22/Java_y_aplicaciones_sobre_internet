package com.CEDICA.dao.impl;



import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.CEDICA.dao.IInstitucionDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Institucion;


public class InstitucionDao extends GenericDaoHibernetJpaImpl<Institucion>
		implements IInstitucionDao {

	
public Institucion findByUsername(String username){
		
		Query query = this.getEntityManager().createQuery("SELECT i FROM Institucion i WHERE i.username = :username");
		query.setParameter("username", username);
		try{
			return (Institucion) query.getSingleResult();	
		}catch(NoResultException nre ) {  
	        return null;  
	    } 		
		
	}
	
	

}
