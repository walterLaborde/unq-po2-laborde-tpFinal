package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestriccionGeograficaTestCase {

	private RestriccionGeografica restriccionG;
	private int latitud;
	private int longitud;
	private int radio;
	
	@BeforeEach
	public void setup() {
		latitud = 30;
		longitud = 10;
		radio = 4;
		restriccionG = new RestriccionGeografica(latitud, longitud, radio);
	}
	
	@Test
	void testGetLatitud() {
		//setup
		//exercise
		//verify
		assertEquals(30,restriccionG.getLatitud());
	}

	@Test
	void testGetLongitud() {
		//setup
		//exercise
		//verify
		assertEquals(10,restriccionG.getLongitud());
	}

	@Test
	void testGetRadio() {
		//setup
		//exercise
		//verify
		assertEquals(4,restriccionG.getRadio());
	}
	
	@Test
	void testContieneTrue() {
		//setup
		Coordenada coordenada = new Coordenada(31, 12);
		//exercise
		//verify
		assertTrue(restriccionG.contiene(coordenada));
	}
	
	@Test
	void testContieneFalse() {
		//setup
		Coordenada coordenada = new Coordenada(33, 13);
		//exercise
		//verify
		assertFalse(restriccionG.contiene(coordenada));
	}
}
