package ar.edu.unlam.pb1.final2020.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.final2020.dominio.Funcion;
import ar.edu.unlam.pb1.final2020.dominio.Sala;

public class Cine {
	
	private static int CANTIDAD_FUNCIONES_POR_DIA = 10;

	public static void main(String[] args) {
		
		System.out.println("Bienvenido ");
		Sala sala1 = new Sala("Sala Francella", 50, 10);
		Sala sala2 = new Sala("Sala Oreiro", 30, 10);
		Sala sala3 = new Sala("Sala Jolie", 80, 30);
		
		Funcion funciones[] = new Funcion[CANTIDAD_FUNCIONES_POR_DIA];

		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1: 
				ingresarFunciones(funciones, sala1, sala2, sala3);
				break;
			case 2: 
				realizarReserva(funciones);
				break;
			case 3:
				ingresarNuevoEspectador(funciones);
				break;
			case 4:
				mantenimientoDeSala(funciones);
				break;
			case 9:
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}

		} while (opcion != 9);
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Ingresar las funciones del día");
		System.out.println("2 - Realizar reserva ");
		System.out.println("3 - Ingresar nuevo espectador");
		System.out.println("4 - Mantenimiento de sala");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}
	
	private static void ingresarFunciones(Funcion funciones[], Sala sala1, Sala sala2, Sala sala3) {
		
		/*
		 * Interfaz de usuario encargada de definir qué funciones ofrecerá el cine en un día determinado. Se debe considerar las salas que dispone el cine.  
		 */
		Scanner teclado = new Scanner(System.in);
		String diaYHora, pelicula;
		int aptaParaMayoresDe;

	}

	private static void realizarReserva(Funcion funciones[]) {
		
		/*
		 * Interfaz de usuario encargada de realizar una nueva reserva. Se debe seleccinar la función deseada e ingresar los datos del espectador 
		 */
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni, edad;

		
	}
	
	private static void ingresarNuevoEspectador(Funcion funciones[]) {
		
		/*
		 * Interfaz de usuario encargada de realizar el ingreso de un nuevo espectador. Se debe solicitar datos de la funcion y espectador. Sólo se pueden ingresar espectadores que tengan una reserva previa
		 */
		Scanner teclado = new Scanner(System.in);
		int dni;
	}
	
	private static void mantenimientoDeSala(Funcion funciones[]) {
		
		/*
		 * Al finalizar una función, se solicita el mantenimiento de la sala, lo cual implica además de las tareas de limpieza, verificar que todos los asientos queden liberados para recibir una nueva función
		 */
		Scanner teclado = new Scanner(System.in);
	}
}
