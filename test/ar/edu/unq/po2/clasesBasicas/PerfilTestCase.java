package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito.*;

import ar.edu.unq.po2.clasesBasicas.StrategyRecomendacion.RecomendadorDesafios;

class PerfilTestCase {

	private Perfil perfil; // sut
	private int cantMuestrasARecolectar; 
	private int dificultad; 
	private int recompensasPreferidas;
	
	@Mock private RecomendadorDesafios recomendador;
	
	@BeforeEach
	public void setup() {
		perfil = new Perfil(10, 4, 30, recomendador);
		recomendador = mock(RecomendadorDesafios.class);
	}
	
	@Test
	void testGetCantMuestrasARecolectar() {
		//setup
		
		//exercise
		
		//verify
		assertEquals(10,perfil.getCantMuestrasARecolectar());
	}
	
	@Test
	void testSetCantMuestrasARecolectar() {
		//setup
		
		//exercise
		perfil.setCantMuestrasARecolectar(7);
		//verify
		assertEquals(7,perfil.getCantMuestrasARecolectar());
	}	
	
	@Test
	void testGetDificultad() {
		//setup
		
		//exercise
		
		//verify
		assertEquals(4,perfil.getDificultad());
	}
	
	@Test
	void testSetDificultad() {
		//setup
		
		//exercise
		perfil.setDificultad(2);
		//verify
		assertEquals(2,perfil.getDificultad());
	}

}
