package ejercitacion;

import java.util.Scanner;

public class Checkin {
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
		/*
		 * Interfaz de usuario encargada de cargar un pasajero al vuelo. Debe ingresar
		 * los datos necesarios e informar por pantalla el resultado de la operación
		 */
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		System.out.print("Ingrese nombre del pasajero : ");
		nombre = teclado.nextLine();
		System.out.print("Ingrese apellido : ");
		apellido = teclado.nextLine();
		System.out.print("Ingrese dni : ");
		dni = teclado.nextInt();
		Pasajero pasajeroARegistrar = new Pasajero(dni, nombre, apellido);
		if(actual.agregarPasajero(pasajeroARegistrar) == true) {
			System.out.println("Pasajero registrado exitosamente");
		}else {
			System.out.println("No se puedo agregar");
		}
	}

	private static void elegirAsiento(Vuelo actual) {
		/*
		 * Interfaz de usuario encargada de gestionar la asignación de asientos en el
		 * vuelo. Debe permitir el ingreso de los datos y mostrar por pantalla el
		 * resultado de la operación
		 */
		Scanner teclado = new Scanner(System.in);
		int dni, fila=0, columna=0;
		Pasajero pasajeroASentar;
		System.out.print("dni del pasajero a sentar : ");
		dni = teclado.nextInt();
		pasajeroASentar = actual.buscarPasajero(dni);
			if(pasajeroASentar != null) {
				System.out.print("Ingresar fila : ");
				fila = teclado.nextInt();
				System.out.print("Ingrese columna : ");
				columna = teclado.nextInt();
				actual.asignarAsiento(pasajeroASentar, fila, columna);
				System.out.println("Se sento el pasajero");
				System.out.println(actual.toString());
			}else {
				System.out.println("No se encontro el pasajero");
			}
			
			
	}

	private static void listarPasajeros(Vuelo actual) {
		actual.ordenarListaDePasajerosPorDNI();
		for (int i = 0; i < actual.getPasajeros().length; i++) {
			if(actual.getPasajeros()[i]!= null) {
				System.out.println(actual.getPasajeros()[i].toString());
			}
		}	
		
		/*
		 * Se debe mostrar la lista de pasajeros registrados para éste vuelo ordenados
		 * por DNI
		 */
	}
}
