package ar.edu.unlam.disco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DiscoTest {

	@Test
	public void queSePuedaCrearUndisco() {

		// preparacion
		Double radioInterior = 10.0;
		Double radioSuperior = 20.0;

		// Ejecucion

		Disco miDisco = new Disco(radioInterior, radioSuperior);

		assertNotNull(miDisco);

	}

	@Test
	public void queSeObtengaElPErimetroExterior() {

		// preparacion
		Double radioInterior = 10.0;
		Double radioSuperior = 20.0;

		// Ejecucion

		Disco miDisco = new Disco(radioInterior, radioSuperior);

		Double ve = 125.66;
		Double vo = miDisco.obtenerPerimetroSuperior();
		// verificacion
		assertEquals(ve, vo, 0.01);
	}

	@Test
	public void queSeObtengaElPErimetroInterior() {

		// preparacion
		Double radioInterior = 10.0;
		Double radioSuperior = 20.0;

		// Ejecucion

		Disco miDisco = new Disco(radioInterior, radioSuperior);

		Double ve = 62.83;
		Double vo = miDisco.obtenerPerimetroInterior();
		// verificacion
		assertEquals(ve, vo, 0.01);
	}

	@Test
	public void superficieDelDisco() {
		// preparacion
		Double radioInterior = 10.0;
		Double radioSuperior = 20.0;

		// Ejecucion

		Disco miDisco = new Disco(radioInterior, radioSuperior);

		Double ve = 942.47;
		Double vo = miDisco.superficieDelDisco();

		assertEquals(ve, vo, 0.01);
	}
}
