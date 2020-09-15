package ejercitacionDePractica;
import java.util.Scanner;
public class CheckIn {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Avion vueloAerolineasArgentinas = new Avion ("Buenos Aires","RIO",192);
		boolean salir = false;
		do {
			mostrarMenu();
			switch (seleccionarOpcion()) {
			case 1:
				System.out.println("Ingrese nombre del pasajero");
				String nombre = teclado.next();
				System.out.println("Ingrese apellido");
				String apellido = teclado.next();
				System.out.println("Ingrese dni");
				long dni = teclado.nextLong();
				teclado.nextLine();
				Pasajero nuevo = new Pasajero(nombre,apellido,dni);
				System.out.println(vueloAerolineasArgentinas.agregarPasajero(nuevo));
				break;
			case 2:
				System.out.println("Ingrese el dni del pasajero a sentar");
				long dniPasajeroASentar = teclado.nextLong();
				System.out.println("Ingrese fila del asciento");
				int fila = teclado.nextInt();
				System.out.println("Ingrese columna del asciento");
				int columna = teclado.nextInt();
				Pasajero pasajeroASentar = vueloAerolineasArgentinas.buscarPasajero(dniPasajeroASentar);
				if(pasajeroASentar!= null) {
				System.out.println(vueloAerolineasArgentinas.asignarAsciento(pasajeroASentar,fila,columna));
				}else {
					System.out.println("No se encontro pasajero");
				}
				break;
			case 3:
				listadoPasajeros(vueloAerolineasArgentinas);
				break;
			case 4 :
				System.out.println("Los lugares libres son : " + lugaresLibre(vueloAerolineasArgentinas));
				break;
			case 5 :
				System.out.println("Saliendo...");
				salir = true;
				break;
			default:
				System.out.println("Error , ingrese nuevamente");
				break;
			}
		} while (salir != true);
		
		System.out.println(vueloAerolineasArgentinas.toString());

	}
	
	public static void mostrarMenu() {
		System.out.println("Bienvenidos");
		System.out.println("-----------");
		System.out.println("1- Agregar pasajero");
		System.out.println("2- Asignar asciento");
		System.out.println("3- Listado de pasajeros");
		System.out.println("4- Mostrar disponibilidad");
		System.out.println("5- Salir");
	}
	
	public static int seleccionarOpcion() {
			Scanner teclado = new Scanner (System.in);
			int resultado = teclado.nextInt();
			teclado.nextLine();
			return resultado;
	}
	
	public static void listadoPasajeros(Avion nuevo) {
		for (int i = 0; i < nuevo.getPasajerosDelAvion().length; i++) {
			if(nuevo.getPasajerosDelAvion()[i] != null) {
				System.out.println(nuevo.verPasajero(i));
			}
		}
	}
	
	public static int lugaresLibre (Avion nuevo) {
		int contadorLibres = 0;
		for (int i = 0; i < nuevo.getAsientosDelAvion().length; i++) {
			for (int j = 0; j < nuevo.getAsientosDelAvion()[i].length; j++) {
				if(nuevo.getAsientosDelAvion()[i][j] == null){
					contadorLibres++;
				}
			}
		}
		return contadorLibres;
	}

}
