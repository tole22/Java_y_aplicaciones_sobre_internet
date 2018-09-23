package jyaa.aspectos;

import jyaa.modelo.Persona;

public aspect AspectoPrueba {
	
  //POINTCUTS	
  
     
   public pointcut seteoNombrePointcut(String unString):execution( void *.setNombre(String)) && args(unString);
   
   public pointcut seteoApellidoPointcut(String unString):execution( void *.setApellido(..)) && args(unString);
   
   public pointcut getDniPointcut(Persona p):call( * Persona.getDni()) && target(p);
   
   public pointcut getFechaNacimientoPointcut(Persona p):execution( * Persona.getFecha*()) && target(p);
   
      
  //ADVICES 
   
   void around(String unString): seteoNombrePointcut (unString){
	   proceed(capitalize(unString));
   }

   
   void around (String unString): seteoApellidoPointcut(unString){
	   proceed(capitalize((String)thisJoinPoint.getArgs()[0]).toUpperCase());
   }
     

   before(Persona persona): getDniPointcut(persona) {
	   System.out.println("Antes de devolver el DNI de "+persona+", se est� imprimiendo esto desde el m�todo "+thisEnclosingJoinPointStaticPart.getSignature());
   }
   
   after(Persona persona) : getFechaNacimientoPointcut(persona){
	   System.out.println("Despu�s de devolver la fecha de nacimiento de "+persona+", se est� imprimiendo esto desde el m�todo "+thisEnclosingJoinPointStaticPart.getSignature());
       
   }
   
  //M�TODO
  private String capitalize(String line)
  {
    return Character.toUpperCase(line.charAt(0)) + line.substring(1);
  }
}
