package ar.edu.unlam.montacargas;

import java.util.ArrayList;

public class Montacarga {
	private Double pesoDescargado = 0.0;
	private Double descargas = 0.0;
	private Double pesoMaximo;
	private ArrayList<Carga> cargas;

	public Montacarga(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
		cargas = new ArrayList<Carga>();
	}

	public Boolean cargar(Carga carga) {
		Boolean sePudo = false;
		if (obtenerCarga() + carga.getPeso() <= pesoMaximo) {
			sePudo = cargas.add(carga);
		}
		return sePudo;
	}

	public Double obtenerCarga() {
		Double cargaTotal = 0.0;
		for (Carga carga : cargas) {
			cargaTotal += carga.getPeso();
		}
		return cargaTotal;
	}

	public Boolean descargar() {
		Boolean seDescargo = false;
		if (obtenerCarga()!= 0.0) {
			pesoDescargado += obtenerCarga();
			descargas++;
			cargas.clear();
			seDescargo = true;
		}
		return seDescargo;
	}

	public Double obtenerCargaPromedio() {
		Double cargasPromedio = 0.0;
		return cargasPromedio = (pesoDescargado / descargas);
	}

}
