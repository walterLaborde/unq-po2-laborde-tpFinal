package ar.edu.unq.po2.clasesBasicas.StrategyRecomendacion; // w
import ar.edu.unq.po2.clasesBasicas.*;                      // w

//package ar.edu.unq.po2.TpFinal.StrategyRecomendacion;
//import ar.edu.unq.po2.TpFinal.*;

import java.util.List;

public class PreferenciaDeJuego extends RecomendadorDesafios {


	@Override
	public List<Desafio> desafiosRecomendados(Usuario usuario) {
		
		List<Desafio> desafiosRecomendados = 
				this.ordenarPorCoincidencia(this.desafiosARecomendar(usuario), usuario).stream().limit(5).toList();
		
		this.agregarDesafiosRecomendados(usuario, desafiosRecomendados);
	
		return desafiosRecomendados;

	}


}