package TrabajoPractico2;

public class Natacion extends Disciplina {

	public Natacion(Double distanciaEnKilometros, Double tiempoEnMinutos, Zona frecuenciaCardiaca) {
		super(distanciaEnKilometros, tiempoEnMinutos, frecuenciaCardiaca);
		// TODO Auto-generated constructor stub
	}
	
	public Double distanciaEnMetros() {
		return distanciaEnKilometros*1000;
	}
	
	public Double tiempoEnSegundo() {
		return tiempoEnMinutos * 60.0;
	}
	
	@Override
	
	public Double getRitmo() {
		return tiempoEnMinutos / 100.0;
	}
	
	public Double getRitmoEnSegundos() {
		return tiempoEnSegundo() / 100.0;
	}
}
