package TrabajoPractico2Punto2;

import java.util.ArrayList;

public class Plato {
	private ArrayList<String> ingredientes;
	private String coccion;

	public Plato(String coccion) {
		super();
		ingredientes = new ArrayList();
		this.coccion = coccion;
	}

	public Boolean agregarIngrediente(String ingrediente) {
		return ingredientes.add(ingrediente);
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public String getCoccion() {
		return coccion;
	}

	public void setCoccion(String coccion) {
		this.coccion = coccion;
	}
	
	
}
