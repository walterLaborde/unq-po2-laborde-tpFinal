package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito.*;

import ar.edu.unq.po2.clasesBasicas.StrategyRecomendacion.RecomendadorDesafios;

class PerfilTest {

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
	void test() {
		fail("Not yet implemented");
	}

}
