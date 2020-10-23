package ar.edu.unlam.pb1.final2020.dominio;

public class Espectador {
	
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Espectador(int dni, String nombre, String apellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		String lista="";
		lista += getNombre() + getApellido() + getEdad() + getDni();
		return lista;
	}
	
	public int getEdad() {
		return edad;
	}
}
