package ar.edu.unlam.sistemaNota;

public class Materia {
	private Long id;
	private String descripcion;
	private Integer numeroDeCuatrimestre;
	
	
	public Materia(Long id, String descripcion, Integer numeroDeCuatrimestre) {
		this.id = id;
		this.descripcion = descripcion;
		this.numeroDeCuatrimestre = numeroDeCuatrimestre;
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
	public Integer getNumeroDeCuatrimestre() {
		return numeroDeCuatrimestre;
	}
	public void setNumeroDeCuatrimestre(Integer numeroDeCuatrimestre) {
		this.numeroDeCuatrimestre = numeroDeCuatrimestre;
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
		Materia other = (Materia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
