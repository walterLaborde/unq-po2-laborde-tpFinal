package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CategoriaTestCase {

	private Categoria categoria;
	private String nombre;
	
	
	@BeforeEach
	public void setup() {
		nombre = "Ciencias Naturales";
		categoria = new Categoria(nombre);
	}
	
	@Test
	void testGetNombre() {
		assertEquals("Ciencias Naturales",categoria.getNombre());
	}

}
