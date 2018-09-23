package com.CEDICA.dao.impl;

import java.io.Serializable;

import javax.persistence.Query;


import com.CEDICA.dao.IUsuarioDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Usuario;

public class UsuarioDao extends GenericDaoHibernetJpaImpl<Usuario> implements
		IUsuarioDao {

	public Usuario findByUsername(String username){
		Query query = this.getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.nombre = :username");
		query.setParameter("username", username);
		return (Usuario) query.getSingleResult();		
	}

}
