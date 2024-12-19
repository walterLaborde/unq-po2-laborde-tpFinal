package ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.clasesBasicas.*;

public class IncluyeCategorias extends CondicionDeBusqueda{
	
	private List<Categoria> categorias; 

	public IncluyeCategorias(List<Categoria> categorias) {
		
		this.setCategorias(categorias);
	}
		
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Override
	public List<Proyecto> seCumple(List<Proyecto> proyectos) {
		List<Proyecto> proyectosQueIncluyenLasCategorias = new ArrayList<Proyecto>();
		for(Proyecto proyecto : proyectos) {
			if(this.incluyeTodasLasCategorias(proyecto)) {
				proyectosQueIncluyenLasCategorias.add(proyecto);
			}
		}
		return proyectosQueIncluyenLasCategorias;
	}

	public boolean incluyeTodasLasCategorias(Proyecto proyecto) {
		return proyecto.getCategorias().containsAll(this.getCategorias());
	}

}
