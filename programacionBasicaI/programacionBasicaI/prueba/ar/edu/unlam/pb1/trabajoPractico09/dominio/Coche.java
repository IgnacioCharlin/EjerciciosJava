package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Coche {
	private String marca;
	private String modelo;
	private double kilometros;
	
	public Coche(String marca, String modelo, double kilometros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", kilometros=" + kilometros + "]";
	}

}
