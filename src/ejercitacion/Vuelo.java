package ejercitacion;

public class Vuelo {
	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;
	private int cantidadActualDePasajeros = 0 ;

	public Vuelo(String origen, String destino, int cantidadPasajero) {
		this.origen = origen;
		this.destino = destino;
		pasajeros = new Pasajero[cantidadPasajero];
		asientos = new Pasajero[CANTIDAD_DE_FILAS][CANTIDAD_DE_ASIENTOS_POR_FILA];
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajeros[i] == null) {
				pasajeros[i] = pasajero;
				cantidadActualDePasajeros++;
				return true;
			}
		}
		return false;
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del vuelo. Devuelve true
		 * si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
	}

	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		if (asientos[fila][columna] == null) {
			return true;
		}
		return false;
		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
	}

	public Pasajero buscarPasajero(int dni) {
		Pasajero pasajeroBuscado = null;
		for (int i = 0; i < pasajeros.length; i++) {
			if(pasajeros[i]!= null) {
				if (pasajeros[i].getDni() == dni) {
					pasajeroBuscado = pasajeros[i];
				}
			}	
		}
		return pasajeroBuscado;
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo
		 * encuentra devuelve null.
		 */
	}

	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		if (asientos[fila][columna] == null) {
			asientos[fila][columna] = pasajero;
			return true;
		}
		return false;
		/*
		 * Asigna el asiento al pasajero recibido por parámetro. Devuelve true si lo
		 * pudo asignar o false en caso que el asiento no se encuentre disponible.
		 */
	}

	public void ordenarListaDePasajerosPorDNI() {
		Pasajero menor = null;
		for (int i = 0; i < cantidadActualDePasajeros; i++) {
			for (int j = 0; j < cantidadActualDePasajeros; j++) {
				if(pasajeros[j+1]!=null) {
					if (pasajeros[j].getDni() < pasajeros[j+1].getDni()) {    
						menor = pasajeros[j];
						pasajeros[j]= pasajeros[j+1];
						pasajeros[j+1]=menor;
					}
				}	
			}
		}
		/*
		 * Ordena la lista de pasajeros por DNI.
		 */
	}

	public Pasajero[] getPasajeros() {
		return pasajeros;
		/*
		 * Devuelve la lista de pasajeros
		 */
	}

	public String toString() {
		String mapa = "";
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			mapa += "\n";
			for (int j = 0; j < CANTIDAD_DE_ASIENTOS_POR_FILA; j++) {
				if(asientos[i][j] == null) {
					mapa += "[L]";
				}else {
					mapa += "[O]";
				}
			}
		}
		return mapa;
		/*
		 * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se
		 * encuentra libre "L" u ocupado "O".
		 */
	}
}
