package ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio;

public class Operario {
	private int legajo;
	private String nombre;
	private String apellido;
	private final int CANTIDAD_DIAS_LABORABLES;
	private String fechaIngreso;
	
	public Operario(int legajo, String nombre, String apellido, int cANTIDAD_DIAS_LABORABLES) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		CANTIDAD_DIAS_LABORABLES = cANTIDAD_DIAS_LABORABLES;
	}

	public Operario(int legajo, String nombre, String apellido, int cANTIDAD_DIAS_LABORABLES, String fechaIngreso) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		CANTIDAD_DIAS_LABORABLES = cANTIDAD_DIAS_LABORABLES;
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
