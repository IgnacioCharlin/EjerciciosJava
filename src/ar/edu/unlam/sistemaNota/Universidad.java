package ar.edu.unlam.sistemaNota;

import java.util.HashSet;

public class Universidad {
	private String nombreDeLaUniversidad;
	private HashSet<Profesor> profesores;
	private HashSet<Alumno> alumnos;
	private HashSet<Materia> materias;
	private HashSet<Curso> cursos;
	private HashSet<Inscripcion> inscripciones;

	public Universidad(String nombreDeLaUniversidad) {
		this.nombreDeLaUniversidad = nombreDeLaUniversidad;
		profesores = new HashSet<Profesor>();
		alumnos = new HashSet<Alumno>();
		materias = new HashSet<Materia>();
		cursos = new HashSet<>();
		inscripciones = new HashSet<>();
	}

	public Boolean agregarProfesor(Profesor nuevo) {
		return profesores.add(nuevo);
	}

	public Profesor buscarProfesor(Long id) {
		for (Profesor profesor : profesores) {
			if (profesor.getId().equals(id)) {
				return profesor;
			}
		}
		return null;
	}

	public Boolean inscribirAlumno(Alumno nuevo) {
		return alumnos.add(nuevo);
	}

	public Alumno buscarAlumno(Long id) {
		for (Alumno alumno : alumnos) {
			if (alumno.getId().equals(id)) {
				return alumno;
			}
		}
		return null;
	}

	public Boolean agregarMateria(Materia nueva) {
		return materias.add(nueva);
	}

	public Materia buscarMateria(Long id) {
		for (Materia materias : materias) {
			if (materias.getId().equals(id)) {
				return materias;
			}
		}
		return null;
	}

	public Boolean eliminarMateria(Long id) {
		for (Materia materias : materias) {
			if (materias.getId().equals(id)) {
				return this.materias.remove(materias);
			}
		}
		return false;
	}

	public HashSet<Materia> getMaterias() {
		return materias;
	}

	public Boolean agregarCurso(Curso nuevo) {
		Materia MateriaAsignadaAlCurso = buscarMateria(nuevo.getMateria().getId());
		if (MateriaAsignadaAlCurso != null) {
			return cursos.add(nuevo);
		}
		return false;
	}

	public Curso buscarCurso(Long idCurso) {
		for (Curso cursos : cursos) {
			if (cursos.getId().equals(idCurso)) {
				return cursos;
			}
		}
		return null;
	}

	public Boolean agregarProfesoresAlCurso(Long idCurso, Profesor profesor) {
		if (profesor != null) {
			return buscarCurso(idCurso).getProfesoresDeLaMateria().add(profesor);
		}
		return false;
	}

	public Boolean agrearInscripcion(Inscripcion nuevo) {
		Curso cursoAInscribir = buscarCurso(nuevo.getCurso().getId());
		if (cursoAInscribir != null) {
			return inscripciones.add(nuevo);
		}
		return false;
	}

	public Inscripcion buscarInscripcion(Long id) {
		for (Inscripcion inscipcion : inscripciones) {
			if (inscipcion.getId().equals(id)) {
				return inscipcion;
			}
		}
		return null;
	}
}
