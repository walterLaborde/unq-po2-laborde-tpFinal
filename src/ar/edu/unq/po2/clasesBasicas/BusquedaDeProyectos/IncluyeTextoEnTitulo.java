package ar.edu.unq.po2.clasesBasicas.BusquedaDeProyectos;

import ar.edu.unq.po2.tpfinal.Proyecto;
import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.CondicionDeBusqueda;

public class IncluyeTextoEnTitulo extends CondicionDeBusqueda {

	private String textoABuscar;
	
	public IncluyeTextoEnTitulo(String textoABuscar) {
		
		this.setTextoABuscar(textoABuscar);
		
	}

	public String getTextoABuscar() {
		return textoABuscar;
	}

	public void setTextoABuscar(String textoABuscar) {
		this.textoABuscar = textoABuscar;
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return proyecto.getNombre().contains(this.getTextoABuscar());
	}

}
