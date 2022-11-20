package ar.edu.unq.po2.clasesBasicas.CompositeBusquedas;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.AdministradorProyectos;
import ar.edu.unq.po2.clasesBasicas.Proyecto;

public interface TipoDeBusqueda {
	
	public abstract List<Proyecto> buscarEnProyectos(String loQueBusco);
	public abstract void agregarTipoDeBusqueda(TipoDeBusqueda nuevoTipo);
	public abstract void borrarTipoDeBusqueda(TipoDeBusqueda nuevoTipo);
}
