package ar.edu.unq.po2.clasesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Muestra> muestrasRecolectadas = new ArrayList<Muestra>();
	private List<Proyecto> proyectosEnParticipacion = new ArrayList<Proyecto>();
	private Perfil perfilDeUsuario;
	
	// getters and setters
	private List<Muestra> getMuestrasRecolectadas() {
		return muestrasRecolectadas;
	}
	private void setMuestrasRecolectadas(List<Muestra> muestrasRecolectadas) {
		this.muestrasRecolectadas = muestrasRecolectadas;
	}
	private List<Proyecto> getProyectosEnParticipacion() {
		return proyectosEnParticipacion;
	}
	private void setProyectosEnParticipacion(List<Proyecto> proyectosEnParticipacion) {
		this.proyectosEnParticipacion = proyectosEnParticipacion;
	}
	private Perfil getPerfilDeUsuario() {
		return perfilDeUsuario;
	}
	private void setPerfilDeUsuario(Perfil perfilDeUsuario) {
		this.perfilDeUsuario = perfilDeUsuario;
	}
	public Usuario(Perfil perfilDeUsuario) {
		super();
		this.setPerfilDeUsuario(perfilDeUsuario);
	}
	
	public void suscribirseA(Proyecto proyecto) {
		proyecto.agregarParticipante(this);
	}
	
	public void agregarMuestra(Muestra muestra, Proyecto proyecto) {
		this.getMuestrasRecolectadas().add(muestra);
		proyecto.agregarMuestra(muestra);
	}
}
