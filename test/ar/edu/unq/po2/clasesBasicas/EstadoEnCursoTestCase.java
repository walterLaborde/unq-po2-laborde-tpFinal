package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.clasesBasicas.StateDesafios.DesafioUsuario;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.EstadoDesafio;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.EstadoEnCurso;

class EstadoEnCursoTestCase {

	private EstadoEnCurso estadoEnCurso;
	@Mock private DesafioUsuario desafioU1;
	@Mock private Desafio desafio;
	
	@BeforeEach
	public void setup() {
		estadoEnCurso = new EstadoEnCurso();
		desafioU1 = mock(DesafioUsuario.class);
		desafio = mock(Desafio.class);
	}
	
	@Test
	void testEstaCompletoTrue() {
		//setup
		when(desafioU1.cantidadDeMuestrasValidas()).thenReturn(1);
		when(desafioU1.getDesafio()).thenReturn(desafio);
		when(desafioU1.getDesafio().getCantidadDeMuestras()).thenReturn(1);
		//exercise
		estadoEnCurso.estaCompleto(desafioU1);
		//verify
		assertTrue(estadoEnCurso.estaCompleto(desafioU1));
	}
	
	@Test
	void testEstaCompletoFalse() {
		//setup
		when(desafioU1.cantidadDeMuestrasValidas()).thenReturn(1);
		when(desafioU1.getDesafio()).thenReturn(desafio);
		when(desafioU1.getDesafio().getCantidadDeMuestras()).thenReturn(3);
		//exercise
		estadoEnCurso.estaCompleto(desafioU1);
		//verify
		assertFalse(estadoEnCurso.estaCompleto(desafioU1));
	}

	@Test
	void testPorcentajeDeCompletitud() {
		//setup
		when(desafioU1.cantidadDeMuestrasValidas()).thenReturn(2);
		when(desafioU1.getDesafio()).thenReturn(desafio);
		when(desafioU1.getDesafio().getCantidadDeMuestras()).thenReturn(4);
		//exercise
		estadoEnCurso.porcentajeDeCompletitud(desafioU1);
		//verify
		assertEquals(0.50, estadoEnCurso.porcentajeDeCompletitud(desafioU1));
	}	

}
