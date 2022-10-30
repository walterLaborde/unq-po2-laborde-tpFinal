package ar.edu.unq.po2.clasesBasicas.StateDesafios;

//package ar.edu.unq.po2.TpFinal.StateDesafios;


public class EstadoEnCurso extends EstadoDesafio{

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		
		if (this.porcentajeDeCompletitud(desafio) == 100) {
			desafio.setEstado(new EstadoCompleto());  
		}
		
		return this.porcentajeDeCompletitud(desafio) == 100;
	}

	@Override
	public float porcentajeDeCompletitud(DesafioUsuario desafio) {
		
		return desafio.cantidadDeMuestrasValidas() / desafio.getDesafio().getCantidadDeMuestras();
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) {
		
	}

}
