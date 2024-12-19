package ar.edu.unq.po2.clasesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos.*;

public class Sistema {
	
	private List<Proyecto> proyDisponibles;
	
	public Sistema() {
		
		this.proyDisponibles = new ArrayList<Proyecto>(); 
	}
	
	public void addProyecto(Proyecto proyecto) {
		
		this.getProyDisponibles().add(proyecto);
	}

	public List<Proyecto> getProyDisponibles() {
		return proyDisponibles;
	}

	public void setProyDisponibles(List<Proyecto> proyDisponibles) {
		this.proyDisponibles = proyDisponibles;
	}
	
	public List<Proyecto> filtrarProyectos(CondicionDeBusqueda condicion) {
		
		return condicion.seCumple(this.getProyDisponibles());

		//List<Categoria> catDeProyectos = this.getProyDisponibles().stream().map(proyecto -> proyecto.getCategorias()).toList();
		
		//return this.getProyDisponibles().stream().filter(proyecto -> condicion.seCumple(proyecto)).toList();
	}

}
