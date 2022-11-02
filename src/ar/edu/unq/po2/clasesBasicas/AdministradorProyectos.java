package ar.edu.unq.po2.clasesBasicas;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.CompositeBusquedas.TipoDeBusqueda;

public class AdministradorProyectos {
	
	private TipoDeBusqueda tipoDeBusqueda;
	private List<String> loQueBusco;
	private List<Proyecto> proyectosDisponibles;
	
	public void AdministradorProyectos() {
		this.setProyectosDisponibles(proyectosDisponibles);
	}

	public List<Proyecto> getProyectosDisponibles() {
		return proyectosDisponibles;
	}

	private void setProyectosDisponibles(List<Proyecto> proyectosDisponibles) {
		this.proyectosDisponibles = proyectosDisponibles;
	}
	
	public List<String> getLoQueBusco() {
		return loQueBusco;
	}
	
	private void setLoQueBusco(List<String> loBuscado) {
		this.getLoQueBusco().addAll(loBuscado);
	}

	public List<Proyecto> buscarProyectosPor(List<String> catOTit, TipoDeBusqueda modoDeBuscar) {
		modoDeBuscar.buscarEnProyectos(this.getProyectosDisponibles(), catOTit);
		return null;
	}
	
}
