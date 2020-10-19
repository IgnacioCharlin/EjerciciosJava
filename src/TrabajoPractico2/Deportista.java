package TrabajoPractico2;

public class Deportista {
	private String nombre;
	private Integer edadActual;
	private Double pesoActual;
	private Double alturaActual;
	private Integer pasosDiarios;
	private Disciplina disciplina;
	
	public Deportista(String nombre, Integer edadActual, Double pesoActual, Double alturaActual, Integer pasosDiarios , Disciplina disciplina) {
		super();
		this.nombre = nombre;
		this.edadActual = edadActual;
		this.pesoActual = pesoActual;
		this.alturaActual = alturaActual;
		this.pasosDiarios = pasosDiarios;
		this.disciplina = disciplina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(Integer edadActual) {
		this.edadActual = edadActual;
	}

	public Double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public Double getAlturaActual() {
		return alturaActual;
	}

	public void setAlturaActual(Double alturaActual) {
		this.alturaActual = alturaActual;
	}

	public Integer getPasosDiarios() {
		return pasosDiarios;
	}

	public void setPasosDiarios(Integer pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}
	
	
	

}
