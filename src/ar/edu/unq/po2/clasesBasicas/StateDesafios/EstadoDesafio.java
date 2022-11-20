package ar.edu.unq.po2.clasesBasicas.StateDesafios;

//package ar.edu.unq.po2.TpFinal.StateDesafios;


public abstract class EstadoDesafio {
	
	public abstract boolean estaCompleto(DesafioUsuario desafio); 
	public abstract float porcentajeDeCompletitud(DesafioUsuario desafio);
	public abstract void serAceptado(DesafioUsuario desafio) throws Exception;


}