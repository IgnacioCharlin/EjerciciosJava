package ejercitacion;



public class Sala {

	private final int CANTIDAD_DE_FILAS;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA;

	private String nombreDeLaSala;
	private Espectador[][] publico;

	public Sala(String nombreDeLaSala, int cantidadDeFilas, int cantidadDeAsientosPorFila) {
		this.nombreDeLaSala = nombreDeLaSala;
		this.CANTIDAD_DE_FILAS = cantidadDeFilas;
		this.CANTIDAD_DE_ASIENTOS_POR_FILA =  cantidadDeAsientosPorFila;
		publico = new Espectador [CANTIDAD_DE_FILAS][CANTIDAD_DE_ASIENTOS_POR_FILA];
		
	}

	public boolean ingresarEspectador(int fila, int asciento, Espectador nuevoEspectador) {
		boolean sePudo = false;
		for (int i = 0; i < publico.length; i++) {
			for (int j = 0; j < publico.length; j++) {
				if(publico[fila][asciento]==null) {
					publico[fila][asciento] = nuevoEspectador;
					sePudo = true;
				}
			}
		}
		return sePudo;
	}
	
	public String toString() {
		String mapa = "";
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			mapa += "\n";
			for (int j = 0; j < CANTIDAD_DE_ASIENTOS_POR_FILA; j++) {
				if(publico[i][j] == null) {
					mapa += "[L]";
				}else {
					mapa += "[O]";
				}
			}
		}
		return mapa;
	}
	
	public void vaciarSala() {
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			for (int j = 0; j < CANTIDAD_DE_ASIENTOS_POR_FILA; j++) {
				publico[i][j]= null;
			}
		}
	}
	
	public int calcularCapacidadDeLaSala() {
		int capacidad = 0;
		capacidad = (CANTIDAD_DE_FILAS*CANTIDAD_DE_ASIENTOS_POR_FILA);
		return capacidad;
	}
}
