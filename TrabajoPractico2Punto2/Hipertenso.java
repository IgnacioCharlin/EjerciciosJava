package TrabajoPractico2Punto2;

public class Hipertenso extends Pacientes {

	public Hipertenso(String nombre, Long dni) {
		super(nombre, dni);
	}
	
	@Override
	public Boolean consumirPlato(Plato aConsumir) {
		for (int i = 0; i < aConsumir.getIngredientes().size(); i++) {
			if (aConsumir.getIngredientes().get(i).equals("sal")) {
				return false;
			}
		}
		return true;
	}
}
