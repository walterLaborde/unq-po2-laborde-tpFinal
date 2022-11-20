package ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos;

import ar.edu.unq.po2.tpfinal.Proyecto;
import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.CompuestoBinario;
import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.CondicionDeBusqueda;

public class OR extends CompuestoBinario{
	
	public OR(CondicionDeBusqueda condicion1, CondicionDeBusqueda condicion2) {
		
		this.setCondicion1(condicion1);
		this.setCondicion2(condicion2);
	}
	
	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return this.getCondicion1().seCumple(proyecto) || this.getCondicion2().seCumple(proyecto);
	}

}
