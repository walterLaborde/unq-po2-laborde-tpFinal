package ar.edu.unq.po2.clasesBasicas.StateDesafios;

//package ar.edu.unq.po2.TpFinal.StateDesafios;

public class EstadoPendiente extends EstadoDesafio {

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		
		return false;
	}

	@Override
	public float porcentajeDeCompletitud(DesafioUsuario desafio) {
		//lanzar error 
		return 0.00f;
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) {
		
		desafio.setEstado(new EstadoEnCurso());
		
	}

}