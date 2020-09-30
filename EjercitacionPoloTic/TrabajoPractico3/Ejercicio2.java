package TrabajoPractico3;
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero limite");
		int numero = teclado.nextInt();
		for (int i = 1; i < numero+1; i++) {
			System.out.println(i);
		}
	}
}
