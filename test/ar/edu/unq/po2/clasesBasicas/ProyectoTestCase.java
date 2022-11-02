package ar.edu.unq.po2.clasesBasicas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class ProyectoTestCase {
	
	private Proyecto proyect; //sut
	private String nombre1; 
	private String nombre2; 
	private String descripcion1;
	private String descripcion2;
	private Categoria categoria1;
	private Categoria categoria2;
	private Categoria categoria3;
	@Mock private Usuario participante1;
	@Mock private Usuario participante2;
	@Mock private Usuario participante3;
	@Mock private Muestra muestra1;
	@Mock private Muestra muestra2;
	@Mock private Muestra muestra3;
	@Mock private Desafio desafioU1;
	@Mock private Desafio desafioU2;
	@Mock private Desafio desafioU3;
	private List<Categoria> categorias;
	private List<Usuario> participantes; 
	private List<Muestra> muestrasRecolectadas; 
	private List<Desafio> desafios;
	
	@BeforeEach
	public void setup() {
	
		proyect = new Proyecto(nombre1, descripcion1, categorias);
		nombre1 = "ProyectoPrueba";
		nombre2 = "ProyectoPrueba2";
		descripcion1 = "Ciencias naturales";
		descripcion2 = "Ciencias Sociales";
		categoria1 = mock(Categoria.class);
		categoria2 = mock(Categoria.class); 
		categoria3 = mock(Categoria.class);
		participante1 = mock(Usuario.class);
		participante2 = mock(Usuario.class);
		participante3 = mock(Usuario.class);
		muestra1 = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
		muestra3 = mock(Muestra.class);
		desafioU1 = mock(Desafio.class);
		desafioU2 = mock(Desafio.class);
		desafioU3 = mock(Desafio.class);
		List<Categoria> categorias = new ArrayList<Categoria>();
		List<Usuario> participantes = new ArrayList<Usuario>();
		List<Muestra> muestrasRecolectadas = new ArrayList<Muestra>();
		List<Desafio> desafios = new ArrayList<Desafio>();
	}
	
	//setter y getter
	
	@Test
	void testSetNombre() {
		//setup
		proyect.getMuestrasRecolectadas();
		//excercise
		proyect.setNombre("hola");
		//verify
		assertEquals("hola",proyect.getNombre());
	}
	
	
	@Test
	void testMuestrasRecolectadas() {
		//setup
		proyect.addMuestra(muestra1);
		proyect.addMuestra(muestra2);
		List<Muestra> muestrasTest = Arrays.asList(muestra1,muestra2);
		//excercise
		proyect.getMuestrasRecolectadas();
		//verify
		assertEquals(muestrasTest,proyect.getMuestrasRecolectadas());
	}
	
	@Test
	void testGetParticipantes() {
		//setup
		proyect.addParticipante(participante1);
		proyect.addParticipante(participante2);
		List<Usuario> participanteTest = Arrays.asList(participante1,participante2);
		//excercise
		proyect.getParticipantes();
		//verify
		assertEquals(participanteTest,proyect.getParticipantes());
	}

	@Test
	void testAddMuestra() {
		//setup
		List<Muestra> muestrasTest = Arrays.asList(muestra1);
		//excercise
		proyect.addMuestra(muestra1);
		//verify
		assertEquals(muestrasTest,proyect.getMuestrasRecolectadas());
	}

	@Test
	void testAddParticipante() {
		//setup
		List<Muestra> muestrasTest = Arrays.asList(muestra1);
		//excercise
		proyect.addMuestra(muestra1);
		//verify
		assertEquals(muestrasTest,proyect.getMuestrasRecolectadas());
	}
	
	
	
	
}
