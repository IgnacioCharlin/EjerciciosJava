package asignacionascientos;

import java.util.HashSet;

public class Empresa {

	private String nombre;
	private HashSet<String> ascientosOcupados = new HashSet();
	private HashSet<Vuelo> vuelos;
	private HashSet<Pasajero> pasajeros;
	private HashSet<AsignacionAsiento> asignacionesAsientos;
	private HashSet<Avion> aviones;

	public Empresa(String nombre) {

		this.nombre = nombre;
		this.vuelos = new HashSet<Vuelo>();
		this.pasajeros = new HashSet<Pasajero>();
		this.asignacionesAsientos = new HashSet<AsignacionAsiento>();
		this.aviones = new HashSet<Avion>();

	}

	public Boolean registrarAvion(Avion avion) {
		return aviones.add(avion);
	}

	public Boolean regitrarVuelo(Vuelo vuelo) {
		return vuelos.add(vuelo);
	}

	public Boolean RegistarPasajero(Pasajero pasajero) {
		return pasajeros.add(pasajero);
	}

	public Boolean asignarPasajeroAUnVuelo(Integer idVuelo, Integer dni) {
		Pasajero pasajeroParaElVuelo = null;
		for (Pasajero pasajeroAsignado : pasajeros) {
			if (pasajeroAsignado.getDni().equals(dni)) {
				pasajeroParaElVuelo = pasajeroAsignado;
			}
		}
		for (Vuelo vueloAsignado : vuelos) {
			if (vueloAsignado.getId().equals(idVuelo)) {
				if (vueloAsignado.agregarPasajeroAVuelo(pasajeroParaElVuelo).equals(true)) {
					return true;
				}
			}
		}
		return false;
	}

	public Boolean verificarSiExisteUnAsientoEnUnAvion(Integer idAvion, String asciento) {
		for (Avion avionAsignado : aviones) {
			if (avionAsignado.getId().equals(idAvion)) {
				for (int i = 0; i < aviones.size(); i++) {
					if (avionAsignado.getListaAscientos().get(i) != null) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public Boolean verificarAsientoDiponibleParaUnVuelo(Integer idVuelo, String asciento) {
		for (Vuelo vueloAsignado : vuelos) {
			if (vueloAsignado.getId().equals(idVuelo)) {
				Avion avionAsignado = vueloAsignado.getAvion();
				if (avionAsignado.getListaAscientos().contains(asciento)) {
					return true;
				}
			}
		}
		return false;

	}

	public Boolean asignarAsientoPasajeroParaUnVuelo(Integer idVuelo, Integer dni, String numeroAciento) {
		Vuelo vueloAAsignar = null;
		Pasajero pasajeroASentar = null;
		Avion avionAsignado = null;
		for (Vuelo vueloAsignado : vuelos) {
			if (vueloAsignado.getId().equals(idVuelo)) {
				vueloAAsignar = vueloAsignado;
				avionAsignado = vueloAsignado.getAvion();
			}
		}
		for (Pasajero pasajeroAsignado : pasajeros) {
			if (pasajeroAsignado.getDni().equals(dni)) {
				pasajeroASentar = pasajeroAsignado;
			}
		}
		if (avionAsignado.getListaAscientos().contains(numeroAciento)) {
			Integer id = (int) Math.random();
			AsignacionAsiento asignarPasajero = new AsignacionAsiento(id, vueloAAsignar, pasajeroASentar,
					numeroAciento);
			ascientosOcupados.add(numeroAciento);
			asignacionesAsientos.add(asignarPasajero);
			avionAsignado.getListaAscientos().remove(numeroAciento);
			return true;
		}
		return false;
	}

	public HashSet<String> obtenerListaDeAsientoDeUnAvion(Integer idAvion) {
		HashSet<String> listadoDeAscientos = new HashSet<String>();
		for (Avion avionAsignado : aviones) {
			if (avionAsignado.getId().equals(idAvion)) {
				listadoDeAscientos.addAll(avionAsignado.getListaAscientos());
				return listadoDeAscientos;
			}
		}	
		return null;
	}

	public HashSet<String> obtenerListaDeAsientoOcupadosDeUnVuelo(Integer IdVuelo) {
		for (Vuelo vueloAsignado : vuelos) {
			if (vueloAsignado.getId().equals(IdVuelo)) {
				return ascientosOcupados;
			}
		}	
		return null;
	}

	public HashSet<String> obtenerListaDeAsientoDisponibleDeUnVuelo(Integer IdVuelo) {
		HashSet<String> ascientosVacios = new HashSet<>();
		for (Vuelo vueloAsignado : vuelos) {
			if (vueloAsignado.getId().equals(IdVuelo)) {
				ascientosVacios.addAll(vueloAsignado.getAvion().getListaAscientos());
				return ascientosVacios;
			}
		}	
		return null;
	}

	public Boolean cambiarAsientoDeUnPasajeroParaUnVuelo(Integer idVuelo, Integer dni, String nuevoAsciento) {
		Avion avionAsignado = null;
		for (Vuelo vueloAsignado : vuelos) {
			if (vueloAsignado.getId().equals(idVuelo)) {
				avionAsignado = vueloAsignado.getAvion();
			}
		}	
		for (AsignacionAsiento ascientoAsignado : asignacionesAsientos) {
			if (ascientoAsignado.getPasajero().getDni().equals(dni) && ascientoAsignado.getVuelo().getAvion().equals(avionAsignado)) {
				ascientoAsignado.setAsciento(nuevoAsciento);
				return true;
			}
		}
		return false;
	}

}
