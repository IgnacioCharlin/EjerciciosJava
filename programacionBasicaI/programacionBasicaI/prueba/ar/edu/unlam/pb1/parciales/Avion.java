package ar.edu.unlam.pb1.parciales;

public class Avion {
	private String destino;
	private String origen;
	private int cantidadDePasajeros;
	private Pasajero1 pasajeros[];
	private Pasajero1 ascientos[][];
	private int pasajeroSentados;

	public Avion(String destino, String origen, int cantidadDePasajeros) {
		super();
		this.destino = destino;
		this.origen = origen;
		this.cantidadDePasajeros = cantidadDePasajeros;
		this.pasajeros = new Pasajero1[cantidadDePasajeros];
		this.ascientos = new Pasajero1[10][10];
		pasajeroSentados=0;
		limpiarAscientos();
	}

	public boolean ingresarPasajero(Pasajero1 nuevo) {
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajeros[i] == null) {
				pasajeros[i] = nuevo;
				return true;
			}
		}
		return false;
	}

	public boolean asignarAsciento(int dni, int fila, int columna) {
		if (ascientos[fila][columna] == null) {
			ascientos[fila][columna] = buscarPasajero(dni);
			pasajeroSentados++;
			return true;
		}
		return false;
	}

	public String listarPasajeros() {
		String listado = "";
		Pasajero1 aux = null;
		for (int i = 1; i < pasajeroSentados; i++) {
			for (int j = 0; j < pasajeroSentados - 1 ; j++) {
					if (pasajeros[j].getDni() > pasajeros[j + 1].getDni()) {
						aux = pasajeros[j + 1];
						pasajeros[j + 1] = pasajeros[j];
						pasajeros[j] = aux;
					}
				
			}
		}
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajeros[i] != null) {
				listado += pasajeros[i].getNombre() + " " + pasajeros[i].getApellido() + " " + pasajeros[i].getDni()
						+ "\n";
			}
		}
		return listado;
	}

	public Pasajero1 buscarPasajero(int dni) {
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajeros[i].getDni() == dni) {
				return pasajeros[i];
			}
		}
		return null;
	}
	
	public String mapaDelVuelo() {
		String mapa ="";
		for (int i = 0; i < ascientos.length; i++) {
			for (int j = 0; j < ascientos.length; j++) {
				if (ascientos[i][j]==null) {
					mapa+= " [L] ";
				}else {
					mapa+= " [O] ";
				}
			}
			mapa+= "\n";
		}
		return mapa;
		
	}

	public void limpiarAscientos() {
		for (int i = 0; i < ascientos.length; i++) {
			for (int j = 0; j < ascientos.length; j++) {
				ascientos[i][j] = null;
			}
		}
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}

	public void setCantidadDePasajeros(int cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}

	public Pasajero1[] getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Pasajero1[] pasajeros) {
		this.pasajeros = pasajeros;
	}

}
