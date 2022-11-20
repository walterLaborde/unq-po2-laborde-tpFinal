package ar.edu.unq.po2.clasesBasicas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos.TipoDeBusqueda;
import ar.edu.unq.po2.tpfinal.Proyecto;
import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.CondicionDeBusqueda;

public class AdministradorProyectos {
	
	private List<Proyecto> proyDisponibles;
	
	public AdministradorDeProyectos() {
		
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
		
		return this.getProyDisponibles().stream().filter(proyecto -> condicion.seCumple(proyecto)).toList();
	}

}
