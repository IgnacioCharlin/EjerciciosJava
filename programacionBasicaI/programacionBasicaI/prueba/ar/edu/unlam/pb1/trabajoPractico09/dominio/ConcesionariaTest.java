package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConcesionariaTest {

	@Test
	public void queSeCreeLaConcesionariaCorrectamente() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Consesionaria volkswagen = new Consesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche laFlotaDeOlivieri[] = volkswagen.getFlota();
		
		assertEquals("Olivieri", volkswagen.getNombre());
		assertEquals(CANTIDAD_MAXIMA_DE_VEHICULOS, laFlotaDeOlivieri.length);
	}
	
	@Test
	public void queSeAgregueBienUnCoche() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Consesionaria volkswagen = new Consesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche vw = new Coche("VW", "FOX",1000.0);
		
		assertTrue(volkswagen.agregarCoche(vw));
	}
	
	@Test
	public void queSeListeCorrectamenteLaFlota() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Consesionaria volkswagen = new Consesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche vw = new Coche("VW", "FOX",1000.0);
		Coche ford = new Coche("FORD", "KA" ,2007.0);
		String resultado = volkswagen.toString();
		
		volkswagen.agregarCoche(vw);
		volkswagen.agregarCoche(ford);
		resultado = volkswagen.toString();
		
		assertEquals(resultado, volkswagen.toString());
	}
	
	@Test 
	public void BuscarAutoEnLaFlota() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Consesionaria volkswagen = new Consesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche vw = new Coche("VW", "FOX",1000.0);
		Coche ford = new Coche("FORD", "KA" ,2007.0);
		volkswagen.agregarCoche(vw);
		volkswagen.agregarCoche(ford);
		assertEquals(ford, volkswagen.buscarCoche("KA", 2007.0));
	}
	
	@Test
	public void listarAutosPorKilometraje() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Consesionaria volkswagen = new Consesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche vw = new Coche("VW", "FOX",2007.0);
		Coche ford = new Coche("FORD", "KA" ,1000.0);
		Coche fiat = new Coche("FIAT","UNO", 45000.0);
		volkswagen.agregarCoche(vw);
		volkswagen.agregarCoche(ford);
		volkswagen.agregarCoche(fiat);
		volkswagen.listarCoches();
		System.out.println(volkswagen.toString());
		
	}

}
