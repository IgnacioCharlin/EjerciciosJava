package EjercitacionPrueba;
import java.util.Scanner;
public class CheckIn {

	public static void main(String[] args) {
		System.out.println("Bienvenido ");
		int CantidadPasajero = 192;
		Vuelo vuelo = new Vuelo("Buenos Aires", "Bariloche", CantidadPasajero);
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				registrarPasajero(vuelo);
				break;
			case 2:
				elegirAsiento(vuelo);
				break;
			case 3:
				listarPasajeros(vuelo);
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}
		} while (opcion != 9);

	}

	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar pasajero");
		System.out.println("2 - Elegir Asiento");
		System.out.println("3 - Listar pasajeros");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

	public static void registrarPasajero(Vuelo actual) {
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		System.out.print("Ingrese nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Ingrese apellido: ");
		apellido= teclado.nextLine();
		System.out.print("Ingrese dni: ");
		dni = teclado.nextInt();
		Pasajero nuevo = new Pasajero(dni, nombre, apellido);
		if(actual.agregarPasajero(nuevo)==true) {
			System.out.println("Pasajero registrado exitosamente");
		}else {
			System.out.println("No se pudo agregar");
		}
	}

	private static void elegirAsiento(Vuelo actual) {
		Scanner teclado = new Scanner(System.in);
		int dni, fila, columna;
		Pasajero pasajeroASentar;
		System.out.print("Ingrese dni el pasajero a sentar : ");
		dni = teclado.nextInt();
		pasajeroASentar = actual.buscarPasajero(dni);
		if(pasajeroASentar != null) {
			System.out.print("Ingesar fila: ");
			fila= teclado.nextInt();
			System.out.print("Ingresa columna : ");
			columna = teclado.nextInt();
			if(actual.asignarAsiento(pasajeroASentar, fila, columna)==true) {
				System.out.println("Se asigno asciento");
			}else {
				System.out.println("No se pudo asignar asciento");
			}
		}else {
			System.out.println("No se encontro pasajero");
		}
	}

	private static void listarPasajeros(Vuelo actual) {
		actual.ordenarListaDePasajerosPorDNI();
		for (int i = 0; i < actual.getPasajeros().length; i++) {
			if(actual.getPasajeros()[i]!= null) {
				System.out.println(actual.getPasajeros()[i].toString());
			}
		}
	}

}
