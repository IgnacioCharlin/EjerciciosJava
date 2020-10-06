package ar.edu.unlam.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaSupermercado {
	@Test
	public void queSeCreeElCarrito() {
		Carrito dia = new Carrito();
		assertNotNull(dia); 
	}
	@Test
	public void queSeCreeElProducto() {
		Carrito dia = new Carrito();
		Producto leche = new Producto("leche", 50.0);
		assertNotNull(leche); 
	}
	
	@Test
	public void AgregarProductoAlCarrito() {
		Carrito dia = new Carrito();
		Producto leche = new Producto("leche", 50.0);
		
		assertTrue(dia.agregarProducto(leche)); 
	}
	
	@Test
	public void AplicarPromocion() {
		Carrito dia = new Carrito();
		Producto leche1 = new Producto("leche", 50.0);
		Producto leche2 = new Producto("leche", 50.0);
		Producto leche3 = new Producto("leche", 50.0);
		Producto leche4 = new Producto("leche", 50.0);
		
		dia.agregarProducto(leche1); 
		dia.agregarProducto(leche2); 
		dia.agregarProducto(leche3); 
		dia.agregarProducto(leche4);
		
		assertEquals(140.0, dia.promocionProducto());
	}
	
	@Test
	public void noAplicarPromocion() {
		Carrito dia = new Carrito();
		Producto leche1 = new Producto("leche", 50.0);
		Producto fideos1 = new Producto("fideos", 30.0);
		Producto arroz1 = new Producto("arroz", 60.0);
		Producto leche2 = new Producto("leche", 50.0);
		
		dia.agregarProducto(leche1); 
		dia.agregarProducto(leche2); 
		dia.agregarProducto(fideos1);
		dia.agregarProducto(arroz1);
		
		assertEquals(190.0, dia.promocionProducto());
	}
	
}
