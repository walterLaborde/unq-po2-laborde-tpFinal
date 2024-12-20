package ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.Proyecto;

public abstract class CondicionDeBusqueda {
	
	public abstract boolean seCumple(List<Proyecto> proyectos);
	

}
