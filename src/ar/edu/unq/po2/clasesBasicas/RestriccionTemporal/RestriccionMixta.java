package ar.edu.unq.po2.clasesBasicas.RestriccionTemporal;

//package ar.edu.unq.po2.TpFinal.CompositeRestriccion;

import java.time.LocalDate;
import java.util.List;

public class RestriccionMixta extends Restriccion{
	//comentario para pushear
	
	private List<Restriccion> restricciones;
	
	public RestriccionMixta(List<Restriccion> restricciones) {
		this.setRestricciones(restricciones);
	}

	public List<Restriccion> getRestricciones() {
		return this.restricciones;
	}

	public void setRestricciones(List<Restriccion> restricciones) {
		this.restricciones = restricciones;
	}

	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return this.getRestricciones().stream().allMatch(restriccion -> restriccion.estaHabilitado(fecha));
	}

	@Override
	public void agregarRestriccion(Restriccion restriccion) {
		this.getRestricciones().add(restriccion);
	}

	@Override
	public void borrarRestriccion(Restriccion restriccion) {
		this.getRestricciones().remove(restriccion);
	}
}