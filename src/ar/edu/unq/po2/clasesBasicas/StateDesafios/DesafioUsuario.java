package ar.edu.unq.po2.clasesBasicas.StateDesafios; // w borrar para compartir
import ar.edu.unq.po2.clasesBasicas.Desafio;        // w borrar para compartir
import ar.edu.unq.po2.clasesBasicas.Usuario;        // w borrar para compartir

//package ar.edu.unq.po2.TpFinal.StateDesafios;

import java.time.LocalDate;


//import ar.edu.unq.po2.TpFinal.*;

public class DesafioUsuario {

	private Usuario usuario; 
	private Desafio desafio; 
	private EstadoDesafio estado; 
	private Integer valoracion; 
	private LocalDate fechaInicio; 
	
	public DesafioUsuario(Usuario usuario, Desafio desafio) {
		
		this.setUsuario(usuario); 
		this.setDesafio(desafio);
		this.setEstado(new EstadoPendiente());

	}
	
	public int cantidadDeMuestrasValidas() {
		
		return this.getUsuario().getMuestras().stream().filter(muestra -> this.getDesafio().esMuestraValida(muestra)).toList().size(); 
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Desafio getDesafio() {
		return desafio;
	}

	public void setDesafio(Desafio desafio) {
		this.desafio = desafio;
	}

	public EstadoDesafio getEstado() {
		return estado;
	}

	public void setEstado(EstadoDesafio estado) {
		this.estado = estado;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void serAceptado() {
		
		this.getEstado().serAceptado(this); 
		
	}
	
}