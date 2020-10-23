package hola;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestEmpresa {

	@Test
	public void test() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		Empresa aerolineas = new Empresa("Aerolineas");
		assertTrue(aerolineas.registrarAvion(aa123)); 
	}

	@Test
	public void registrarVuelo() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		Vuelo bsas = new Vuelo(123, "formosa", "Buenos aires", aa123);
		Empresa aerolineas = new Empresa("Aerolineas");
		assertTrue(aerolineas.regitrarVuelo(bsas)); 
	}
	
	@Test
	public void RegistrarPasajero() {
		Pasajero nacho = new Pasajero(123, "charlin");
		Empresa aerolineas = new Empresa("Aerolineas");
		assertTrue(aerolineas.RegistarPasajero(nacho));
	}
	
	@Test
	public void asignarPasajeroAUnVuelo() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		Vuelo bsas = new Vuelo(123, "formosa", "Buenos aires", aa123);
		Pasajero nacho = new Pasajero(456, "charlin");
		Empresa aerolineas = new Empresa("Aerolineas");
		aerolineas.RegistarPasajero(nacho);
		aerolineas.regitrarVuelo(bsas);
		assertTrue(aerolineas.asignarPasajeroAUnVuelo(123, 456));
	}
	
	
	@Test
	public void verificarSiExisteUnAsientoEnUnAvion() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		aa123.crearAscientos();
		assertNotNull(ascientos);
	}

	@Test
	public void verificarAsientoDiponibleParaUnVuelo() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		aa123.crearAscientos();
		Vuelo bsas = new Vuelo(456, "formosa", "Buenos aires", aa123);
		Empresa aerolineas = new Empresa("Aerolineas");
		aerolineas.regitrarVuelo(bsas);
		aerolineas.registrarAvion(aa123);
		assertTrue(aerolineas.verificarAsientoDiponibleParaUnVuelo(456, "5"));
	}
	
	@Test
	public void asignarAsientoPasajeroParaUnVuelo() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		aa123.crearAscientos();
		Vuelo bsas = new Vuelo(456, "formosa", "Buenos aires", aa123);
		Empresa aerolineas = new Empresa("Aerolineas");
		Pasajero nacho = new Pasajero(456, "charlin");
		aerolineas.regitrarVuelo(bsas);
		aerolineas.registrarAvion(aa123);
		aerolineas.RegistarPasajero(nacho);
		assertTrue(aerolineas.asignarAsientoPasajeroParaUnVuelo(456, 456, "3"));
	}
	
	@Test
	public void obtenerListaDeAsientoDeUnAvion() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		aa123.crearAscientos();
		Empresa aerolineas = new Empresa("Aerolineas");
		aerolineas.registrarAvion(aa123);
		Integer id = 123;
		assertNotNull(aerolineas.obtenerListaDeascientoDeUnAvion(id));
	}
	@Test
	public void obtenerListaDeAsientoOcupadosYVaciosDeUnVuelo() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		aa123.crearAscientos();
		Empresa aerolineas = new Empresa("Aerolineas");
		Vuelo bsas = new Vuelo(123, "formosa", "Buenos aires", aa123);
		Pasajero nacho = new Pasajero(456, "charlin");
		Pasajero juan = new Pasajero(789, "perez");
		aerolineas.registrarAvion(aa123);
		aerolineas.regitrarVuelo(bsas);
		aerolineas.RegistarPasajero(nacho);
		aerolineas.RegistarPasajero(juan);
		assertTrue(aerolineas.asignarAsientoPasajeroParaUnVuelo(123, 456, "3"));
		assertFalse(aerolineas.asignarAsientoPasajeroParaUnVuelo(123, 789, "12"));
		assertTrue(aerolineas.obtenerListaDeAscientoOcupadosDeUnVuelo(123).contains("3"));
		assertTrue(aerolineas.obtenerListaDeAscientoOcupadosDeUnVuelo(123).contains("12"));
		assertTrue(aerolineas.obtenerListaDeAscientoDisponibleDeUnVuelo(123).contains("15"));
		assertFalse(aerolineas.obtenerListaDeAscientoDisponibleDeUnVuelo(123).contains("4"));
	}
	
	@Test
	public void cambiarAsientoDeUnPasajeroParaUnVuelo() {
		ArrayList<String>ascientos = new ArrayList<>();
		Avion aa123 = new Avion(123, "aa123", ascientos);
		aa123.crearAscientos();
		Vuelo bsas = new Vuelo(987, "formosa", "Buenos aires", aa123);
		Empresa aerolineas = new Empresa("Aerolineas");
		Pasajero nacho = new Pasajero(456, "charlin");
		aerolineas.regitrarVuelo(bsas);
		aerolineas.registrarAvion(aa123);
		aerolineas.RegistarPasajero(nacho);
		assertTrue(aerolineas.asignarAsientoPasajeroParaUnVuelo(987, 456, "3"));
		assertTrue(aerolineas.cambiarAscientoDeUnPasajeroParaUnVuelo(987, 456, "15"));
	}
}
