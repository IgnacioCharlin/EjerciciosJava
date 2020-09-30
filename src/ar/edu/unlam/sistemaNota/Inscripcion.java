package ar.edu.unlam.sistemaNota;

import java.util.HashSet;

public class Inscripcion {
	private Long id;
	private Integer cicloLectivo;
	private Curso curso;
	private HashSet <Alumno> alumnosInscriptos;
	
	public Inscripcion(Long id, Integer cicloLectivo, Curso curso) {
		super();
		this.id = id;
		this.cicloLectivo = cicloLectivo;
		this.curso = curso;
		alumnosInscriptos = new HashSet<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCicloLectivo() {
		return cicloLectivo;
	}

	public void setCicloLectivo(Integer cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}

	

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public HashSet<Alumno> getAlumnosInscriptos() {
		return alumnosInscriptos;
	}

	public void setAlumnosInscriptos(HashSet<Alumno> alumnosInscriptos) {
		this.alumnosInscriptos = alumnosInscriptos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inscripcion other = (Inscripcion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Curso getCurso() {
		return curso;
	}
	
	
}
