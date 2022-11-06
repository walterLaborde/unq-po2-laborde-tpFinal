package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class MuestraTestCase {

	private Muestra muestra;
	@Mock private Coordenada coordenada; 
	@Mock private Usuario usuario; 
	private LocalDate fecha; 
	private LocalTime hora;
	
	@BeforeEach
	public void setup() {
		fecha = LocalDate.of(2022, 5, 11);
		hora = LocalTime.of(15, 25);
		coordenada = mock(Coordenada.class);
		usuario = mock(Usuario.class);
		muestra = new Muestra(coordenada, usuario, fecha, hora);
	}
	
	@Test
	void testGetCoordenada() {
		//setup
		//exercise
		//verify
		assertEquals(coordenada,muestra.getCoordenada());
	}
	
	@Test
	void testGetUsuario() {
		//setup
		//exercise
		//verify
		assertEquals(usuario,muestra.getUsuario());
	}
		
	@Test
	void testGetFecha() {
		//setup
		//exercise
		//verify
		assertEquals(LocalDate.of(2022, 5, 11),muestra.getFecha());
	}

	@Test
	void testGetHora() {
		//setup
		//exercise
		//verify
		assertEquals(LocalTime.of(15,25),muestra.getHora());
	}	
	
}
