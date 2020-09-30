package TrabajoPractico3;

import java.util.Scanner;

public class Ejercicio7 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Socios club[] = new Socios[3];
		for (int i = 0; i < club.length; i++) {
			System.out.println("Ingrese numero de socio");
			int numeroDeSocio = teclado.nextInt();
			System.out.println("Ingrese edad");
			int edad = teclado.nextInt();
			System.out.println("Ingrese deporte");
			int deporte = teclado.nextInt();
			club[i] = new Socios(numeroDeSocio, edad, deporte);
		}
		int tipo1=0, tipo2=0, tipo3=0,tipo4=0, tipo5=0;
		int edad1=0 ,edad2=0 ,edad3=0 ,edad4=0 ,edad5=0; 
		for (int i = 0; i < club.length; i++) {
			switch (club[i].getTipoDeDeporte()) {
			case 1:
				edad1 += club[i].getEdad();
				tipo1++;
				break;
			case 2:
				edad2 += club[i].getEdad();
				tipo2++;
				break;
			case 3:
				edad3 += club[i].getEdad();
				tipo3++;
				break;
			case 4:
				edad4 += club[i].getEdad();
				tipo4++;
				break;
			case 5:
				edad5 += club[i].getEdad();
				tipo5++;
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
		System.out.println("Los que practican tenis son " + tipo1);
		System.out.println("Los que practican futbol son " +tipo5);
		if (tipo1!=0) {
			System.out.println("Edad promedio de los que practican tennis son :" + (edad1/tipo1));
		}
		if (tipo2!=0) {
			System.out.println("Edad promedio de los que practican rugby son :" + (edad2/tipo2));
		}
		if (tipo3!=0) {
			System.out.println("Edad promedio de los que practican voley son :" + (edad3/tipo3));
		}
		if (tipo4!=0) {
			System.out.println("Edad promedio de los que practican voley son :" + (edad4/tipo4));
		}
		if (tipo5!=0) {
			System.out.println("Edad promedio de los que practican voley son :" + (edad5/tipo5));
		}
		
	}

}
