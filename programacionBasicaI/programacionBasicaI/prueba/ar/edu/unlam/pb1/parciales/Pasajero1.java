package ar.edu.unlam.pb1.parciales;

public class Pasajero1 {
	private String nombre;
	private String apellido;
	private int dni;
	
	public Pasajero1(String nombre,String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido= apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
