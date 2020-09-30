package ar.edu.unlam.montacargas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMontacarga {

	@Test
	public void quePuedaCargar() {
		Carga escombro = new Carga(15.0);
		Montacarga cat = new Montacarga(100.0);
		assertTrue(cat.cargar(escombro));
	}

	@Test
	public void queNoCargeMasDelPesoMaximo() {
		Carga escombro = new Carga(15.0);
		Carga ladrillo = new Carga(20.0);
		Carga maderas = new Carga(10.0);
		Montacarga cat = new Montacarga(40.0);

		cat.cargar(escombro);
		cat.cargar(ladrillo);
		cat.cargar(maderas);
		
		assertEquals(35.0, cat.obtenerCarga());
	}

	@Test
	public void obtenerPesoDeLaCarga() {
		Carga escombro = new Carga(15.0);
		Carga ladrillo = new Carga(20.0);
		Carga maderas = new Carga(10.0);
		Montacarga cat = new Montacarga(100.0);

		cat.cargar(escombro);
		cat.cargar(ladrillo);
		cat.cargar(maderas);

		assertEquals(45.0, cat.obtenerCarga());
	}

	@Test
	public void saberSiSeDescargo() {
		Carga escombro = new Carga(15.0);
		Carga ladrillo = new Carga(20.0);
		Carga maderas = new Carga(10.0);
		Montacarga cat = new Montacarga(100.0);

		cat.cargar(escombro);
		cat.cargar(ladrillo);
		cat.cargar(maderas);

		assertTrue(cat.descargar());

	}
	
	@Test
	public void queNoDescargeSiEstaVacio() {
		Carga escombro = new Carga(15.0);
		Carga ladrillo = new Carga(20.0);
		Carga maderas = new Carga(10.0);
		Montacarga cat = new Montacarga(100.0);
		assertFalse(cat.descargar());

	}

	@Test
	public void promedioDePesoDeLaDescarga() {
		Carga escombro = new Carga(15.0);
		Carga ladrillo = new Carga(20.0);
		Carga maderas = new Carga(10.0);
		Montacarga cat = new Montacarga(100.0);

		cat.cargar(escombro);
		cat.cargar(ladrillo);
		cat.cargar(maderas);

		cat.descargar();
		Carga escombro2 = new Carga(15.0);
		Carga ladrillo2 = new Carga(20.0);
		Carga maderas2 = new Carga(10.0);
		cat.cargar(escombro2);
		cat.cargar(ladrillo2);
		cat.cargar(maderas2);
		cat.descargar();
		assertEquals(45.0, cat.obtenerCargaPromedio());

	}
}
