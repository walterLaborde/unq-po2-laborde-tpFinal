package ar.edu.unq.po2.clasesBasicas;                                       // w
import ar.edu.unq.po2.clasesBasicas.CompositeRestriccion.TipoDeRestriccion; // w

//package ar.edu.unq.po2.TpFinal;
//import ar.edu.unq.po2.TpFinal.CompositeRestriccion.*;

public class Desafio implements ElementoDeLudificacion {
		
	private AreaCircular area; 
	private TipoDeRestriccion restriccion; 
	private int cantidadDeMuestras; 
	private int dificultad; 
	private int recompensa; 
	
	public Desafio(AreaCircular area, TipoDeRestriccion restriccion, int cant, int dif, int recompensa) {
		
		this.setArea(area);
		this.setRestriccion(restriccion);
		this.setCantidadDeMuestras(cant);
		this.setDificultad(dif);
		this.setRecompensa(recompensa);
		
	}
	
	public AreaCircular getArea() {
		return area;
	}
	public void setArea(AreaCircular area) {
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
//	public Integer coincidenciaCon(Usuario usuario) {
//	// esto no deber�a estar aca, pero por ahora sirve. 
//		
//		Integer difDificultad = Math.abs(this.getDificultad() - usuario.getPerfil().getDificultad()); 
//		Integer difMuestras = Math.abs(this.getCantidadDeMuestras() - usuario.getPerfil().getCantMuestrasARecolectar()); 
//		Integer difRecompensa = Math.abs(this.getRecompensa() - usuario.getPerfil().getRecompensasPreferidas()); 
//		
//		return difDificultad + difMuestras + difRecompensa;
//	}
	public TipoDeRestriccion getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(TipoDeRestriccion restriccion) {
		this.restriccion = restriccion;
	}
	
	public boolean esMuestraValida(Muestra muestra) {
	
		return this.getArea().contiene(muestra.getCoordenada()) && this.getRestriccion().estaHabilitado(muestra.getFecha());
	}
	
	
}