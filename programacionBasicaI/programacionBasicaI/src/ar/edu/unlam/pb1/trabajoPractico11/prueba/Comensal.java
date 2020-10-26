package ar.edu.unlam.pb1.trabajoPractico11.prueba;

public class Comensal {
	private String nombre;
	private int dni;
	
	
	public Comensal(String nombre, int dni) {
		super();
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Comensal [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
}
