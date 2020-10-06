package ar.edu.unlam.tp1;

import java.util.ArrayList;

public class Carrito {
	private ArrayList<Producto> changito;

	public Carrito() {
		changito = new ArrayList<>();
	}

	public Boolean agregarProducto(Producto nuevo) {
		return changito.add(nuevo);
	}

	public Double promocionProducto() {
		Double contador = 0.0;
		Double precio = 0.0;
		Double precioPromo = 0.0;
		String nombreDelProducto = changito.get(0).getProducto();
		for (int i = 0; i < changito.size(); i++) {
			if (nombreDelProducto.equals(changito.get(i).getProducto())) {
				contador++;
				precio += changito.get(i).getPrecio();
				precioPromo += changito.get(i).getPrecio();
				if (contador > 3) {
					precioPromo = (precioPromo * 0.3);
					precio -= precioPromo;
				}
			}else {
				precio += changito.get(i).getPrecio();
			}
		}
		return precio;
	}

	public ArrayList<Producto> getChangito() {
		return changito;
	}

	public void setChangito(ArrayList<Producto> changito) {
		this.changito = changito;
	}

	@Override
	public String toString() {
		return "Carrito [changito=" + changito + "]";
	}

}
