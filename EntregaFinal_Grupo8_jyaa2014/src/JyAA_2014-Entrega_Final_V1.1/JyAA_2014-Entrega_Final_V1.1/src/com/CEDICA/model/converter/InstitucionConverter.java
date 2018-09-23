package com.CEDICA.model.converter;


import java.util.ArrayList;
import java.util.List;
import com.CEDICA.dao.impl.InstitucionDao;
import com.CEDICA.model.Institucion;
 import javax.faces.application.FacesMessage;
 import javax.faces.component.UIComponent;
 import javax.faces.context.FacesContext;
 import javax.faces.convert.Converter;
 import javax.faces.convert.ConverterException;
 import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = com.CEDICA.model.Institucion.class,value="converterInstitucion")
public class InstitucionConverter implements Converter{
	 
	    public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {
	        if (submittedValue.trim().equals("")) {
	            return null;
	        } else {
	            try {
	                int number = Integer.parseInt(submittedValue);
	                InstitucionDao instDao = new InstitucionDao();
	                return instDao.findById(number);
	            } catch(NumberFormatException exception) {
	                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de Conversión", "Institución inválida"));
	            }
	        }	        
	    }

	    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
	        if (value == null || value.equals("")) {
	            return "";
	        } else {
	            return String.valueOf(((Institucion) value).getId());
	        }
	    }

}
