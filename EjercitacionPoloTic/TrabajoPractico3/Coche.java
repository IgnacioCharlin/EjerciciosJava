package TrabajoPractico3;

public class Coche {
	int numeroDeCoche;
	double tiempo;
	public Coche(int numeroDeCoche , double tiempo) {
		this.numeroDeCoche= numeroDeCoche;
		this.tiempo= tiempo;
	}
	public int getNumeroDeCoche() {
		return numeroDeCoche;
	}
	public void setNumeroDeCoche(int numeroDeCoche) {
		this.numeroDeCoche = numeroDeCoche;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
}
