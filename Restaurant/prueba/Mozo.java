package ar.edu.unlam.pb1.trabajoPractico11.prueba;

public class Mozo {
	private String nombre;
	private int dni;
	public Mozo(String nombre, int dni) {
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
		return "Mozo [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
}
