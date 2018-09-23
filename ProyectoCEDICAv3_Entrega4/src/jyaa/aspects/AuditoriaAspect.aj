package jyaa.aspects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import com.CEDICA.dao.impl.RegistroOperacionesDAO;
import com.CEDICA.model.RegistroOperaciones;



public aspect AuditoriaAspect {
		public String id_entidad;
		
		//POINTCUTS	
		
		public pointcut savePointcut(Object o): execution( * com.CEDICA.dao.generic.*Dao.save(..)) && args(o);
		
		public pointcut deletePointcut(Object o): execution( * com.CEDICA.dao.generic.*Dao.delete(..)) && args(o);
		  
		public pointcut updatePointcut(Object o): execution( * com.CEDICA.dao.generic.*Dao.update(..)) && args(o);  

		@SuppressWarnings({ "unchecked"})
		
		//AUDITORIA DE "SAVE"
		after(Object o): savePointcut(o) 
		    {
			   RegistroOperacionesDAO roDao= new RegistroOperacionesDAO();
			   
			   
			   if(! o.getClass().getName().toString().equals("com.CEDICA.model.RegistroOperaciones") ){
			   
		        //OBTENGO ID DE LA ENTIDAD
				Class miClase = o.getClass();
		        
		        Method method = null;
		        try{
		        	method=miClase.getMethod("getId");
		        }
		        catch(NoSuchMethodException e){
		        	e.printStackTrace();
		        }
		        try {	
		        Object resultado = method.invoke(o);
		        id_entidad = resultado.toString();
		        
		        } catch (IllegalArgumentException e) {
		        } catch (IllegalAccessException e) {
		        } catch (InvocationTargetException e) {
		        
		        }
		        
		        String nombre =o.getClass().getName();
				   
		        Date fecha = new Date();
		        
		        String nombre_metodo = "save";
		        
		        RegistroOperaciones ro1= new RegistroOperaciones(nombre_metodo,fecha,nombre,id_entidad);
		        
		        roDao.save(ro1);
		        
			   }
		    
		    }
		
		//AUDITORIA DE "DELETE"
		   after(Object o): deletePointcut(o) 
		    {
			   RegistroOperacionesDAO roDao= new RegistroOperacionesDAO();
			   
			   
			   if(! o.getClass().getName().toString().equals("com.CEDICA.model.RegistroOperaciones") ){
			   
		        //OBTENGO ID DE LA ENTIDAD
		        Class miClase = o.getClass();
		        
		        Method method = null;
		        try{
		        	method=miClase.getMethod("getId");
		        }
		        catch(NoSuchMethodException e){
		        	e.printStackTrace();
		        }
		        try {	
		        Object resultado = method.invoke(o);
		        id_entidad = resultado.toString();
		        } catch (IllegalArgumentException e) {
		        } catch (IllegalAccessException e) {
		        } catch (InvocationTargetException e) {
		        
		        }
		        
		        String nombre =o.getClass().getName();
				   
		        Date fecha = new Date();
		        
		        String nombre_metodo = "delete";
		        
		        RegistroOperaciones ro1= new RegistroOperaciones(nombre_metodo,fecha,nombre,id_entidad);
		        
		        roDao.save(ro1);
		        
			   }
		    
		    }
		 //AUDITORIA DE "UPDATE"
		   after(Object o): updatePointcut(o) 
		    {
			   RegistroOperacionesDAO roDao= new RegistroOperacionesDAO();
			   
			   if(! o.getClass().getName().toString().equals("com.CEDICA.model.RegistroOperaciones") ){
			   
		        
		        //OBTENGO ID DE LA ENTIDAD
		        Class miClase = o.getClass();
		        
		        Method method = null;
		        try{
		        	method=miClase.getMethod("getId");
		        }
		        catch(NoSuchMethodException e){
		        	e.printStackTrace();
		        }
		        try {	
		        Object resultado = method.invoke(o);
		        id_entidad = resultado.toString();
		        } catch (IllegalArgumentException e) {
		        } catch (IllegalAccessException e) {
		        } catch (InvocationTargetException e) {
		        
		        }
		        
		        String nombre =o.getClass().getName();
				   
		        Date fecha = new Date();
		        
		        String nombre_metodo = "update";
		        
		        RegistroOperaciones ro1= new RegistroOperaciones(nombre_metodo,fecha,nombre,id_entidad);
		        
		        roDao.save(ro1);
		        
			   }
		    
		    }
		
}
