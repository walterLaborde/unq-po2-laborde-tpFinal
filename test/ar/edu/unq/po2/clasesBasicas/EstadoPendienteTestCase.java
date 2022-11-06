package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.clasesBasicas.StateDesafios.DesafioUsuario;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.EstadoDesafio;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.EstadoEnCurso;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.EstadoPendiente;

class EstadoPendienteTestCase {

	private EstadoPendiente estadoPend;
	@Mock private EstadoDesafio estadoEnCurso;
	@Mock private DesafioUsuario desafioU1;
	@Mock private Desafio desafio;
	
	@BeforeEach
	public void setup() {
		estadoPend = new EstadoPendiente();
		desafioU1 = mock(DesafioUsuario.class);
		desafio = mock(Desafio.class);
		estadoEnCurso = mock(EstadoDesafio.class);
	}
	
	@Test
	void testEstaCompleto() {
		//setup
	
		//exercise
		
		//verify
		assertFalse(estadoPend.estaCompleto(desafioU1));
	}
	

	@Test
	void testPorcentajeDeCompletitud() {
		//setup

		//exercise

		//verify
		assertEquals(0.00f, estadoPend.porcentajeDeCompletitud(desafioU1));
	}
	
	@Test
	void testSerAceptado() {
		//setup
		//exercise
		estadoPend.serAceptado(desafioU1);
		//verify
		verify(desafioU1).setEstado(estadoEnCurso);
	}	

}
