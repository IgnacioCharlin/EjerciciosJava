package ar.edu.unlam.disco;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	public Disco(Double radioInterior , Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}
	
	public Double obtenerPerimetroSuperior() {
		return 2*Math.PI*radioExterior;
	}
	
	public Double obtenerPerimetroInterior() {
		return 2*Math.PI*radioInterior;
	}
	
	public Double superficieDelDisco() {
		return Math.PI*(Math.pow(radioExterior, 2) - Math.pow(radioInterior, 2));
	}
	
	public static void main(String[] args) {
		Disco nuevo = new Disco(10.0, 20.0);
		System.out.println(nuevo.superficieDelDisco());
	}
}
