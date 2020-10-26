package ar.edu.unlam.pb1.trabajoPractico11.prueba;

import java.util.Arrays;

public class Pedido {
	private Mozo mozo;
	private Plato platos[];
	private Comensal mesa;
	private int platosPedidos;
	private double precioTotalDelPedido;
	
	public Pedido(Mozo mozo, Comensal mesa) {
		this.mozo = mozo;
		this.mesa=mesa;
		platos = new Plato[10];
		platosPedidos = 0;
		precioTotalDelPedido=0.0;
	}

	public Mozo getMozo() {
		return mozo;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public Plato[] getPlatos() {
		return platos;
	}

	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}

	public Comensal getMesa() {
		return mesa;
	}

	public void setMesa(Comensal mesa) {
		this.mesa = mesa;
	}
	
	public int getPlatosPedidos() {
		return platosPedidos;
	}

	public void agregarPlatoAlPedido(Plato nuevo) {
		for (int i = 0; i < platos.length; i++) {
			if (platos[i]==null) {
				platos[i]=nuevo;
				platosPedidos++;
				precioTotalDelPedido+= nuevo.getPrecio();
				break;
			}
		}
	}
	

	public double getPrecioTotalDelPedido() {
		return precioTotalDelPedido;
	}

	public void setPrecioTotalDelPedido(double precioTotalDelPedido) {
		this.precioTotalDelPedido = precioTotalDelPedido;
	}

	@Override
	public String toString() {
		return "Pedido [mozo=" + mozo + ", platos=" + Arrays.toString(platos) + ", mesa=" + mesa + "]";
	}
	
}
