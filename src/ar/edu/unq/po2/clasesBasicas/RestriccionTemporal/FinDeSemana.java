package ar.edu.unq.po2.clasesBasicas.CompositeRestriccion;

//package ar.edu.unq.po2.TpFinal.CompositeRestriccion;

import java.time.LocalDate;

public class FinDeSemana extends TipoDeRestriccion {
	
	public FinDeSemana() {
		
	}
	
	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue() > 5;
	}

	@Override
	public void agregarRestriccion(TipoDeRestriccion restriccion) {
	}

	@Override
	public void borrarRestriccion(TipoDeRestriccion restriccion) {
	}

}