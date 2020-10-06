package ar.edu.unlam.tp1;

public class Tarea {
	private String estado;
	private Integer numeroDeTarea;
	private Usuario usuarioQueLaCreo;
	public Tarea(String estado, Integer numeroDeTarea , Usuario usuarioQueLaCreo) {
		this.estado = estado;
		this.numeroDeTarea = numeroDeTarea;
		this.usuarioQueLaCreo = usuarioQueLaCreo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getNumeroDeTarea() {
		return numeroDeTarea;
	}
	public Usuario getUsuarioQueLaCreo() {
		return usuarioQueLaCreo;
	}
	public void setUsuarioQueLaCreo(Usuario usuarioQueLaCreo) {
		this.usuarioQueLaCreo = usuarioQueLaCreo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeTarea == null) ? 0 : numeroDeTarea.hashCode());
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
		Tarea other = (Tarea) obj;
		if (numeroDeTarea == null) {
			if (other.numeroDeTarea != null)
				return false;
		} else if (!numeroDeTarea.equals(other.numeroDeTarea))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tarea [estado=" + estado + ", numeroDeTarea=" + numeroDeTarea + "]";
	}
	
}
