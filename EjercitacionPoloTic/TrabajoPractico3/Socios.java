package TrabajoPractico3;

public class Socios {
	int numeroDeSocio;
	int edad;
	int tipoDeDeporte;
	public Socios(int numeroDeSocio, int edad, int tipoDeDeporte) {
		this.numeroDeSocio = numeroDeSocio;
		this.edad = edad;
		this.tipoDeDeporte = tipoDeDeporte;
	}
	public int getNumeroDeSocio() {
		return numeroDeSocio;
	}
	public void setNumeroDeSocio(int numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTipoDeDeporte() {
		return tipoDeDeporte;
	}
	public void setTipoDeDeporte(int tipoDeDeporte) {
		this.tipoDeDeporte = tipoDeDeporte;
	}
	
}
