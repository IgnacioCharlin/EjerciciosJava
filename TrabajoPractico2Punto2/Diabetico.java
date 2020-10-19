package TrabajoPractico2Punto2;

public class Diabetico extends Pacientes {
	private Integer tipoDeDiabetico;
	public Diabetico(String nombre, Long dni , Integer tipoDeDiabetico) {
		super(nombre, dni);
		this.tipoDeDiabetico=tipoDeDiabetico;
	}
	
	public Integer getTipoDeDiabetico() {
		return tipoDeDiabetico;
	}
	public void setTipoDeDiabetico(Integer tipoDeDiabetico) {
		this.tipoDeDiabetico = tipoDeDiabetico;
	}
	
	
	@Override
	public Boolean consumirPlato(Plato aConsumir) {
		for (int i = 0; i < aConsumir.getIngredientes().size(); i++) {
			if (aConsumir.getIngredientes().get(i).equals("azucar")) {
				return false;
			}
		}
		return true;
	}
	
	public Boolean recibirDosisDeInsulina() {
		if (tipoDeDiabetico == 2) {
			return true;
		}
		return false;
	}
}
