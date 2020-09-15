package SistemaAlumnos;

public class Aula {
	private Alumno alumnosEnElAula[];
	private Alumno bancosDelAula[][];
	private int numeroDelAula;
	
	public Aula (int numeroDelAula , int filasDeBancos , int columnasDeBancos) {
		this.numeroDelAula = numeroDelAula;
		alumnosEnElAula = new Alumno[(filasDeBancos*columnasDeBancos)];
		bancosDelAula = new Alumno[filasDeBancos][columnasDeBancos];
		limpiarMatriz();
		limpiarVector();
	}
	
	public boolean agregarAlumno (Alumno nuevo) {
		for (int i = 0; i < alumnosEnElAula.length; i++) {
			if(alumnosEnElAula[i]== null) {
				alumnosEnElAula[i] = nuevo;
				return true;
			}
		}
		return false;
	}
	
	public boolean ocuparAsciento (Alumno nuevo,int fila ,int columna) {
		for (int i = 0; i < bancosDelAula.length; i++) {
			for (int j = 0; j < bancosDelAula[i].length; j++) {
				if(bancosDelAula[fila][columna]== null) {
					bancosDelAula[fila][columna] = nuevo;
					return true;
				}
			}
		}
		return false;
	}
	
	public Alumno buscarAlumno (long dni) {
		Alumno alumnoBuscado=null;
		for (int i = 0; i < alumnosEnElAula.length; i++) {
			if(alumnosEnElAula[i] != null) {
				if(alumnosEnElAula[i].getDni() == dni) {
					alumnoBuscado = alumnosEnElAula[i];
				}
			}	
		}
		return alumnoBuscado;
	}
	
	public String toString() {
		String mapa="";
		for (int i = 0; i < bancosDelAula.length; i++) {
			mapa += "\n";
			for (int j = 0; j < bancosDelAula[i].length; j++) {
				if(bancosDelAula[i][j]!= null) {
					mapa+="[O]";
				}else {
					mapa +="[L]";
				}
			}
		}
		return mapa;
	}
	
	public void limpiarVector() {
		for (Alumno alumno : alumnosEnElAula) {
			alumno = null;
		}
	}
	public void limpiarMatriz () {
		for (int i = 0; i < bancosDelAula.length; i++) {
			for (int j = 0; j < bancosDelAula[i].length; j++) {
				bancosDelAula[i][j]= null;
			}
		}
	}
}
