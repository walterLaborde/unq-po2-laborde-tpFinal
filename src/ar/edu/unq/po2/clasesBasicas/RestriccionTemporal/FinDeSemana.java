package ar.edu.unq.po2.clasesBasicas.RestriccionTemporal;

//package ar.edu.unq.po2.TpFinal.CompositeRestriccion;

import java.time.LocalDate;

public class FinDeSemana extends Restriccion {
	
	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue() > 5;
	}

	@Override
	public void agregarRestriccion(Restriccion restriccion) {
	}

	@Override
	public void borrarRestriccion(Restriccion restriccion) {
	}

}