package TrabajoPractico2Punto2;

public class Pacientes {
	protected String nombre;
	protected Long dni;
	
	public Pacientes(String nombre, Long dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Boolean consumirPlato(Plato aConsumir) {
		if (aConsumir != null) {
			return true;
		}
		return false;
	}
	
}
