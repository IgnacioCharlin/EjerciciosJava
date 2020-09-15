package ar.edu.unlam.cerradura;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

class CerraduraTest {

	@Test
	public void queSeCreaLaCerradura(){
		
		Cerradura miCerradura = new Cerradura(1234, 3);
		assertNotNull(miCerradura);
	}
	
	@Test
	public void queUnaCerraduraNuevaEstaCerrada(){
		//1. Preparación
		Cerradura miCerradura = new Cerradura(1234, 3);
		//2. Ejecución
		Boolean estadoCerradura = miCerradura.estaAbierta();
		//3. Contrastación
		Assert.assertFalse("", estadoCerradura);
	}
	
	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra(){
		Cerradura miCerradura = new Cerradura(4321, 2);
		miCerradura.abrir(4321);
		Boolean estadoCerradura = miCerradura.estaAbierta();
		Assert.assertTrue("", estadoCerradura);
	}
	
	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra(){
		Cerradura miCerradura = new Cerradura(4321,3);
		miCerradura.abrir(1234);
		Boolean estadoCerradura = miCerradura.estaAbierta();
		Assert.assertFalse("", estadoCerradura);
	}
	
	@Test
	public void queLaCerraduraSeBloquee(){
		Cerradura miCerradura = new Cerradura(4321,3);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		Boolean estadoCerradura = miCerradura.estaAbierta();
		Boolean bloqueada = miCerradura.fueBloqueada();
		Assert.assertTrue("", bloqueada);
	}
	@Test
	public void queNoSePuedaAbrirSiEsBloqueada(){
		Cerradura miCerradura = new Cerradura(4321,3);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		miCerradura.abrir(4321);
		Boolean estadoCerradura = miCerradura.estaAbierta();
		Assert.assertFalse("", estadoCerradura);
	}

}
