package ejercitacion;



import java.util.Scanner;



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
				System.out.println(sala1.toString());
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
		Sala salaElegida = null;
		System.out.print("Ingrese el nombre de la pelicula a transmitir: ");
		pelicula = teclado.nextLine();
		System.out.print("Ingrese dia y hora : ");
		diaYHora = teclado.nextLine();
		System.out.print("Apta para mayores de : ");
		aptaParaMayoresDe = teclado.nextInt();
		do {
			System.out.print("En que sala se va a transmitir la pelicula: ");
			int numeroDeLaSala = teclado.nextInt();
			switch (numeroDeLaSala) {
				case 1:
					salaElegida = sala1;
				break;
				case 2:
					salaElegida = sala2;
					break;
				case 3:
					salaElegida = sala3;
					break;	
				default:
					System.out.println("Error no existe esa sala");
					break;
			}
		}while(salaElegida == null);
		Funcion nuevaFuncion = new Funcion(diaYHora, pelicula, aptaParaMayoresDe, salaElegida);
		boolean sePudo = false;
		for (int i = 0; i < funciones.length && sePudo != true; i++) {
			if(funciones[i] == null) {
				funciones[i] = nuevaFuncion;
				System.out.println("Funcion agregada correctamente");
				sePudo = true;
			}
		}
	}

	private static void realizarReserva(Funcion funciones[]) {
		
		/*
		 * Interfaz de usuario encargada de realizar una nueva reserva. Se debe seleccinar la función deseada e ingresar los datos del espectador 
		 */
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni, edad;
		Funcion funcionSeleccionada = null;
		System.out.print("Que funcion desea ver : ");
		String funcionDeseada = teclado.nextLine();
		for (int i = 0; i < funciones.length; i++) {
			if(funciones[i]!=null) {
				if(funciones[i].getPelicula().equals(funcionDeseada)) {
					funcionSeleccionada = funciones[i];
				}
			}
		}
		if(funcionSeleccionada != null) {
			System.out.print("Ingrese nombre del espectador : ");
			nombre = teclado.nextLine();
			System.out.print("Ingrese el apellido : ");
			apellido = teclado.nextLine();
			System.out.print("Ingrese la edad : ");
			edad = teclado.nextInt();
			System.out.print("Ingrese el dni : ");
			dni = teclado.nextInt();
			Espectador nuevoEspectador = new Espectador(dni, nombre, apellido, edad);
			if(funcionSeleccionada.reservar(nuevoEspectador) == true) {
				System.out.println("Reservacion exitosa");
			}else {
				System.out.println("No se obtuvo la reserva");
			}
		}else {
			System.out.println("No se pudo asignar reserva");
		}
	}
	
	private static void ingresarNuevoEspectador(Funcion funciones[]) {
		
		/*
		 * Interfaz de usuario encargada de realizar el ingreso de un nuevo espectador. Se debe solicitar datos de la funcion y espectador. Sólo se pueden ingresar espectadores que tengan una reserva previa
		 */
		Scanner teclado = new Scanner(System.in);
		int dni;
		boolean sePudo = false;
		Sala salaDeLaFuncion = null;
		Espectador espectadorAIngresar = null;
		System.out.print("Ingrese el dni de la reservacion : ");
		dni = teclado.nextInt();
		for (int i = 0; i < funciones.length && sePudo != true; i++) {
			if(funciones[i] != null) {	
				if(funciones[i].buscarReserva(dni)!= null) {
					espectadorAIngresar = funciones[i].buscarReserva(dni);
					salaDeLaFuncion = funciones[i].getSala();
					sePudo = true;
				}	
			}	
		}
		if(sePudo == true && salaDeLaFuncion != null) {
			System.out.print("Ingrese fila: ");
			int fila = teclado.nextInt();
			System.out.print("Ingrese columna : ");
			int columna = teclado.nextInt();
			salaDeLaFuncion.ingresarEspectador(fila, columna, espectadorAIngresar);
			System.out.println("Asignacion de asciento exitosamente");
		}else {
			System.out.println("No se pudo ingresar espectador");
		}
	}
	
	private static void mantenimientoDeSala(Funcion funciones[]) {
		
		/*
		 * Al finalizar una función, se solicita el mantenimiento de la sala, lo cual implica además de las tareas de limpieza, verificar que todos los asientos queden liberados para recibir una nueva función
		 */
		Scanner teclado = new Scanner(System.in);
		Sala salaALimpiar = null;
		boolean sePudo = false;
		Funcion funcionFinalizada = null;
		System.out.print("Ingrese la funcion finalizada : ");
		String nombreDeLaFuncion = teclado.nextLine();
		for (int i = 0; i < funciones.length && sePudo != true; i++) {
			if(funciones[i].getPelicula().equals(nombreDeLaFuncion)) {
				funcionFinalizada = funciones[i];
				salaALimpiar = funcionFinalizada.getSala();
				salaALimpiar.vaciarSala();
				System.out.println(salaALimpiar.toString());
				System.out.println("Sala limpiada exitosamente");
				sePudo = true;
			}else {
				System.out.println("No se pudo realizar limpieza");
			}
		}
	}
}
