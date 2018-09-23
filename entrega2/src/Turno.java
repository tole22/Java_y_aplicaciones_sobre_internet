import java.sql.Time;
import java.util.Date;




public class Turno {
	public    Time hora_inicio;
	public    Time hora_fin;
	public    Integer dia_semana;
	public    Date fecha;
	public Grilla grilla_sede;
	public Time getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(Time hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public Time getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(Time hora_fin) {
		this.hora_fin = hora_fin;
	}
	public Integer getDia_semana() {
		return dia_semana;
	}
	public void setDia_semana(Integer dia_semana) {
		this.dia_semana = dia_semana;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Grilla getGrilla_sede() {
		return grilla_sede;
	}
	public void setGrilla_sede(Grilla grilla_sede) {
		this.grilla_sede = grilla_sede;
	}
}
