package hola;

import java.util.ArrayList;
import java.util.HashSet;

public class Empresa {

	private String nombre;
	private HashSet<Avion> aviones;
	private HashSet<Vuelo> vuelos;
	private HashSet<Pasajero> pasajeros;
	private HashSet<AsignacionAsciento> asignacionesAsientos;

	public Empresa(String nombre) {

		this.nombre = nombre;
		this.aviones = new HashSet<Avion>();
		this.vuelos = new HashSet<Vuelo>();
		this.pasajeros = new HashSet<Pasajero>();
		this.asignacionesAsientos = new HashSet<AsignacionAsciento>();

	}

	public Boolean registrarAvion(Avion avion) {
		if (avion != null)
			return this.aviones.add(avion);

		return false;
	}

	public Boolean regitrarVuelo(Vuelo vuelo) {
		if (vuelo != null)
			return this.vuelos.add(vuelo);

		return false;
	}

	public Boolean RegistarPasajero(Pasajero pasajero) {
		if (pasajero != null)
			return this.pasajeros.add(pasajero);
		return false;
	}

	public Pasajero buscarPasajero(Integer dni) {
		for (Pasajero pasajero : this.pasajeros) {
			if (pasajero.getDni().equals(dni))
				return pasajero;
		}

		return null;
	}

	public Vuelo buscarVuelo(Integer idVuelo) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getId().equals(idVuelo))
				return vuelo;
		}
		return null;
	}

	public Boolean asignarPasajeroAUnVuelo(Integer idVuelo, Integer dni) {
		Vuelo vueloAAsignarPasajero = buscarVuelo(idVuelo);
		if (vueloAAsignarPasajero != null)
			return vueloAAsignarPasajero.getPasajeros().add(buscarPasajero(dni));
		return false;
	}

	public Avion buscarAvion(Integer idAvion) {
		for (Avion avionAEncontrar : aviones) {
			if (avionAEncontrar.getId().equals(idAvion))
				return avionAEncontrar;

		}

		return null;
	}

	public Boolean verificarSiExisteUnAsientoEnUnAvion(Integer idAvion, String asciento) {
		Avion avion = buscarAvion(idAvion);
		if(avion.getListaAscientos().contains(asciento))
			return true;

		return false;
	}

	public Boolean verificarAsientoDiponibleParaUnVuelo(Integer idVuelo, String asciento) {
		Avion avion = buscarVuelo(idVuelo).getAvion();
		
		return avion.getListaAscientos().contains(asciento);
	}

	public Boolean asignarAsientoPasajeroParaUnVuelo(Integer idVuelo, Integer dni, String numeroAciento) {
		Pasajero pasajeroASentar =  this.buscarPasajero(dni);
		if(this.verificarAsientoDiponibleParaUnVuelo(idVuelo, numeroAciento)) {
			if(buscarVuelo(idVuelo).getAvion().getListaAscientos().add(numeroAciento)) {
			AsignacionAsciento pasajeroAsignadoAVuelo = new AsignacionAsciento(idVuelo, buscarVuelo(idVuelo), pasajeroASentar, numeroAciento);
				
				return this.asignacionesAsientos.add(pasajeroAsignadoAVuelo);
			}
		}
		return false;
	}

	public HashSet<String>obtenerListaDeascientoDeUnAvion(Integer idAvion) {
		Avion avion = buscarAvion(idAvion);
		HashSet<String> listaDeAscientos = new HashSet<String>();
		listaDeAscientos.addAll(avion.getListaAscientos());
		return listaDeAscientos;
		
	}

	public HashSet<String> obtenerListaDeAscientoOcupadosDeUnVuelo(Integer idVuelo) {
		HashSet<String> totalAscientosOcupados = new HashSet<String>() ;
		
		for (AsignacionAsciento asignado : this.asignacionesAsientos) {
			if(asignado.getVuelo().getId() == idVuelo)
			totalAscientosOcupados.add(asignado.getAsciento());
//			ver el tema del id vuelo 
		}
		
		return totalAscientosOcupados;
	}

	public HashSet<String> obtenerListaDeAscientoDisponibleDeUnVuelo(Integer idVuelo) {
		Vuelo vueloARevisar = this.buscarVuelo(idVuelo);
		
		HashSet<String> totalAsientosDisponibles = new HashSet<String>();
		totalAsientosDisponibles.addAll(vueloARevisar.getAvion().getListaAscientos());

		
		return totalAsientosDisponibles;
	}

	public Boolean cambiarAscientoDeUnPasajeroParaUnVuelo(Integer idVuelo, Integer dni, String nuevoAsciento) {
				
		for (AsignacionAsciento asignacionAsciento : asignacionesAsientos) {
			if(asignacionAsciento.getId().equals(idVuelo)){
				asignacionesAsientos.remove(asignacionAsciento);
				if(this.verificarAsientoDiponibleParaUnVuelo(idVuelo, nuevoAsciento)) {
					if(buscarPasajero(dni)!=null) {
					AsignacionAsciento pasajeroAsignadoAVuelo = new AsignacionAsciento(idVuelo, buscarVuelo(idVuelo), buscarPasajero(dni), nuevoAsciento);
					
					return this.asignacionesAsientos.add(pasajeroAsignadoAVuelo);
					}
				}
			}
		}
		
		
		
		return false;
	}

}
