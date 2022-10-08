package dol;

import java.util.List;

public class Autor {
	private List<Libro>Libros;
	private String pseudonimo;
	private String nombre;
	private String nacionalidad;
	
	public Autor() {
		super();
	}
	
	public Autor(String pseudonimo, String nombre) {
		super();
		this.pseudonimo = pseudonimo;
		this.nombre = nombre;
	}
	public Autor(List<Libro> libros) {
		super();
		Libros = libros;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<Libro> getLibros() {
		return Libros;
	}
	public void setLibros(List<Libro> libros) {
		Libros = libros;
	}
	public String getPseudonimo() {
		return pseudonimo;
	}
	public void setPseudonimo(String pseudonimo) {
		this.pseudonimo = pseudonimo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
