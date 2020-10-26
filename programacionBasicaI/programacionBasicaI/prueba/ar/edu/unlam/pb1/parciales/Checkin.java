package ar.edu.unlam.pb1.parciales;

import java.util.Scanner;

import ar.edu.unlam.pb1.parciales.Pasajero;
import ar.edu.unlam.pb1.parciales.Vuelo;

public class Checkin {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido ");
		int CantidadPasajero = 189;
		Avion vuelo = new Avion("Buenos Aires", "Bariloche", CantidadPasajero);

		int opcion = 0;
		boolean salir = false;
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
			case 9:
				imprimirMapa(vuelo);
				System.out.println("Saliendo..");
			default:
				System.out.println("Opción Invalida");
				salir= true;
				break;
			}

		} while (salir != true);
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
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
	
	public static void registrarPasajero(Avion actual) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		System.out.print("Ingrese nombre");
		nombre = teclado.nextLine();
		System.out.print("Ingrese apellido:");
		apellido= teclado.nextLine();
		System.out.print("Ingrese dni");
		dni = teclado.nextInt();
		Pasajero1 nuevo = new Pasajero1(nombre,apellido, dni);
		if (actual.ingresarPasajero(nuevo)==true) {
			System.out.println("Se agrego pasajero");
		}else {
			System.out.println("No se agrego pasajero");
		}
	}
	
	private static void elegirAsiento(Avion actual) {
		
		/*
		 * Interfaz de usuario encargada de gestionar la asignación de asientos en el vuelo. Debe permitir el ingreso de los datos y mostrar por pantalla el resultado de la operación.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int dni, fila, columna;
		Pasajero1 pasajeroASentar;
		System.out.print("Ingresa dni");
		dni= teclado.nextInt();
		System.out.println("Ingresa fila");
		fila = teclado.nextInt();
		System.out.println("Ingresa columna");
		columna = teclado.nextInt();
		pasajeroASentar = actual.buscarPasajero(dni);
		if (actual.asignarAsciento(dni, fila, columna) == true) {
			System.out.println("Se asigno asciento correctamente");
		}else {
			System.out.println("No se puedo asignar asciento");
		}
	}

	private static void listarPasajeros(Avion actual) {
		System.out.println(actual.listarPasajeros());
		/*
		 * Se debe mostrar la lista de pasajeros registrados para este vuelo ordenados por DNI
		 */
		
	}
	
	private static void imprimirMapa(Avion actual) {
		System.out.println(actual.mapaDelVuelo());
	}
}
