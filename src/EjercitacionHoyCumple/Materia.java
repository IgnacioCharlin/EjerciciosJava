package EjercitacionHoyCumple;

public class Materia {
	private Alumno alumno[];
	private int cantidadDeAlumnos;
	public Materia () {
		cantidadDeAlumnos = 0;
		alumno = new Alumno [10];
	}
	
	public boolean agregarAlumno (Alumno actual) {
		for (int i = 0; i < alumno.length; i++) {
			if(alumno[i]==null) {
				alumno[i]= actual;
				cantidadDeAlumnos++;
				return true;
			}
		}
		return false;
	}

	public int getCantidadDeAlumnos() {
		return cantidadDeAlumnos;
	}
	
	/*public double calcularElPromedioDelParcial(int posicion){
		int acumulado=0;
		double nota=0.0;
		promedio = alumno[posicion].getNotas();
		for (int i = 0; i < alumno.length; i++) {
			if(promedio[i]!= 0) {
				nota += promedio[i];
				acumulado++;
			}
		}
		nota = (nota/acumulado);
		return nota;
	}*/
	public double calcularElPromedioDelParcial(int numeroDeAlumno) {
        int contador=0;
        double nota=0.0;
        for(int i=0; i< cantidadDeAlumnos;i++) {
            if(alumno[i]!=null) {
            	nota+= alumno[numeroDeAlumno].getNotas()[i];
            	return alumno[numeroDeAlumno].getNotas()[i];
                //contador++;
            }
        }
        nota = (nota / contador);
        return nota;
   }
	
	public Alumno obtenerAlumno(int posicion) {
		return alumno[posicion];
	}
	
	public int calcularLaCantidadDePromocionados(){
		int contador = 0;
		for (int i = 0; i < alumno.length; i++) {
			if(calcularElPromedioDelParcial(i)!=0 && calcularElPromedioDelParcial(i)>=7){
				contador++;
			}
		}
		return contador;
	}
	
	public double calcularLaNotaMasAlta(int posicion) {
		double notaMasAlta=0.0;
		for (int i = 0; i < cantidadDeAlumnos; i++) {
			if (notaMasAlta < alumno[posicion].getNotas()[i]) {
				notaMasAlta=alumno[posicion].getNotas()[i];
			}
		}
		return notaMasAlta;
	}
	
	public static void main(String[] args) {
		Materia pb1 = new Materia();
		Alumno camila = new Alumno(123);
		Alumno juan = new Alumno(123);
		pb1.agregarAlumno(camila);
		pb1.agregarAlumno(juan);


		camila.rendir(0, 7.0);
		juan.rendir(0, 4.0);
		
		camila.rendir(1, 7.0);
		juan.rendir(1, 8.0);
		System.out.println(pb1.calcularElPromedioDelParcial(1));
		
	}

}
