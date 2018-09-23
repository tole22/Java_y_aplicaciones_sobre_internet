
import java.util.Date;




public class Cronica_Profesional {
	public    String texto_libre;
	public    Date fecha;
	public Coordinador coordinador;
	public Alumno alumno;
	public Caballo caballo;
	public String getTexto_libre() {
		return texto_libre;
	}
	public void setTexto_libre(String texto_libre) {
		this.texto_libre = texto_libre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Coordinador getCoordinador() {
		return coordinador;
	}
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Caballo getCaballo() {
		return caballo;
	}
	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}
}
