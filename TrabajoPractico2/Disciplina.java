package TrabajoPractico2;

public class Disciplina {
	protected Double distanciaEnKilometros;
	protected Double tiempoEnMinutos;
	protected Double ritmo;
	protected Zona frecuenciaCardiaca;
	
	public Disciplina(Double distanciaEnKilometros, Double tiempoEnMinutos , Zona frecuenciaCardiaca) {
		super();
		this.distanciaEnKilometros = distanciaEnKilometros;
		this.tiempoEnMinutos = tiempoEnMinutos;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}
	public Double getDistancia() {
		return distanciaEnKilometros;
	}
	public void setDistancia(Double distancia) {
		distancia = distancia;
	}
	
	public Zona getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}
	public void setFrecuenciaCardiaca(Zona frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}
	public Double getTiempo() {
		return tiempoEnMinutos;
	}
	public Double getRitmo() {
		ritmo = tiempoEnMinutos / distanciaEnKilometros;
		return ritmo;
	}
	
}
