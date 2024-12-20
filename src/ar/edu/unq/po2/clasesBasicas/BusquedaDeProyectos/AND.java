package ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos;

import ar.edu.unq.po2.clasesBasicas.*;

public class AND extends CompuestoBinario{
	
	public AND(CondicionDeBusqueda condicion1, CondicionDeBusqueda condicion2) {
		
		this.setCondicion1(condicion1);
		this.setCondicion2(condicion2);
	}

	@Override
	public boolean seCumple(List<Proyecto> proyecto) {
		
		return this.getCondicion1().seCumple(proyecto) && this.getCondicion2().seCumple(proyecto);
	}

}
