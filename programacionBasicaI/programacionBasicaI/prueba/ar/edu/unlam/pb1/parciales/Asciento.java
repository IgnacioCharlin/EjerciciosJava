package ar.edu.unlam.pb1.parciales;

public class Asciento {
	private String disponibilidad;
	private int numeroDeAsciento;
	private Pasajero1 pasajeroAsignado;
	public Asciento(String disponibilidad, int numeroDeAsciento, Pasajero1 pasajeroAsignado) {
		super();
		this.disponibilidad = disponibilidad;
		this.numeroDeAsciento = numeroDeAsciento;
		this.pasajeroAsignado = pasajeroAsignado;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public int getNumeroDeAsciento() {
		return numeroDeAsciento;
	}
	public void setNumeroDeAsciento(int numeroDeAsciento) {
		this.numeroDeAsciento = numeroDeAsciento;
	}
	public Pasajero1 getPasajeroAsignado() {
		return pasajeroAsignado;
	}
	public void setPasajeroAsignado(Pasajero1 pasajeroAsignado) {
		this.pasajeroAsignado = pasajeroAsignado;
	}
	
	
}
