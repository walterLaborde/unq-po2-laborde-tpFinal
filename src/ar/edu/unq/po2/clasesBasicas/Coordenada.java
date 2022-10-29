package ar.edu.unq.po2.clasesBasicas;

public class Coordenada {
	private double latitud;
	private double longitud;
	private double getLatitud() {
		return latitud;
	}
	
	// getters and setters
	private void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	private double getLongitud() {
		return longitud;
	}
	private void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	//constructor
	public Coordenada(double latitud, double longitud) {
		super();
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}
	
}
