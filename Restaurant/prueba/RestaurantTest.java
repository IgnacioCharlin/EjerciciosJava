package ar.edu.unlam.pb1.trabajoPractico11.prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestaurantTest {

	@Test
	public void AltaDeMozo() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Mozo jose = new Mozo("jose", 123);
		assertTrue(kansas.agregarMozo(jose));  
	}

	@Test
	public void mesasDisponibles() {
		Restaurant kansas = new Restaurant("kansas", 100);
		int mesas = kansas.getMesas().length;
		mesas*= kansas.getMesas()[0].length;
		assertEquals(mesas, kansas.mesasDisponibles());
	}
	
	@Test
	public void ingresarComensalALaMesa() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Comensal juan = new Comensal("juan", 123);
		kansas.agregarComensal(juan, 1, 1);
		assertNotNull(kansas.getMesas()[1][1]);
	}
	
	@Test 
	public void agregarPedidoAUnaMesa() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Mozo jose = new Mozo("jose", 123);
		Comensal juan = new Comensal("juan", 123);
		Plato plato1 = new Plato(10.0, "milanesa");
		Plato plato2 = new Plato(15.0, "fideos");
		kansas.agregarPlatos(plato1);
		kansas.agregarPlatos(plato2);
		kansas.agregarMozo(jose);
		kansas.agregarComensal(juan, 1, 1);
		Comensal mesa = kansas.buscarMesa(123);
		Pedido nuevo = new Pedido(jose, mesa);
		assertNotNull(nuevo);
	}
	@Test 
	public void agregarPlatoAlPedido() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Mozo jose = new Mozo("jose", 123);
		Comensal juan = new Comensal("juan", 123);
		Plato plato1 = new Plato(10.0, "milanesa");
		Plato plato2 = new Plato(15.0, "fideos");
		kansas.agregarPlatos(plato1);
		kansas.agregarPlatos(plato2);
		kansas.agregarMozo(jose);
		kansas.agregarComensal(juan, 1, 1);
		Comensal mesa = kansas.buscarMesa(123);
		Pedido nuevo = new Pedido(jose, mesa);
		nuevo.agregarPlatoAlPedido(plato1);
		assertEquals(1, nuevo.getPlatosPedidos());
		assertEquals(10.0,nuevo.getPrecioTotalDelPedido());
	}
	
	@Test
	public void cerrarMesa() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Mozo jose = new Mozo("jose", 123);
		Comensal juan = new Comensal("juan", 123);
		Plato plato1 = new Plato(10.0, "milanesa");
		Plato plato2 = new Plato(15.0, "fideos");
		kansas.agregarPlatos(plato1);
		kansas.agregarPlatos(plato2);
		kansas.agregarMozo(jose);
		kansas.agregarComensal(juan, 1, 1);
		Comensal mesa = kansas.buscarMesa(123);
		Pedido nuevo = new Pedido(jose, mesa);
		nuevo.agregarPlatoAlPedido(plato1);
		assertEquals(10.0, kansas.cerrarMesa(1, 1, nuevo));
		
	}
	@Test
	public void cerrarCaja() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Mozo jose = new Mozo("jose", 123);
		Comensal juan = new Comensal("juan", 123);
		Comensal pedro = new Comensal("pedro", 321);
		Plato plato1 = new Plato(10.0, "milanesa");
		Plato plato2 = new Plato(15.0, "fideos");
		kansas.agregarPlatos(plato1);
		kansas.agregarPlatos(plato2);
		kansas.agregarMozo(jose);
		kansas.agregarComensal(juan, 1, 1);
		kansas.agregarComensal(pedro, 2, 2);
		Comensal mesa = kansas.buscarMesa(123);
		Comensal mesa1 = kansas.buscarMesa(321);
		Pedido pedido1 = new Pedido(jose, mesa);
		Pedido pedido2 = new Pedido(jose, mesa1);
		pedido1.agregarPlatoAlPedido(plato1);
		pedido2.agregarPlatoAlPedido(plato2);
		pedido2.agregarPlatoAlPedido(plato1);
		kansas.cerrarMesa(1, 1, pedido1);
		kansas.cerrarMesa(1, 1, pedido2);
		assertEquals(35.0, kansas.cerrarCaja());
		
	}
	
	@Test
	public void listadoDePlatos() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Plato plato1 = new Plato(10.0, "milanesa");
		Plato plato2 = new Plato(15.0, "fideos");
		kansas.agregarPlatos(plato1);
		kansas.agregarPlatos(plato2);
		System.out.println(kansas.listadoDePlatos());
	}
	
	@Test
	public void listadoDeMozos() {
		Restaurant kansas = new Restaurant("kansas", 100);
		Mozo jose = new Mozo("jose", 879);
		Mozo pedro = new Mozo("pedro", 123);
		Mozo juan = new Mozo("juan", 456);
		kansas.agregarMozo(jose);
		kansas.agregarMozo(pedro);
		kansas.agregarMozo(juan);
		kansas.ordenarMozosPorDni();
		System.out.println(kansas.listadoDeMozos());
	}
}
