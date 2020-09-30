package TrabajoPractico3;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dni");
		int dni = teclado.nextInt();
		System.out.println("Ingrese servicio");
		int numeroDeServicio = teclado.nextInt();
		int montoAPagar = 0;
		switch (numeroDeServicio) {
		case 1:
			montoAPagar= 750;
			System.out.println(dni + " monto a pagar : " + montoAPagar + " Internet 30 Megas");
			break;
		case 2:
			montoAPagar= 1100;
			System.out.println(dni + " monto a pagar : " + montoAPagar + " Internet 50 Megas");
			break;
		case 3:
			montoAPagar=(int) (1500-(1500*0.05));
			System.out.println(dni + " monto a pagar : " + montoAPagar + " Internet 100 Megas");
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
	}
}
