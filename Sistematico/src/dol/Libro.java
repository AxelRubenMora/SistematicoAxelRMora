package dol;

public class Libro {
	private String titulo;
	private String editorial;
	private String edicion;
	private int anioDePublicacion;
	
	public Libro() {
		super();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public int getAnioDePublicacion() {
		return anioDePublicacion;
	}
	public void setAnioDePublicacion(int anioDePublicacion) {
		this.anioDePublicacion = anioDePublicacion;
	}

}
