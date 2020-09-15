package EjercitacionHoyCumple;
import java.util.Scanner;

public class AdministracionProgramas {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		

		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		Canal canalTrece = new Canal("Canal Trece" , 10);
		int opcion=0; 
		do {
		System.out.println("ingrese una opcion");
		System.out.println("1 agregar programa ");
		System.out.println("2 Obtener la duracion promedio de todos los programas");
		System.out.println("3 Incrementar la cantidad de actores");
		System.out.println("0 salir");
		opcion =teclado.nextInt();
		switch (opcion) {
		case 1:
			agregarPrograma(canalTrece);
			//crear un programa y agreguelo al canal creado 
			//Informar si se pudo cargar o no el programa creado
			break;
		case 2:
			System.out.println("La duracion promedio es : "+canalTrece.obtenerLaDuracionPromedioDeTodosLosProgramas());
			//Informar la duracion promedio de todos los programas del canal


			
			break;

		case 3:
			incrementarActores(canalTrece);
			//Ingrese el codigo de un programa del canal y la cantidad de actores que sumara a dicho programa 
			//Ejemplo si el programa xxx tiene 5 actores y le ingresa 3 el mismo pasara a 8
			break;

		case 0:
			System.out.println("salir");
			break;

			
		default:
			System.out.println("opcion no valida");
			break;
		}
		
		
		}	while (opcion!=0);
		
		System.out.println(canalTrece.toString());
	
	}
	
	public static void agregarPrograma(Canal actual) {
		System.out.print("ingresa nombre: ");
		String nombre = teclado.next();
		System.out.print("Ingresa el dia: ");
		String diaDeTransmicion = teclado.next();
		System.out.print("Ingresa cantidad de actores: ");
		int cantidadDeActores = teclado.nextInt();
		System.out.print("Ingresa horario: ");
		int horario = teclado.nextInt();
		System.out.print("Ingresa duracion: ");
		int duracion = teclado.nextInt();
		Programa nuevo = new Programa(nombre, diaDeTransmicion, horario, duracion, cantidadDeActores);
		if (actual.agregarPrograma(nuevo)==true) {
			System.out.println("Se pudo agregar programa");
		}else {
			System.out.println("No se pudo agregar programa");
		}
	}
	
	public static void incrementarActores(Canal actual) {
		System.out.print("Ingresa el nombre del programa: ");
		String programa = teclado.next();
		System.out.print("Cuantos actores quieren incrementar: ");
		int cantidadDeActoresAIncrementar = teclado.nextInt();
		actual.incrementarCantidadDeActores(programa, cantidadDeActoresAIncrementar);
	}
}
