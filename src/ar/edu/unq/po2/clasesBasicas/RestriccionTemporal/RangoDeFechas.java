package ar.edu.unq.po2.clasesBasicas.RestriccionTemporal;

//package ar.edu.unq.po2.TpFinal.CompositeRestriccion;

import java.time.LocalDate;

public class RangoDeFechas extends Restriccion{
	
	private LocalDate inicio;
	private LocalDate fin;
	
	public RangoDeFechas(LocalDate inicio,LocalDate fin) {
		this.setInicio(inicio);
		this.setFin(fin);
	}
	
	private LocalDate getInicio() {
		return this.inicio;
	}

	private void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	private LocalDate getFin() {
		return this.fin;
	}

	private void setFin(LocalDate fin) {
		this.fin = fin;
	}


	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return fecha.isAfter(this.getInicio().minusDays(1)) && fecha.isBefore(this.getFin().plusDays(1));
	}

	@Override
	public void agregarRestriccion(Restriccion restriccion) {
	}

	@Override
	public void borrarRestriccion(Restriccion restriccion) {
	}


}