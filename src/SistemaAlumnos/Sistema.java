package SistemaAlumnos;
import java.util.Scanner;
public class Sistema {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Aula aulaDeUnlam = new Aula(300, 5, 5);
		boolean salir = false;
		do {
			mostrarMenu();
			switch (selecionarOpcion()) {
			case 1:
				agregarAlumno(aulaDeUnlam);
				break;
			case 2:
				sentarAlumno(aulaDeUnlam);
				break;
			case 3:
				System.out.println(aulaDeUnlam.toString());
				System.out.println("\n");
				break;
			case 4:
				alumnoEncontrado(aulaDeUnlam);
				break;
			case 5:
				System.out.println("Saliendo ...");
				salir = true;
			default:
				System.out.println("Error ingrese nuevamente");
				break;
			}
			
		} while (salir != true);
		System.out.println(aulaDeUnlam.toString());
	}
	
	public static void mostrarMenu() {
		System.out.println("  Bienvenidos");
		System.out.println("----------------");
		System.out.println("1- Ingresar alumno");
		System.out.println("2- Asignar asciento");
		System.out.println("3- Ascientos Disponibles");
		System.out.println("4- Buscar alumno");
		System.out.println("5- Salir");
	}
	
	public static int selecionarOpcion() {
		System.out.print("Selecionar opcion");
		int opcion = teclado.nextInt();
		teclado.nextLine();
		return opcion;
	}
	
	public static void agregarAlumno(Aula unlam) {
		System.out.print("Ingrese nombre del alumno : ");
		String nombreDelAlumno = teclado.nextLine();
		System.out.print("Ingrese el apellido del alumno : ");
		String apellidoDelAlumno = teclado.nextLine();
		System.out.print("Ingrese el dni ");
		long dni = teclado.nextLong();
		teclado.nextLine();
		Alumno nuevo = new Alumno(nombreDelAlumno, apellidoDelAlumno, dni);
		if(unlam.agregarAlumno(nuevo)==true) {
			System.out.println("Se agrego correctamente \n");
		}else {
			System.out.println("No se pudo agregar \n");
		}
	}
	
	public static void alumnoEncontrado (Aula unlam) {
		Alumno encontrado;
		System.out.println("Ingresar dni del alumno a buscar");
		long dni = teclado.nextLong();
		encontrado = unlam.buscarAlumno(dni);
		if(encontrado != null ) {
			System.out.println(encontrado.getApellidoDelAlumno()+" "+encontrado.getNombreDelAlumno()+" "+encontrado.getDni());
		}else {
			System.out.println("No se encontro el alumno solicitado");
		}
	}
	
	public static void sentarAlumno (Aula unlam) {
		System.out.print("Ingrese el dni del alumno a sentar: ");
		long dniAlumnoBuscado = teclado.nextLong();
		Alumno alumnoASentar = unlam.buscarAlumno(dniAlumnoBuscado);
		if(alumnoASentar != null) {
			System.out.print("Ingrese la fila del asciento: ");
			int fila = teclado.nextInt();
			System.out.print("Ingrese columna del asciento: ");
			int columna = teclado.nextInt();
			if(unlam.ocuparAsciento(alumnoASentar, fila, columna)==true) {
				System.out.println("el alumno se sento en el asciento");
			}else {
				System.out.println("No se pudo sentar");
			}
		}else {
			System.out.println("No se encontro alumno");
		}
	}


}
