package ar.edu.unq.po2.clasesBasicas;

import java.time.LocalDateTime;

public class Muestra {
	private Coordenada coordenadasGeograficas;
	private Usuario usuarioQueTomoMuestra;
	private LocalDateTime fechaYHora;
	
	// getters and setters
	private Coordenada getCoordenadasGeograficas() {
		return coordenadasGeograficas;
	}
	private void setCoordenadasGeograficas(Coordenada coordenadasGeograficas) {
		this.coordenadasGeograficas = coordenadasGeograficas;
	}
	private Usuario getUsuarioQueTomoMuestra() {
		return usuarioQueTomoMuestra;
	}
	private void setUsuarioQueTomoMuestra(Usuario usuarioQueTomoMuestra) {
		this.usuarioQueTomoMuestra = usuarioQueTomoMuestra;
	}
	private LocalDateTime getFechaYHora() {
		return fechaYHora;
	}
	private void setFechaYHora(LocalDateTime fechaYHora) {
		this.fechaYHora = fechaYHora;
	}
	
	public Muestra(Coordenada coordenadasGeograficas, Usuario usuarioQueLaTomo, LocalDateTime fechaYHora) {
		super();
		this.setCoordenadasGeograficas(coordenadasGeograficas);
		this.setUsuarioQueTomoMuestra(usuarioQueLaTomo);
		this.setFechaYHora(fechaYHora);
	}
}
