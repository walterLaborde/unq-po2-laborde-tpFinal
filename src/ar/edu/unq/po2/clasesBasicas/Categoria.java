package ar.edu.unq.po2.clasesBasicas;

public class Categoria {
	private String nombre;

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria(String nombre) {
		super();
		this.setNombre(nombre);
	}
	
	
}
