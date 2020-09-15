package ar.edu.unlam.cerradura;

public class Cerradura {
	private Integer claveDeApertura;
	private Integer cantidadDeFallorIntegerConsecutivosQueLaBloquean;
	private Boolean estado;
	private Boolean bloqueada;
	private Integer intentos;
	private Integer aperturasExitosas;
	private Integer aperturasFallidas;
	
	public Cerradura(Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallorIntegerConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		estado = false;
		bloqueada = false;
		intentos = 0;
		aperturasExitosas = 0;
		aperturasFallidas =0;
	}
	
	public Boolean abrir(Integer clave) {
		if(claveDeApertura.equals(clave) && bloqueada == false) {
			intentos = 0;
			aperturasExitosas++;
			estado = true;
			return true;
		}else {
			intentos ++;
			aperturasFallidas++;
			if (intentos > cantidadDeFallorIntegerConsecutivosQueLaBloquean) {
				bloqueada = true;
			}
			return false;
		}
	}
	public void cerrar() {
		estado=false;
	}
	public Boolean estaAbierta() {
		if (estado == true && bloqueada ==false) {
			return true;
		}else {
			return false;
		}
	}
	public Boolean estaCerrada() {
		if (estado == true && bloqueada ==false) {
			return true;
		}else {
			return false;
		}
	}
	public Boolean fueBloqueada() {
		if (bloqueada == true) {
			return true;
		}else {
			return false;
		}
	}
	public Integer contarAperturasExitosas() {
		return aperturasExitosas;
	}
	public Integer contarAperturasFallidas() {
		return aperturasFallidas;
	}

}
