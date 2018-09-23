package com.CEDICA.dao;

import com.CEDICA.dao.generic.GenericDao;
import com.CEDICA.model.Usuario;

public interface IUsuarioDao extends GenericDao<Usuario> {
	
	public Usuario findByUsername(String username);

}
