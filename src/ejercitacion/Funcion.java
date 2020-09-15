package ejercitacion;



public class Funcion {
	
	private String diaYHora;
	private String pelicula;
	private int aptaParaMayoresDe;
	private Sala sala;
	private Espectador reservas[];
	
	public Funcion(String diaYHora, String pelicula, int aptaParaMayoresDe, Sala sala) {
		this.diaYHora = diaYHora;
		this.pelicula = pelicula;
		this.aptaParaMayoresDe = aptaParaMayoresDe;
		this.sala = sala;
		reservas = new Espectador[500];
	}

	public boolean reservar(Espectador nuevo) {
		boolean sePuede = false;
		if(nuevo.getEdad()> aptaParaMayoresDe) {
			for (int i = 0; i < reservas.length; i++) {
				if(reservas[i] == null) {
					reservas[i] = nuevo;
					sePuede = true;
				}
			}
			
		}
		return sePuede;
		/*
		 * Realiza una reserva para la función (siempre que el espectador esté habilitado por su edad)
		 * 
		 */		
		
	}
	
	public Espectador buscarReserva(int dni) {
		for (int i = 0; i < reservas.length; i++) {
			if (reservas[i]!= null) {
				if (dni == reservas[i].getDni()) {
					return reservas[i];
				}
			}
		}
		return null;
	}
	
	public Espectador[] getReservas() {
		return reservas;
	}
	
	public String getPelicula() {
		return pelicula;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
