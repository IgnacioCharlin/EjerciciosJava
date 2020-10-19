package TrabajoPractico2;

public class Ciclismo extends Disciplina {
	private Integer vueltas;
	private final Integer MINUTO = 60;
	
	public Ciclismo(Double distanciaEnKilometros, Double tiempoEnMinutos, Zona frecuenciaCardiaca , Integer vueltas) {
		super(distanciaEnKilometros, tiempoEnMinutos, frecuenciaCardiaca);
		this.vueltas = vueltas;
	}

	public Double Cadencia() {
		return (double) (vueltas/MINUTO);
		
	}
	
	public Double velocidad() {
		Double tiempoEnHoras = tiempoEnMinutos / 60.0;
		return distanciaEnKilometros / tiempoEnHoras;
	}
	
	
}
