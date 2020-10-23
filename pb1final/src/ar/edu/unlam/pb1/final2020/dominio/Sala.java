package ar.edu.unlam.pb1.final2020.dominio;

public class Sala {

	private final int CANTIDAD_DE_FILAS;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA;

	private String nombreDeLaSala;
	private Espectador[][] publico;

	public Sala(String nombreDeLaSala, int cantidadDeFilas, int cantidadDeAsientosPorFila) {
		
		this.nombreDeLaSala = nombreDeLaSala;
		CANTIDAD_DE_FILAS = cantidadDeFilas;
		CANTIDAD_DE_ASIENTOS_POR_FILA=cantidadDeAsientosPorFila;
		publico = new Espectador [CANTIDAD_DE_FILAS][CANTIDAD_DE_ASIENTOS_POR_FILA];
	}

	public boolean ingresarEspectador(int fila, int asiento, Espectador nuevoEspectador) {
		/*
		 * Realiza el ingreso de un espectador a la sala. Retorna true en caso de poder hacer la asignación o false en caso contrario (Sólo se puede ingresar un espectador que tenga una reserva previa).
		 */
	}
	
	public String toString() {
		/*
		 * Devuelve un mapa de la sala del cine, de manera que se pueda seleccionar la ubicación deseada ante un nuevo ingreso. Por cada asiento debe indicar "L" (si se encuentra libre) y "O" (si se encuentra ocupado)
		 */
	}
	
	public void vaciarSala() {
		/*
		 * Al finalizar una función se invoca este método para liberar cada asiento de la sala
		 */
	}
	
	public int calcularCapacidadDeLaSala() {
		/*
		 * Devuelve la cantidad de asientos que tiene la sala
		 */
	}
}
