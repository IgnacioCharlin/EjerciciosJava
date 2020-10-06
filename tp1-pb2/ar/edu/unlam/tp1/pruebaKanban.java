package ar.edu.unlam.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaKanban {

	@Test
	public void crearUsuario() {
		Usuario actual = new Usuario("nacho");
		assertNotNull(actual);
	}
	
	@Test
	public void crearTarea() {
		Usuario nacho = new Usuario("nacho");
		Tarea actual = new Tarea("Pendiente", 123 ,nacho);
		assertNotNull(actual);
	}
	
	@Test
	public void queAgregeUsuario() {
		Usuario actual = new Usuario("nacho");
		Kanban empresa = new Kanban();
		assertTrue(empresa.agregarUsuario(actual));
	}
	
	@Test
	public void queAgregeTarea() {
		Usuario nacho = new Usuario("nacho");
		Tarea actual = new Tarea("Pendiente", 123, nacho);
		Kanban empresa = new Kanban();
		assertTrue(empresa.agregarTarea(actual));
	}
	
	@Test
	public void queSeCambieElEstado() {
		Usuario nacho = new Usuario("nacho");
		Tarea actual = new Tarea("Pendiente", 123, nacho);
		Kanban empresa = new Kanban();
		empresa.agregarTarea(actual);
		assertTrue(empresa.cambiarDeEstadoLaTarea(actual, "Finalizado" , nacho));
		assertEquals("Finalizado", actual.getEstado());
	}
	
	@Test
	public void queOtroUsuarioCambieElEstado() {
		Usuario nacho = new Usuario("nacho");
		Tarea actual = new Tarea("Pendiente", 123, nacho);
		Usuario jose = new Usuario("jose");
		Kanban empresa = new Kanban();
		empresa.agregarTarea(actual);
		assertTrue(empresa.cambiarDeEstadoLaTarea(actual, "Finalizado" , jose));
		assertEquals("Finalizado", actual.getEstado());
	}
	@Test
	public void queOtroUsuarioNoCambieElEstadoEnCurso() {
		Usuario nacho = new Usuario("nacho");
		Tarea actual = new Tarea("En curso", 123, nacho);
		Usuario jose = new Usuario("jose");
		Kanban empresa = new Kanban();
		empresa.agregarTarea(actual);
		empresa.cambiarDeEstadoLaTarea(actual, "Finalizado" , jose);
		assertEquals("En curso", actual.getEstado());
	}
	
		@Test
		public void queUsuarioCreadorCierreTareaEnCurso() {
			Usuario nacho = new Usuario("nacho");
			Tarea actual = new Tarea("En curso", 123, nacho);
			Kanban empresa = new Kanban();
			empresa.agregarTarea(actual);
			assertTrue(empresa.cambiarDeEstadoLaTarea(actual, "Finalizado" , nacho));
			assertEquals("Finalizado", actual.getEstado());
		}
}
