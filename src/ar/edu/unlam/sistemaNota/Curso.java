package ar.edu.unlam.sistemaNota;

import java.util.HashSet;

public class Curso {
	private Long id;
	private String descripcion;
	private Materia materia;
	private HashSet<Profesor> profesoresDeLaMateria;
	

	public Curso(Long id, String descripcion, Materia materia) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.materia = materia;
		profesoresDeLaMateria = new HashSet<>();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public HashSet<Profesor> getProfesoresDeLaMateria() {
		return profesoresDeLaMateria;
	}

	public void setProfesoresDeLaMateria(HashSet<Profesor> profesoresDeLaMateria) {
		this.profesoresDeLaMateria = profesoresDeLaMateria;
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
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Materia getMateria() {
		return materia;
	}
	
	
}
