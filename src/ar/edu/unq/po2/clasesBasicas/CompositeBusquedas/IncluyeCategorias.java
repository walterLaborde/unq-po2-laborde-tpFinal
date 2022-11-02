package ar.edu.unq.po2.clasesBasicas.CompositeBusquedas;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.AdministradorProyectos;
import ar.edu.unq.po2.clasesBasicas.Proyecto;

public class IncluyeCategorias implements TipoDeBusqueda {

	@Override
	public List<Proyecto> buscarEnProyectos(AdministradorProyectos adm, List<String> loQueBusco) {
		
		List<Proyecto> proyectos = adm.getProyectosDisponibles();
		adm.getLoQueBusco().stream().forEach(texto -> proyectos.stream().map());
		return null;
	}

	
}
