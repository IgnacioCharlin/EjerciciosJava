package ejercitacionDePractica;
import java.util.Scanner;
public class Avion {
	Scanner teclado = new Scanner (System.in);
	private final int CANTIDAD_DE_FILAS = 6;
	private final int CANTIDAD_DE_COLUMNAS = 32;
	private Pasajero pasajerosDelAvion [];
	private Pasajero asientosDelAvion[][];
	private String origen,destino;
	private int capacidad;
	private int cantidadDePasajeros;
	public Avion(String origen , String destino , int capacidad){
		this.origen = origen;
		this.destino = destino;
		this.capacidad = capacidad;
		pasajerosDelAvion = new Pasajero[(CANTIDAD_DE_FILAS*CANTIDAD_DE_COLUMNAS)];
		asientosDelAvion = new Pasajero[CANTIDAD_DE_COLUMNAS][CANTIDAD_DE_FILAS];
		limpiarMatriz();
		limpiarVector();
	}
	
	public boolean agregarPasajero (Pasajero nuevo) {
		for (int i = 0; i < pasajerosDelAvion.length && cantidadDePasajeros <= capacidad; i++) {
			if(pasajerosDelAvion[i]==null) {
				pasajerosDelAvion[i]= nuevo;
				cantidadDePasajeros++;
				return true;
			}
		}
			
		return false;
	}
	
	public boolean asignarAsciento (Pasajero nuevo , int fila , int columna) {
		for (int i = 0; i < asientosDelAvion.length; i++) {
			for (int j = 0; j < asientosDelAvion.length; j++) {
				if(fila >= 0 && fila <= CANTIDAD_DE_FILAS && columna >= 0 && columna <= CANTIDAD_DE_COLUMNAS ) {
					if(nuevo != null) {
						if(asientosDelAvion[fila][columna]==null) {
							asientosDelAvion[fila][columna]=nuevo;
							return true;
						}
					}
				}	
			}
		}
		return false;
	}
	
	public String verPasajero(int numeroDelPasajero) {
		String listadoPasajero = pasajerosDelAvion[numeroDelPasajero].getApellido()+" "+ pasajerosDelAvion[numeroDelPasajero].getNombre()+" "+ pasajerosDelAvion[numeroDelPasajero].getDni();
		return listadoPasajero;
	}
	
	public Pasajero buscarPasajero (long dni) {
		for (int i = 0; i < pasajerosDelAvion.length; i++) {
			if(pasajerosDelAvion[i]!=null) {
				if(pasajerosDelAvion[i].getDni() == dni) {
				
					return pasajerosDelAvion[i];
				}	
			}
		}
		return null;
	}
	
	public String toString() {
		String disponiblidad ="Con origen " + origen + " y su destino " + destino + "\n";
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 6; j++) {
				if(asientosDelAvion[i][j] == null) {
					disponiblidad += "[L]";
				}
				else{
					disponiblidad += "[O]";
				}
				if(j==2) {
					disponiblidad += " | ";
				}
			}
			disponiblidad += "\n";
		}
		return disponiblidad;
	}
	
	public Pasajero[][] getAsientosDelAvion() {
		return asientosDelAvion;
	}

	public Pasajero[] getPasajerosDelAvion() {
		return pasajerosDelAvion;
	}

	public void limpiarVector() {
		for (int i = 0; i < pasajerosDelAvion.length; i++) {
			pasajerosDelAvion[i]=null;
		}
	}
	public void limpiarMatriz() {
		for (int i = 0; i < asientosDelAvion.length; i++) {
			for (int j = 0; j < asientosDelAvion[i].length; j++) {
				asientosDelAvion[i][j]=null;
			}
		}
	}
}
