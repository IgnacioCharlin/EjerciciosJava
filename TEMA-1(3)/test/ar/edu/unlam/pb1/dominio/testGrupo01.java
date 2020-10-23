package ar.edu.unlam.pb1.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testGrupo01 {

		@Test
		void queSePuedaAgregarUnAlumno() {
			Alumno camila = new Alumno(33966543, "Camila");
			Materia pb1 = new Materia(6281, "PB1");
			
			pb1.agregarAlumno(camila);

			assertEquals(1, pb1.getCantidadDeAlumnos());
		}
		
		
		@Test
		void queUnAlumnoPuedaRendirUnParcial() {
			Alumno camila = new Alumno(33966543, "Camila");
			Materia pb1 = new Materia(6281, "PB1");

			pb1.agregarAlumno(camila);
			camila.inscribirAlExamen("Primer parcial");

			//El primer parámetro indica el nombre de parcial y el segundo la nota
			camila.rendir("Primer parcial", 6.0);

			assertEquals(6.0, pb1.calcularElPromedioDelParcial(0));
		}
		
		@Test
		void queUnAlumnoApruebe() {
			Alumno camila = new Alumno(33966543, "Camila");
			Materia pb1 = new Materia(6281, "PB1");

			pb1.agregarAlumno(camila);
			camila.inscribirAlExamen("Primer parcial");
			camila.inscribirAlExamen("Segundo parcial");
			//El primer parámetro indica el número de parcial y el segundo la nota
			camila.rendir("Primer parcial", 4.0);
			camila.rendir("Segundo parcial", 7.0);
			
			assertEquals(false, pb1.obtenerAlumno(0).aprobo());
		}
		
		@Test
		void queLaNotaMasAltaSea6() {
			Alumno camila = new Alumno(33966543, "Camila");
			Alumno juan = new Alumno(25966543, "Juan");
			Materia pb1 = new Materia(6281, "PB1");

			pb1.agregarAlumno(camila);
			camila.inscribirAlExamen("Primer parcial");
			pb1.agregarAlumno(juan);
			juan.inscribirAlExamen("Primer parcial");

			camila.rendir("Primer parcial", 2.0);
			juan.rendir("Primer parcial", 6.0);
			
			assertEquals(6.0, pb1.calcularLaNotaMasAlta(0), 0.01);
		}
		
		@Test
		void queLaCantidadDePromocionadosSea1() {
			Alumno camila = new Alumno(33966543, "Camila");
			Alumno juan = new Alumno(25966543, "Juan");
			Materia pb1 = new Materia(6281, "PB1");

			pb1.agregarAlumno(camila);
			pb1.agregarAlumno(juan);
			camila.inscribirAlExamen("Primer parcial");
			camila.inscribirAlExamen("Segundo parcial");
			juan.inscribirAlExamen("Primer parcial");
			juan.inscribirAlExamen("Segundo parcial");


			camila.rendir("Primer parcial", 7.0);
			juan.rendir("Primer parcial", 4.0);
			
			camila.rendir("Segundo parcial", 7.0);
			juan.rendir("Segundo parcial", 8.0);
			
			assertEquals(1, pb1.calcularLaCantidadDePromocionados());
		}
		


}
