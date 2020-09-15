package EjercitacionPrueba;

public class Vuelo {
	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;
	private int cantidadDePasajeros =0;

	public Vuelo(String origen, String destino, int cantidadPasajero) {
		this.origen = origen;
		this.destino = destino;
		pasajeros = new Pasajero[cantidadPasajero];
		asientos = new Pasajero [CANTIDAD_DE_ASIENTOS_POR_FILA][CANTIDAD_DE_FILAS];
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		for (int i = 0; i < pasajeros.length; i++) {
			if(pasajeros[i]== null) {
				pasajeros[i] = pasajero;
				cantidadDePasajeros++;
				return true;
			}
		}
		return false;
	}

	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		if(asientos[fila][columna] != null) {
			return false;
		}else {
			return true;
		}
	}

	public Pasajero buscarPasajero(int dni) {
		Pasajero buscado = null;
		for (int i = 0; i < pasajeros.length; i++) {
			if(pasajeros[i]!=null) {
				if(pasajeros[i].getDni() == dni) {
					buscado = pasajeros[i];
				}
			}
		}
		return buscado;
	}

	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		if(verificarDisponibilidadAsiento(fila, columna) == true) {
			asientos[fila][columna] = pasajero;
			return true;
		}
		return false;
	}

	public void ordenarListaDePasajerosPorDNI() {
		Pasajero auxiliar = null;
		for (int i = 0; i < cantidadDePasajeros; i++) {
			for (int j = 0; j < cantidadDePasajeros; j++) {
				if(pasajeros[j+1]!= null) {
					if(pasajeros[j].getDni() > pasajeros[j+1].getDni()) {
						auxiliar = pasajeros[j+1];
						pasajeros[j+1]= pasajeros[j];
						pasajeros[j]= auxiliar;
					}
				}
			}
		}
	}

	public Pasajero[] getPasajeros() {
		return pasajeros;
	}

	public String toString() {
		String lista ="";
		for (int i = 0; i < CANTIDAD_DE_ASIENTOS_POR_FILA; i++) {
			lista += "\n";
			for (int j = 0; j < CANTIDAD_DE_FILAS; j++) {
				if(asientos[i][j] == null) {
					lista+="[L]";
				}else {
					lista+="[O]";
				}
			}
		}
		return lista;
	}	
}
