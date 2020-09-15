package EjercitacionHoyCumple;

public class Alumno {
	private int dni;
	private double notas[];
	
	public Alumno (int dni) {
		this.dni = dni;
		notas = new double[10];
		
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void rendir(int posicion , double nota) {
		if (notas[posicion]<nota) {
			notas[posicion] = nota;
		}	
	}
	
	public double[] getNotas() {
		return notas;
	}
	/*public String getNotas() {
		String lista ="";
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]!=0) {
				lista+=notas[i];
			}
		}
		return lista;
	}*/

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void limpiarArray() {
		for (int i = 0; i < notas.length; i++) {
			notas[i]=0.0;
		}
	}
	
	public boolean aprobo() {
		double promedio=0.0;
		int acumulador=0;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]!= 0.0) {
			promedio += notas[i];
			acumulador++;
			}
		}
		promedio = promedio/acumulador;
		if (promedio>=7) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public double calcularPromedio() {
		double promedio[]=new double[10];
		int acumulado=0;
		double nota=0.0;
		for (int i = 0; i < promedio.length; i++) {
			if(promedio[i]!= 0.0) {
				nota += promedio[i];
				acumulado++;
			}
		}
		return (nota/acumulado);
	}
	public static void main(String[] args) {
		Materia nueva = new Materia();
		Alumno nuevo = new Alumno(123);
		nueva.agregarAlumno(nuevo);
		nuevo.rendir(0, 6);
		nuevo.rendir(0, 10);
		System.out.println(nuevo.getNotas());
		//System.out.println(nueva.getCantidadDeAlumnos());
	}
	
}
