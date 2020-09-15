package SistemaAlumnos;

public class Alumno {
	private String nombreDelAlumno;
	private String apellidoDelAlumno;
	private long dni;
	
	public Alumno(String nombreDelAlumno , String apellidoDelAlumno , long dni ) {
		this.nombreDelAlumno = nombreDelAlumno;
		this.apellidoDelAlumno = apellidoDelAlumno;
		this.dni = dni;
	}

	public String getNombreDelAlumno() {
		return nombreDelAlumno;
	}

	public void setNombreDelAlumno(String nombreDelAlumno) {
		this.nombreDelAlumno = nombreDelAlumno;
	}

	public String getApellidoDelAlumno() {
		return apellidoDelAlumno;
	}

	public void setApellidoDelAlumno(String apellidoDelAlumno) {
		this.apellidoDelAlumno = apellidoDelAlumno;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
}
