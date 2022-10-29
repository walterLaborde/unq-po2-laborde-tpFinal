package ar.edu.unq.po2.clasesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

	private String nombre;
	private String descripcion;
	private List<Categoria> categoria = new ArrayList<Categoria>();
	private List<Usuario> participantes = new ArrayList<Usuario>();
	private List<Muestra> muestrasRecolectadas = new ArrayList<Muestra>();
	
	
	// getters and setters
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getDescripcion() {
		return descripcion;
	}
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private List<Categoria> getCategoria() {
		return categoria;
	}
	private void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	private List<Usuario> getParticipantes() {
		return participantes;
	}
	private void setParticipantes(List<Usuario> participantes) {
		this.participantes = participantes;
	}
	private List<Muestra> getMuestrasRecolectadas() {
		return muestrasRecolectadas;
	}
	private void setMuestrasRecolectadas(List<Muestra> muestrasRecolectadas) {
		this.muestrasRecolectadas = muestrasRecolectadas;
	}
	
	// constructor
	public Proyecto(String nombre, String descripcion, List<Categoria> categoria) {
		super();
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setCategoria(categoria);
	}
	
	public void agregarParticipante(Usuario participante) {
		this.getParticipantes().add(participante);
	}
	
	public void agregarMuestra(Muestra muestra) {
		this.getMuestrasRecolectadas().add(muestra);
	}
	
}
