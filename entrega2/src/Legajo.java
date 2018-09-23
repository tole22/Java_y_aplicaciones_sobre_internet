
import java.util.Collection;





public class Legajo {
	public    String obs;
	public    String motivo_baja;
	public    Collection documentacion;
	public    Collection certificados;
	public Alumno alumno;
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getMotivo_baja() {
		return motivo_baja;
	}
	public void setMotivo_baja(String motivo_baja) {
		this.motivo_baja = motivo_baja;
	}
	public Collection getDocumentacion() {
		return documentacion;
	}
	public void setDocumentacion(Collection documentacion) {
		this.documentacion = documentacion;
	}
	public Collection getCertificados() {
		return certificados;
	}
	public void setCertificados(Collection certificados) {
		this.certificados = certificados;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
}
