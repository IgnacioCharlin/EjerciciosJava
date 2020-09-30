package TrabajoPractico3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Ejercicio8 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Persona> censo = new ArrayList<Persona>();
		int documento = 0, edad , cantidadHombres=0 , cantidadMujeres=0,hombreEntre16y65 =0 , edadMaxima=0;
		Persona personaMasGrande = null;
		String sexo;
		do {
			System.out.println("Ingresa dni");
			documento = teclado.nextInt();
			if (documento != 0) {
				System.out.println("Ingresa edad");
				edad = teclado.nextInt();
				System.out.println("Ingresa sexo");
				sexo = teclado.next();
				if (sexo !="m" || sexo != "f") {
					censo.add(new Persona(documento, edad, sexo));
				}
			}
		} while (documento != 0);
		for (Persona persona : censo) {
			if (persona.getSexo().equals("m")) {
				cantidadHombres++;
			}else {
				cantidadMujeres++;
			}
		}
		
		for (Persona persona : censo) {
			if (persona.getSexo().equals("m") && persona.getEdad()>16 && persona.getEdad()<65) {
				hombreEntre16y65++;
			}
		}
		for (int i = 0; i < censo.size(); i++) {
			if (censo.get(i).getEdad() > edadMaxima) {
				edadMaxima = censo.get(i).getEdad();
				personaMasGrande = censo.get(i);
			}
		}
		System.out.println("Cantidad de personas censadas " + censo.size());
		System.out.println("Cantidad de hombres: " +cantidadHombres);
		System.out.println("Cantidad de mujeres: "+ cantidadMujeres);
		System.out.println("Porcentaje de hombres entre 16 y 65 años " + ((hombreEntre16y65*100)/cantidadHombres) + "%");
		System.out.println("documento : "+ personaMasGrande.getDocumento() + " edad "+ personaMasGrande.getEdad() + " sexo " +personaMasGrande.getSexo());
	}

}
