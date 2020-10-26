package ar.edu.unlam.pb1.trabajoPractico11.prueba;

public class Plato {
	private double precio;
	private String descipcionDelPlato;
	public Plato(double precio, String descipcionDelPlato) {
		super();
		this.precio = precio;
		this.descipcionDelPlato = descipcionDelPlato;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescipcionDelPlato() {
		return descipcionDelPlato;
	}
	public void setDescipcionDelPlato(String descipcionDelPlato) {
		this.descipcionDelPlato = descipcionDelPlato;
	}
	@Override
	public String toString() {
		return "Plato [precio=" + precio + ", descipcionDelPlato=" + descipcionDelPlato + "]";
	}
	
	
}
