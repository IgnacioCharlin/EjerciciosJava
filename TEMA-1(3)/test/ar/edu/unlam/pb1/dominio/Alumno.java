package ar.edu.unlam.pb1.dominio;

public class Alumno {
	private Integer dni;
	private String nombre;
	private Double notaDelExamen[];
	private Integer cantidadDeExamenesRendidos;
	public Alumno(Integer dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		notaDelExamen = new Double[2];
		cantidadDeExamenesRendidos =0;
	}
	
	public Boolean inscribirAlExamen(String parcial){
		 if (parcial.equals("Primer parcial")) {
			notaDelExamen[0] = 0.0; 
			return true;
		 }else if (parcial.equals("Segundo parcial")) {
			notaDelExamen[1]=0.0;
			return true;
		}else {
			return false;
		}
	}
	public Boolean rendir(String parcial , Double nota){
		 if (parcial.equals("Primer parcial")) {
				notaDelExamen[0] = nota;
				cantidadDeExamenesRendidos++;
				return true;
			 }else if (parcial.equals("Segundo parcial")) {
				notaDelExamen[1] = nota;
				cantidadDeExamenesRendidos++;
				return true;
			}else {
				return false;
			}
	}
	
	public Boolean aprobo() {
		Double acumuladordenotas=0.0;
		for (int i = 0; i < notaDelExamen.length; i++) {
			if (notaDelExamen[i]!=null) {
				acumuladordenotas += notaDelExamen[i];
			}
		}
		if ((acumuladordenotas/cantidadDeExamenesRendidos)>=7) {
			return true;
		}else {
			return false;
		}
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getExamenesRendido() {
		return cantidadDeExamenesRendidos;
	}

	public void setCantidadDeExamenesInsciptos(Integer cantidadDeExamenesInsciptos) {
		this.cantidadDeExamenesRendidos = cantidadDeExamenesInsciptos;
	}

	public Double[] getNotaDelExamen() {
		return notaDelExamen;
	}

	public void setNotaDelExamen(Double[] notaDelExamen) {
		this.notaDelExamen = notaDelExamen;
	}
	
	
	
}
