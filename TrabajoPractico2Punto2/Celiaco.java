package TrabajoPractico2Punto2;

public class Celiaco extends Pacientes {

	public Celiaco(String nombre, Long dni) {
		super(nombre, dni);
	}

	@Override
	public Boolean consumirPlato(Plato aConsumir) {
		for (int i = 0; i < aConsumir.getIngredientes().size(); i++) {
			if (aConsumir.getIngredientes().get(i).equals("trigo") || aConsumir.getIngredientes().get(i).equals("avena") || aConsumir.getIngredientes().get(i).equals("cebada")|| aConsumir.getIngredientes().get(i).equals("centeno") ) {
				return false;
			}
		}
		return true;
	}
	
}
