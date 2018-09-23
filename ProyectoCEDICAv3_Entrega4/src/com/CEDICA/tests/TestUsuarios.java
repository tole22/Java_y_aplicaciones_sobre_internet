package com.CEDICA.tests;


import com.CEDICA.dao.impl.UsuarioDao;
import com.CEDICA.model.Usuario;
import com.CEDICA.model.Rol;

public class TestUsuarios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UsuarioDao usuarioDao = new UsuarioDao();		
		//creación
		Rol rol = new Rol();		
		rol.setRol("ROLE_ADMIN");		
		Usuario usuario1 = new Usuario("max","tole",rol);
		usuarioDao.save(usuario1);
		
		Usuario usuario2 = new Usuario("agusitn","tole",rol);
		usuarioDao.save(usuario2);
		
		Usuario usuario3 = new Usuario("lope","tole",rol);
		usuarioDao.save(usuario3);
		
		Usuario usuario4 = new Usuario("diego","tole",rol);
		usuarioDao.save(usuario4);
		//listado luego de agregado los usuarios
		System.out.println("Listado:");
		for (Usuario u : usuarioDao.list()) {
            System.out.println(u.getId() + " - " + u.getUsername()+ " - " + u.getRoles().iterator().next().getRol());
        }
		
		//modificación
		usuario1.setUsername("fabi");
		usuarioDao.update(usuario1);
		
		//listado luego de modificado el username del usuario1
		System.out.println("Listado luego de modificado el username del usuario1:");
		for (Usuario u : usuarioDao.list()) {
            System.out.println(u.getId() + " - " + u.getUsername()+ " - " + u.getRoles().iterator().next().getRol());
        }
		
		//eliminación
		usuarioDao.delete(usuario4);
		
		//Listado luego de eliminado el usuario4
		System.out.println("Listado luego de eliminado el usuario4:");
		for (Usuario u : usuarioDao.list()) {			
		    System.out.println(u.getId() + " - " + u.getUsername()+ " - " + u.getRoles().iterator().next().getRol());
		}
		
		
		

	}

}
