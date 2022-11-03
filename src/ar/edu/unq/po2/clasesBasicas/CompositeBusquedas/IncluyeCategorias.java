package ar.edu.unq.po2.clasesBasicas.CompositeBusquedas;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.AdministradorProyectos;
import ar.edu.unq.po2.clasesBasicas.Proyecto;

public class IncluyeCategorias implements TipoDeBusqueda {

	@Override
	public List<Proyecto> buscarEnProyectos(String loQueBusco) {
		
		List<Proyecto> proyectos = 
				AdministradorProyectos.getProyectosDisponibles()
				.stream()
				.filter(proyIncCat -> proyIncCat.getCategorias().contains(loQueBusco)).toList();
		
		return proyectos;
	}

	@Override
	public void agregarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
	}

	@Override
	public void borrarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
	}
	
}
