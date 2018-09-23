package com.CEDICA.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;





import com.CEDICA.dao.IUsuarioDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Usuario;

public class UsuarioDao extends GenericDaoHibernetJpaImpl<Usuario> implements
		IUsuarioDao {

	public Usuario findByUsername(String username){
		
		Query query = this.getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.username = :username");
		query.setParameter("username", username);
		try{
			return (Usuario) query.getSingleResult();	
		}catch(NoResultException nre ) {  
	        return null;  
	    }  
		
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUserByUsername(String username) {
	    String queryString = "SELECT u FROM Usuario u " +
	                         "WHERE u.username = :username";
	    Query query = getEntityManager().createQuery(queryString);
	 
	    query.setParameter("username", username);
	    return query.getResultList();
	}
		
}
