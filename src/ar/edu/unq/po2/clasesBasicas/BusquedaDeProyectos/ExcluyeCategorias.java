package ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.clasesBasicas.*;

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
	public List<Proyecto> seCumple(Proyecto proyecto) {
		
		return !this.getCategorias().stream().anyMatch(categoria -> proyecto.getCategorias().contains(categoria));
	}

}
