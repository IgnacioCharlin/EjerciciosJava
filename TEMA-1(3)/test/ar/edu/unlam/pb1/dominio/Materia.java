package ar.edu.unlam.pb1.dominio;

public class Materia {
	private Integer numeroDeMateria;
	private String nombreDeLaMateria;
	private Alumno inscripcionDeAlumnos[];
	private Integer cantidadDeAlumnos;

	public Materia(Integer numeroDeMateria, String nombreDeLaMateria) {
		super();
		this.numeroDeMateria = numeroDeMateria;
		this.nombreDeLaMateria = nombreDeLaMateria;
		inscripcionDeAlumnos = new Alumno[100];
		cantidadDeAlumnos = 0;
	}

	public void agregarAlumno(Alumno nuevo) {
		for (int i = 0; i < inscripcionDeAlumnos.length; i++) {
			if (inscripcionDeAlumnos[i] == null) {
				inscripcionDeAlumnos[i] = nuevo;
				cantidadDeAlumnos++;
				break;
			}
		}
	}

	public Double calcularElPromedioDelParcial(Integer posicion){
		Double promedioDelParcial=0.0;
		for (int i = 0; i < inscripcionDeAlumnos[posicion].getExamenesRendido(); i++) {
			if (inscripcionDeAlumnos[posicion]!=null) {
				promedioDelParcial+= inscripcionDeAlumnos[posicion].getNotaDelExamen()[i];
			}
		}
		return promedioDelParcial/inscripcionDeAlumnos[posicion].getExamenesRendido();
	}
	
	public Double calcularLaNotaMasAlta(Integer posicion) {
		Double notaMasAlta = 0.0;
		for (int i = 0; i < inscripcionDeAlumnos[posicion].getExamenesRendido(); i++) {
			if (notaMasAlta<inscripcionDeAlumnos[posicion].getNotaDelExamen()[i]) {
				notaMasAlta = inscripcionDeAlumnos[posicion].getNotaDelExamen()[i];
			}
		}
		return notaMasAlta;
	}

	public Alumno obtenerAlumno(Integer posicion) {
		return inscripcionDeAlumnos[posicion];
	}
	public Integer getCantidadDeAlumnos() {
		return cantidadDeAlumnos;
	}

	public Integer getNumeroDeMateria() {
		return numeroDeMateria;
	}

	public void setNumeroDeMateria(Integer numeroDeMateria) {
		this.numeroDeMateria = numeroDeMateria;
	}

	public String getNombreDeLaMateria() {
		return nombreDeLaMateria;
	}

	public void setNombreDeLaMateria(String nombreDeLaMateria) {
		this.nombreDeLaMateria = nombreDeLaMateria;
	}

	public Alumno[] getAlumnos() {
		return inscripcionDeAlumnos;
	}

	public void setInscripcionDeAlumnos(Alumno[] inscripcionDeAlumnos) {
		this.inscripcionDeAlumnos = inscripcionDeAlumnos;
	}

}
