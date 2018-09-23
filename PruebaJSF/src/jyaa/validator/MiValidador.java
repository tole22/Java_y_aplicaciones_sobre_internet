package jyaa.validator;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="validadorNombreApellido")
public class MiValidador implements Validator{

	
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
 
				if(((String)value).length()<2){
					
					ResourceBundle bundle = ResourceBundle.getBundle("messages");
					String mensaje = bundle.getString("validacion.nombres.longitud");
					
			FacesMessage msg = 
				new FacesMessage(FacesMessage.SEVERITY_ERROR,"Campos obligatorios", 
						mensaje);
			throw new ValidatorException(msg);
 
		}
 
	}
}