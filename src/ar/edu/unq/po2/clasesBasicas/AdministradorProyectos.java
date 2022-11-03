package ar.edu.unq.po2.clasesBasicas;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.CompositeBusquedas.TipoDeBusqueda;

public class AdministradorProyectos {
	
	private TipoDeBusqueda tipoDeBusqueda;
	private String loQueBusco;
	private static List<Proyecto> proyectosDisponibles;
	
	public void AdministradorProyectos() {
		this.setProyectosDisponibles(proyectosDisponibles);
	}

	public static List<Proyecto> getProyectosDisponibles() {
		return proyectosDisponibles;
	}

	private void setProyectosDisponibles(List<Proyecto> proyectosDisponibles) {
		this.proyectosDisponibles = proyectosDisponibles;
	}
	
	public String getLoQueBusco() {
		return loQueBusco;
	}
	
	private void setLoQueBusco(String loBuscado) {
		this.loQueBusco = loBuscado;
	}

}
