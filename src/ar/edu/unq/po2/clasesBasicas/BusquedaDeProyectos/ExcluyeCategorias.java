package ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.AdministradorProyectos;
import ar.edu.unq.po2.clasesBasicas.Proyecto;
import ar.edu.unq.po2.tpfinal.Categoria;
import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.CondicionDeBusqueda;

public class ExcluyeCategorias extends CondicionDeBusqueda{
	
	private List<Categoria> categorias; 

	public ExcluyeCategorias(List<Categoria> categorias) {

		this.setCategorias(categorias);
	}
		
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return !this.getCategorias().stream().anyMatch(categoria -> proyecto.getCategorias().contains(categoria));
	}

}
