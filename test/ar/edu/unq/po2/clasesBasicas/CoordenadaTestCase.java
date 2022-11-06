package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoordenadaTestCase {

	private Coordenada coordenada;
	private int x;
	private int y;
	
	@BeforeEach
	public void setup() {
		x = 5;
		y = 6;
		coordenada = new Coordenada(x, y);
	}
	
	@Test
	void testGetX() {
		//setup
		//exercise
		//verify
		assertEquals(5,coordenada.getX());
	}
	
	@Test
	void testGetY() {
		//setup
		//exercise
		//verify
		assertEquals(6,coordenada.getY());
	}

}
