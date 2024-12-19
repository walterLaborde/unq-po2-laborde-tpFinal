package ar.edu.unq.po2.clasesBasicas;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos.CondicionDeBusqueda;
import ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos.IncluyeCategorias;

class IncluyeCategoriasTestCase {

	private Usuario user1;
	private Perfil perf1;
	private Proyecto proy1;
	private Proyecto proy2;
	private Proyecto proy3;
	private Categoria cat1;
	private Categoria cat2;
	private Categoria cat3;
	private Sistema sist1;
	private IncluyeCategorias inclCat;
	
	@BeforeEach
	private void setup() throws Exception {
		List<Categoria> cats123 = Arrays.asList(cat1,cat2,cat3); 
		List<Categoria> cats12 = Arrays.asList(cat1,cat2); 
		List<Categoria> cats3 = Arrays.asList(cat3); 
		perf1 = new Perfil(0, 0, 0, null);
		user1 = new Usuario(perf1);
		proy1 = new Proyecto(null, null, cats123);
		proy2 = new Proyecto(null, null, cats12);
		proy3 = new Proyecto(null, null, cats12);
		sist1 = new Sistema();
		sist1.addProyecto(proy1);
		sist1.addProyecto(proy2);
		sist1.addProyecto(proy3);
		inclCat = new IncluyeCategorias(cats3);
	}
	
	
	@Test
	void testIncluyeCategorias123() {
		//setup
		List<Proyecto> proyCat1 = Arrays.asList(proy1);
		//exercise
		user1.buscarProyectosPor(inclCat, sist1);
		//verify
		assertEquals(proyCat1,user1.buscarProyectosPor(inclCat, sist1));
	}
	
	@Test
	void testIncluyeTodasLasCategorias() {
		//setup
		//List<Proyecto> proyCat1 = Arrays.asList(proy1);
		
		//exercise
		inclCat.incluyeTodasLasCategorias(proy1);
		//user1.buscarProyectosPor(inclCat, sist1);
		//verify
		assertTrue(inclCat.incluyeTodasLasCategorias(proy1));
	}

}
