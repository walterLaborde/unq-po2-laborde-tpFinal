package ar.edu.unq.po2.clasesBasicas.StateDesafios;

import java.time.LocalDate;

public class EstadoEnCurso extends EstadoDesafio{

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		
		if (this.porcentajeDeCompletitud(desafio) == 1.00f) {
			desafio.setEstado(new EstadoCompleto());
			desafio.setFechaCompletado(LocalDate.now());
		}
		
		return this.porcentajeDeCompletitud(desafio) == 1;
	}

	@Override
	public float porcentajeDeCompletitud(DesafioUsuario desafio) {
		
		return (float)desafio.cantidadDeMuestrasValidas() / desafio.getDesafio().getCantidadDeMuestras();
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) {
		
	}

}
