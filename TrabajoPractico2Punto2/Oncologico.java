package TrabajoPractico2Punto2;

public class Oncologico extends Pacientes {

	public Oncologico(String nombre, Long dni) {
		super(nombre, dni);
	}
	
	@Override
	public Boolean consumirPlato(Plato aConsumir) {
		if (aConsumir.getCoccion().equals("sin coccion")) {
			return false;
		}
		return true;
	}
}
