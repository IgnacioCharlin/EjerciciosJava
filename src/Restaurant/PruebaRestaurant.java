package Restaurant;


import java.util.Scanner;


public class PruebaRestaurant {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
Restaurant kansas = new Restaurant("kansas");
		
		int opcionSeleccionada;
		boolean salir = false;
		do {
			mostrarOpciones();
			opcionSeleccionada = teclado.nextInt();
			switch (opcionSeleccionada) {
			case 1:
				agregarMozo(kansas);
				break;
			case 2:
				System.out.println(mesasDisponibles(kansas));
				break;
			case 3 :
				agregarComensal(kansas);
				break;
			case 4 :
				agregarPedido(kansas);
				break;
			case 5 :
				consumoTotalMesa(kansas);
				break;
			case 6:
				cerrarCajar(kansas);
				break;
			case 7:
				System.out.println(kansas.listaDePlatos());
				break;
			case 8:
				System.out.println(listadoDeMozo(kansas));
				break;
			case 9:
				System.out.println("Saliendo...");
				salir = true;
				break;
			default:
				System.out.println("Ingrese nuevamente");
				break;
			}
		} while (salir != true);

	}
	
	private static void mostrarOpciones() {
		System.out.println("menu de opciones");
		System.out.println("1- alta de mozos");
		System.out.println("2- consultar mesas disponibles");
		System.out.println("3- ingresar comensales");
		System.out.println("4- agregar pedido a una mesa");
		System.out.println("5- cerrar mesa");
		System.out.println("6- cerrar caja");
		System.out.println("7- listado de platos");
		System.out.println("8- listado de mosos");
		System.out.println("9- salir");

	}

	public static void agregarMozo(Restaurant actual) { 
		//Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		System.out.print("Ingrese el nombre del nombre del wachin: ");
		nombre = teclado.next();
		Mozo nuevoPasajero = new Mozo(nombre);
		if(actual.agregarMozo(nuevoPasajero) == true) {
			System.out.println("Se registro correctamente el nuevo wachin");
		}else {
			System.out.println("No se pudo registrar");
		}
	}
	
	public static String listadoDeMozo (Restaurant actual) {
		String listadoMozo="";
		for (int i = 0; i < actual.getMozosDelRestaurant().length; i++) {
			if(actual.getMozosDelRestaurant()[i] != null) {
				listadoMozo += actual.getMozosDelRestaurant()[i].getNombre()+"\n";
			}
		}
		return listadoMozo;
	}

	public static String mesasDisponibles(Restaurant nuevo) {
		String disponibilidad = "";
		for (int i = 0; i < nuevo.getMesasDelRestaurant().length; i++) {
			for (int j = 0; j < nuevo.getMesasDelRestaurant()[i].length; j++) {
				if (nuevo.mesasDelRestaurant[i][j] != null) {
					if (nuevo.mesasDelRestaurant[i][j].isDisponibilidad() == true) {
						disponibilidad += "Libre" + nuevo.mesasDelRestaurant[i][j].getNumeroDeMesa() + "\n";
					} else {
						disponibilidad += "Ocupada" + nuevo.mesasDelRestaurant[i][j].getNumeroDeMesa() + "\n";
					}
				}
			}
		}
		return disponibilidad;
	}
	
	public static double listadoPlato(Restaurant nuevo) {
		boolean salir = false;
		double precioTotal=0.0;
		do {
			System.out.println("0 - arroz con pollo --- $150");
			System.out.println("1 - milanesa --- $100");
			System.out.println("2 - pizza --- $50.5");
			System.out.println("3- salir");
			int cantidad = 0;
			int opcion = teclado.nextInt();
			if(opcion!= 3) {
			System.out.println("cuantos");
			cantidad = teclado.nextInt();
			}
			switch(opcion) {
				case 0:
					precioTotal += nuevo.armarPedido(0, cantidad);
					break;
				case 1:
					precioTotal += nuevo.armarPedido(1, cantidad);
					
				break;
				case 2:
					precioTotal+= nuevo.armarPedido(2, cantidad);
				break;
				case 3:
					System.out.println("Saliendo ...");
					salir = true;
				break;
				default :
					System.out.println("Ingrese nuevamente");
				break;
			}
			
		}while(salir != true);
		return precioTotal;

	}
	
	public static void agregarPedido(Restaurant nuevo) {
		System.out.println("ingresa fila");
		int fila = teclado.nextInt();
		System.out.println("ingresa columna");
		int columna = teclado.nextInt();
		if(nuevo.mesasDelRestaurant[fila][columna].isDisponibilidad()==false) {
			nuevo.mesasDelRestaurant[fila][columna].setConsumoTotal(listadoPlato(nuevo));
			
		}else {
			System.out.println("Mesa libre no se puede agregar pedido");
		}
	}
	
	public static void agregarComensal(Restaurant nuevo) {
		//Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese la fila");
		int filaIngresada = teclado.nextInt();
		System.out.println("Ingrese la columna");
		int columnaIngresada = teclado.nextInt();
		if(nuevo.mesasDelRestaurant[filaIngresada][columnaIngresada].isDisponibilidad()==true) {
			nuevo.mesasDelRestaurant[filaIngresada][columnaIngresada].setDisponibilidad(false);
			System.out.println("Comensal sentado arriba del pinocho");
		}else {
			System.out.println("No se sento una mierda");
		}
	}
	public static void consumoTotalMesa (Restaurant nuevo) {
		System.out.println("Ingrese la fila");
		int filaIngresada = teclado.nextInt();
		System.out.println("Ingrese la columna");
		int columnaIngresada = teclado.nextInt();
		if(nuevo.mesasDelRestaurant[filaIngresada][columnaIngresada] != null) {
			System.out.println("El consumo total de la mesa es : " + nuevo.mesasDelRestaurant[filaIngresada][columnaIngresada].getConsumoTotal());
		}else {
			System.out.println("Mesa sin consumo");
		}
	}
	
	public static void cerrarCajar (Restaurant nuevo) {
		double consumoTotal=0.0;
		for (int i = 0; i < nuevo.getMesasDelRestaurant().length; i++) {
			for (int j = 0; j < nuevo.getMesasDelRestaurant()[i].length; j++) {
				if(nuevo.getMesasDelRestaurant()[i][j]!=null) {
					consumoTotal += nuevo.getMesasDelRestaurant()[i][j].getConsumoTotal();
				}
			}
		}
		System.out.println("El dinero disponible en la caja es :  " + consumoTotal);
	}

	

}
