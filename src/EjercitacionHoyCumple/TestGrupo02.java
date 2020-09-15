package EjercitacionHoyCumple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGrupo02 {

	@Test
	void queSePuedaAgregarUnAlumno() {
		Alumno camila = new Alumno(33966543);
		Materia pb1 = new Materia();
		
		pb1.agregarAlumno(camila);

		assertEquals(1, pb1.getCantidadDeAlumnos());
	}
	
	
	@Test
	void queUnAlumnoPuedaRendirUnParcial() {
		Alumno camila = new Alumno(33966543);
		Materia pb1 = new Materia();

		pb1.agregarAlumno(camila);

		//El primer parámetro indica el número de parcial y el segundo la nota
		camila.rendir(0, 6.0);

		assertEquals(6.0, pb1.calcularElPromedioDelParcial(0));
	}
	
	@Test
	void queUnAlumnoApruebe() {
		Alumno camila = new Alumno(33966543);
		Materia pb1 = new Materia();

		pb1.agregarAlumno(camila);
		//El primer parámetro indica el número de parcial y el segundo la nota
		camila.rendir(0, 5.0);
		camila.rendir(1, 10.0);
		
		
		assertEquals(true, pb1.obtenerAlumno(0).aprobo());
	}
	
	@Test
	void queLaNotaMasAltaSea6() {
		Alumno camila = new Alumno(33966543);
		Alumno juan = new Alumno(25966543);
		Materia pb1 = new Materia();

		pb1.agregarAlumno(camila);
		pb1.agregarAlumno(juan);

		camila.rendir(0, 2.0);
		juan.rendir(0, 6.0);
		
		
		assertEquals(6.0, pb1.calcularLaNotaMasAlta(0), 0.01);
	}
	
	@Test
	void queLaCantidadDePromocionadosSea1() {
		Alumno camila = new Alumno(33966543);
		Alumno juan = new Alumno(25966543);
		Materia pb1 = new Materia();

		pb1.agregarAlumno(camila);
		pb1.agregarAlumno(juan);


		camila.rendir(0, 7.0);
		juan.rendir(0, 4.0);
		
		camila.rendir(1, 7.0);
		juan.rendir(1, 8.0);
		
		assertEquals(1, pb1.calcularLaCantidadDePromocionados());
	}
	

}