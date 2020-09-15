package Restaurant;
import java.util.Scanner;
public class pruebaFor {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int matriz[] =  new int [4];
		for (int i : matriz) {
			i = teclado.nextInt();
		}
		for (int i : matriz) {
			System.out.println(i);
		}

	}

}
