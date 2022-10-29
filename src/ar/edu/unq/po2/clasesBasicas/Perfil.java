package ar.edu.unq.po2.clasesBasicas;

public class Perfil {
	private int cantidadDeMuestrasARecolectar;
	private int dificultad;
	private int recompensa;
	
	//getters and setters
	private int getCantidadDeMuestrasARecolectar() {
		return cantidadDeMuestrasARecolectar;
	}
	private void setCantidadDeMuestrasARecolectar(int cantidadDeMuestrasARecolectar) {
		this.cantidadDeMuestrasARecolectar = cantidadDeMuestrasARecolectar;
	}
	private int getDificultad() {
		return dificultad;
	}
	private void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	private int getRecompensa() {
		return recompensa;
	}
	private void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}
	
	
	public Perfil(int cantidadDeMuestrasARecolectar, int dificultad, int recompensa) {
		super();
		this.setCantidadDeMuestrasARecolectar(cantidadDeMuestrasARecolectar);
		this.setDificultad(dificultad);
		this.setRecompensa(recompensa);
	}
	
	
}
