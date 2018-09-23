package com.CEDICA.dao;

import java.util.List;

import com.CEDICA.dao.generic.GenericDao;
import com.CEDICA.model.Usuario;

public interface IUsuarioDao extends GenericDao<Usuario> {
	
	public Usuario findByUsername(String username);
	public List<Usuario> getUserByUsername(String username);

}
