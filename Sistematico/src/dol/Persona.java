package dol;

public class Persona {
	private String primerNombre;
	private String SegundoNombre;
	private String primerApellido;
	private String SegundoApellido;
	
	public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
		super();
		this.primerNombre = primerNombre;
		SegundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		SegundoApellido = segundoApellido;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return SegundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		SegundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return SegundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}
	
}
