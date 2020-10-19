package TrabajoPractico2Punto2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHospital {

	@Test
	public void queSeCreeUnPlato() {
		Plato arroz = new Plato("en olla");
		assertTrue(arroz.agregarIngrediente("arroz"));
	}
	
	@Test
	public void queSeCreaUnPaciente() {
		Pacientes nuevo = new Pacientes("juan", (long) 123);
		assertNotNull(nuevo);
	}
	
	@Test
	public void pacienteDiabeticoIngiereUnPlato() {
		Diabetico diabetico = new Diabetico("Juan", (long) 123, 1);
		Plato arroz = new Plato("en olla");
		assertTrue(arroz.agregarIngrediente("arroz"));
		assertTrue(arroz.agregarIngrediente("queso"));
		assertTrue(diabetico.consumirPlato(arroz));
		
	}
	
	@Test
	public void pacienteDiabeticoTipo2RecibeInsulina() {
		Diabetico diabetico = new Diabetico("Juan", (long) 123, 2);
		assertTrue(diabetico.recibirDosisDeInsulina());
		
	}
	
	@Test
	public void pacienteDiabeticoTipo1NoRecibeInsulina() {
		Diabetico diabetico = new Diabetico("Juan", (long) 123, 1);
		assertFalse(diabetico.recibirDosisDeInsulina());
		
	}
	
	@Test
	public void pacienteDiabeticoNoComePlatoConAzucar() {
		Diabetico diabetico = new Diabetico("Juan", (long) 123, 1);
		Plato cafe = new Plato("sin coccion");
		assertTrue(cafe.agregarIngrediente("cafe"));
		assertTrue(cafe.agregarIngrediente("azucar"));
		assertFalse(diabetico.consumirPlato(cafe));
		
	}
	
	@Test
	public void pacienteOncologicoCome() {
		Oncologico oncologico = new Oncologico("Juan", (long) 123);
		Plato carne = new Plato("horno");
		assertTrue(carne.agregarIngrediente("carne"));
		assertTrue(carne.agregarIngrediente("pure"));
		assertTrue(oncologico.consumirPlato(carne));
		
	}
	@Test
	public void pacienteOncologicoNoComoSinCoccion() {
		Oncologico oncologico = new Oncologico("Juan", (long) 123);
		Plato carne = new Plato("sin coccion");
		assertTrue(carne.agregarIngrediente("carne"));
		assertTrue(carne.agregarIngrediente("pure"));
		assertFalse(oncologico.consumirPlato(carne));
		
	}
	@Test
	public void pacienteCeliacoCome() {
		Celiaco celiaco = new Celiaco("Juan", (long) 123);
		Plato carne = new Plato("sin coccion");
		assertTrue(carne.agregarIngrediente("carne"));
		assertTrue(carne.agregarIngrediente("pure"));
		assertTrue(celiaco.consumirPlato(carne));
		
	}
	@Test
	public void pacienteCeliacoConHarina() {
		Celiaco celiaco = new Celiaco("Juan", (long) 123);
		Plato milanesa = new Plato("sin coccion");
		assertTrue(milanesa.agregarIngrediente("carne"));
		assertTrue(milanesa.agregarIngrediente("trigo"));
		assertFalse(celiaco.consumirPlato(milanesa));
		
	}
	@Test
	public void pacienteHipertensoCome() {
		Hipertenso hipertenso = new Hipertenso("Juan", (long) 123);
		Plato carne = new Plato("sin coccion");
		assertTrue(carne.agregarIngrediente("carne"));
		assertTrue(carne.agregarIngrediente("pure"));
		assertTrue(hipertenso.consumirPlato(carne));
		
	}
	@Test
	public void pacienteHipertensoNoCome() {
		Hipertenso hipertenso = new Hipertenso("Juan", (long) 123);
		Plato carne = new Plato("sin coccion");
		assertTrue(carne.agregarIngrediente("carne"));
		assertTrue(carne.agregarIngrediente("pure"));
		assertTrue(carne.agregarIngrediente("sal"));
		assertFalse(hipertenso.consumirPlato(carne));
		
	}

}
