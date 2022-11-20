package ar.edu.unq.po2.clasesBasicas.CompositeBusquedas;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.AdministradorProyectos;
import ar.edu.unq.po2.clasesBasicas.Proyecto;

public class BuscadorAndOr implements TipoDeBusqueda {

	private List<TipoDeBusqueda> busquedasAndOr;
	
	@Override
	public List<Proyecto> buscarEnProyectos(String loQueBusco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
		// TODO Auto-generated method stub
		
	}

	public List<TipoDeBusqueda> getBusquedasAndOr() {
		return busquedasAndOr;
	}

	public void setBusquedasAndOr(List<TipoDeBusqueda> busquedasAndOr) {
		this.busquedasAndOr = busquedasAndOr;
	}


	
}
