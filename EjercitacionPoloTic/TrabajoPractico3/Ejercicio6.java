package TrabajoPractico3;

import java.util.Scanner;

public class Ejercicio6 {
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Coche carrera[] = new Coche[12];
		for (int i = 0; i < carrera.length; i++) {
			System.out.print("Ingresar numero de coche: ");
			int numeroDeCoche = teclado.nextInt();
			System.out.print("Tiempo marcado : ");
			double tiempo = teclado.nextDouble();
			carrera[i] = new Coche(numeroDeCoche, tiempo);
		}
		double tiempoMasRapido = 0.0;
		int numeroDelAuto=0;
		for (int i = 0; i < carrera.length; i++) {
			tiempoMasRapido = carrera[i].getTiempo();
			numeroDelAuto = carrera[i].getNumeroDeCoche();
			if (tiempoMasRapido > carrera[i].getTiempo()) {
				tiempoMasRapido = carrera[i].getTiempo();
				numeroDelAuto = carrera[i].getNumeroDeCoche();
			}
		}
		System.out.println(numeroDelAuto + " " + tiempoMasRapido);
	}
}
