package ar.edu.unq.po2.clasesBasicas.StateDesafios;

import java.time.LocalDate;

import ar.edu.unq.po2.tpfinal.StateDesafios.DesafioUsuario;
import ar.edu.unq.po2.tpfinal.StateDesafios.EstadoEnCurso;

//package ar.edu.unq.po2.TpFinal.StateDesafios;

public class EstadoPendiente extends EstadoDesafio {

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		
		return false;
	}

	@Override
	public float porcentajeDeCompletitud(DesafioUsuario desafio) {
 
		return 0.00f;
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) throws Exception {
		
		desafio.setEstado(new EstadoEnCurso());
		desafio.setFechaInicio(LocalDate.now());
		
	}

}