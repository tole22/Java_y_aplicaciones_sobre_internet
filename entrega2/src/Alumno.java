


public class Alumno extends Persona {
	public    String lugar;
	public    String provincia;
	public    String obra_social;
	public    String telefono;
	public    String diagnostico;
	public Familiar familiar;
	public Legajo nro_legajo;
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getObra_social() {
		return obra_social;
	}
	public void setObra_social(String obra_social) {
		this.obra_social = obra_social;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Familiar getFamiliar() {
		return familiar;
	}
	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}
	public Legajo getNro_legajo() {
		return nro_legajo;
	}
	public void setNro_legajo(Legajo nro_legajo) {
		this.nro_legajo = nro_legajo;
	}
}
