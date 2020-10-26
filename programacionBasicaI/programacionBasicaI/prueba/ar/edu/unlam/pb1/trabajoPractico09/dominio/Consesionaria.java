package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Arrays;

public class Consesionaria {
	private String nombre;
	private Coche flota[];
	private final int CANTIDAD_DE_COCHES_MAXIMA;
	private int cantidadDeCochesIngresados;
	
	public Consesionaria(String nombre , int CANTIDAD_DE_COCHES_MAXIMA) {
		this.nombre = nombre;
		this.CANTIDAD_DE_COCHES_MAXIMA = CANTIDAD_DE_COCHES_MAXIMA;
		flota = new Coche[CANTIDAD_DE_COCHES_MAXIMA];
		cantidadDeCochesIngresados=0;
	}

	public boolean agregarCoche(Coche nuevo){
		for (int i = 0; i < flota.length; i++) {
			if (flota[i] == null) {
				flota[i]=nuevo;
				cantidadDeCochesIngresados++;
				return true;
			}
		}
		return false;
	}
	
	public Coche buscarCoche(String modelo , double kilometraje) {
		for (int i = 0; i < cantidadDeCochesIngresados; i++) {
			if (flota[i].getModelo().equals(modelo) && flota[i].getKilometros() == kilometraje) {
				return flota[i];
			}
		}
		return null;
	}
	
	public void listarCoches() {
		Coche aux=null;
		for (int i = 1; i < cantidadDeCochesIngresados; i++) {
			for (int j = 0; j < cantidadDeCochesIngresados-1; j++) {
				if (flota[j].getKilometros()>flota[j+1].getKilometros()) {
					aux = flota[j+1];
					flota[j+1] = flota[j];
					flota[j]=aux;
				}
			}
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Coche[] getFlota() {
		return flota;
	}

	public void setFlota(Coche[] flota) {
		this.flota = flota;
	}

	public int getCantidadDeCochesIngresados() {
		return cantidadDeCochesIngresados;
	}

	public void setCantidadDeCochesIngresados(int cantidadDeCochesIngresados) {
		this.cantidadDeCochesIngresados = cantidadDeCochesIngresados;
	}

	public int getCANTIDAD_DE_COCHES_MAXIMA() {
		return CANTIDAD_DE_COCHES_MAXIMA;
	}

	@Override
	public String toString() {
		String listado ="";
		for (int i = 0; i < flota.length; i++) {
			if (flota[i]!=null) {
				listado += flota[i].getMarca()+" "+flota[i].getModelo()+" "+flota[i].getKilometros()+"\n";
			}
		}
		return listado;
	}
	
	
}
