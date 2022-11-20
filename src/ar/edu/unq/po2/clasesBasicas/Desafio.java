package ar.edu.unq.po2.clasesBasicas;                                       // w
import ar.edu.unq.po2.clasesBasicas.RestriccionTemporal.TipoDeRestriccion;
import ar.edu.unq.po2.tpfinal.Muestra;
import ar.edu.unq.po2.tpfinal.RestriccionGeografica;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.Restriccion;

//package ar.edu.unq.po2.TpFinal;
//import ar.edu.unq.po2.TpFinal.CompositeRestriccion.*;

public class Desafio implements ElementoDeLudificacion {
		
	private RestriccionGeografica area; 
	private Restriccion restriccion; 
	private int cantidadDeMuestras; 
	private int dificultad; 
	private int recompensa; 
	
	public Desafio(RestriccionGeografica area, Restriccion restriccion, int cant, int dif, int recompensa) {
		
		this.setArea(area);
		this.setRestriccion(restriccion);
		this.setCantidadDeMuestras(cant);
		this.setDificultad(dif);
		this.setRecompensa(recompensa);
		
	}
	
	public RestriccionGeografica getArea() {
		return area;
	}
	public void setArea(RestriccionGeografica area) {
		this.area = area;
	}
	public int getCantidadDeMuestras() {
		return cantidadDeMuestras;
	}
	public void setCantidadDeMuestras(int cantidadDeMuestras) {
		this.cantidadDeMuestras = cantidadDeMuestras;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public int getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}

	public Restriccion getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(Restriccion restriccion) {
		this.restriccion = restriccion;
	}
	
	public boolean esMuestraValida(Muestra muestra) {
	
		return this.getArea().seCumple(muestra.getCoordenada()) && this.getRestriccion().estaHabilitado(muestra.getFecha());
	}
	
	
}