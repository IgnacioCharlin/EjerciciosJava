package ar.edu.unlam.sistemaNota;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class TestUniversidad {

	@Test
	public void queSeCreeElProfesor() {
		Profesor nuevo = new Profesor(1l, "charlin");
		assertNotNull(nuevo);
	}
	@Test
	public void queNoSeAgregeUnProfesorRepetidoId() {
		Profesor nuevo = new Profesor(1l, "charlin");
		Profesor nuevo2 = new Profesor(1l, "perez");
		Universidad unlam = new Universidad("UNLAM");
		assertTrue(unlam.agregarProfesor(nuevo));
		assertFalse(unlam.agregarProfesor(nuevo2));
	}
	@Test
	public void queSeAgregeElProfesor() {
		Profesor nuevo = new Profesor(1l, "charlin");
		Universidad unlam = new Universidad("UNLAM");
		assertTrue(unlam.agregarProfesor(nuevo)); 
		
	}
	@Test
	public void queSeBusqueUnProfesor() {
		Profesor nuevo = new Profesor(1l, "charlin");
		Profesor nuevo2 = new Profesor(2l, "perez");
		Universidad unlam = new Universidad("UNLAM");
		unlam.agregarProfesor(nuevo);
		unlam.agregarProfesor(nuevo2);
		assertNotNull(unlam.buscarProfesor(2l));
	}
	@Test
	public void queSeCreeElAlumno() {
		Alumno nuevo = new Alumno(1l, "charlin");
		assertNotNull(nuevo);
	}
	@Test
	public void queSeAgregeElAlumno() {
		Alumno nuevo = new Alumno(1l, "charlin");
		Universidad unlam = new Universidad("UNLAM");
		assertTrue(unlam.inscribirAlumno(nuevo)); 
		
	}
	@Test
	public void queSeBusqueUnAlumno() {
		Alumno nuevo = new Alumno(1l, "charlin");
		Alumno nuevo2 = new Alumno(2l, "perez");
		Universidad unlam = new Universidad("UNLAM");
		unlam.inscribirAlumno(nuevo);
		unlam.inscribirAlumno(nuevo2);
		assertNotNull(unlam.buscarAlumno(2l));
	}
	
	@Test
	public void queSeElimineMateria() {
		Materia mate = new Materia(1l, "matematica", 1);
		Materia ingles = new Materia(2l, "ingles", 2);
		Universidad unlam = new Universidad("UNLAM");
		unlam.agregarMateria(mate);
		unlam.agregarMateria(ingles);
		Integer numeroPrueba = 1;
		unlam.eliminarMateria(1l);
		assertEquals(numeroPrueba, unlam.getMaterias().size());
	}
	
	@Test
	public void agregarCurso() {
		Materia mate = new Materia(1l, "matematica", 1);
		Universidad unlam = new Universidad("UNLAM");
		Curso pb1 = new Curso(1l, "matematicaTurnoNoche", mate);
		unlam.agregarMateria(mate);
		assertTrue(unlam.agregarCurso(pb1)); 
	}
	@Test
	public void queNoagregarCursoSinMateria() {
		Materia mate = new Materia(1l, "matematica", 1);
		Universidad unlam = new Universidad("UNLAM");
		Curso pb1 = new Curso(1l, "matematicaTurnoNoche", mate);
		assertFalse(unlam.agregarCurso(pb1)); 
	}
	@Test
	public void agregarProfesorAlCurso() {
		Materia mate = new Materia(1l, "matematica", 1);
		Universidad unlam = new Universidad("UNLAM");
		Curso pb1 = new Curso(1l, "matematicaTurnoNoche", mate);
		Profesor nuevo = new Profesor(1l, "Charlin");
		unlam.agregarProfesor(nuevo);
		unlam.agregarMateria(mate);
		unlam.agregarCurso(pb1);
		assertTrue(unlam.agregarProfesoresAlCurso(1l, nuevo)); 
	}
}
