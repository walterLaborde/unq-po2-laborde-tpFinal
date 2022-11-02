package ar.edu.unq.po2.clasesBasicas.CompositeBusquedas;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.AdministradorProyectos;
import ar.edu.unq.po2.clasesBasicas.Proyecto;

public interface TipoDeBusqueda {
	
	public abstract List<Proyecto> buscarEnProyectos(List<Proyecto> list, List<String> loQueBusco); 
}
