package TrabajoPractico2;

public class Zona {
	protected Double frecuenciaCardiacaMinina;
	protected Double frecuenciaCardiacaMaxima;
	public Zona(Double frecuenciaCardiacaMinina, Double frecuenciaCardiacaMaxima) {
		super();
		this.frecuenciaCardiacaMinina = frecuenciaCardiacaMinina;
		this.frecuenciaCardiacaMaxima = frecuenciaCardiacaMaxima;
	}
	public Double getFrecuenciaCardiacaMinina() {
		return frecuenciaCardiacaMinina;
	}
	public void setFrecuenciaCardiacaMinina(Double frecuenciaCardiacaMinina) {
		this.frecuenciaCardiacaMinina = frecuenciaCardiacaMinina;
	}
	public Double getFrecuenciaCardiacaMaxima() {
		return frecuenciaCardiacaMaxima;
	}
	public void setFrecuenciaCardiacaMaxima(Double frecuenciaCardiacaMaxima) {
		this.frecuenciaCardiacaMaxima = frecuenciaCardiacaMaxima;
	}
	
	
}
