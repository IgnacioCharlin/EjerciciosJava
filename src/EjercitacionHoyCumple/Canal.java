package EjercitacionHoyCumple;



public class Canal {

	private String nombre;
	private Programa programacion[];
	private int cantidadDeProgramasActual;
	
	
	// Complete el siguiente constructor
	public Canal(String nombre, int cantidadDeprogramas) {
		this.nombre = nombre;
		programacion = new Programa[cantidadDeprogramas];
		this.cantidadDeProgramasActual = 0;
	}


	public boolean agregarPrograma(Programa programa) {
		// Para poder agregar los programas se debe cumplir con las sigueintes reglas
		// Los nombres de los programas deben comenzar con #(numeral)
		// deben contener almenos 2 actores
		for (int i = 0; i < programacion.length; i++) {
			if(programacion[i]== null && programa.getNombre().charAt(0)=='#'&& programa.getCantidadDeActores()>2) {
				programacion[i]= programa;
				cantidadDeProgramasActual++;
				return true;
			}
		}
		return false;
	}

	public double obtenerLaDuracionPromedioDeTodosLosProgramas() {
		double promedio = 0.0;
		//Obtiene la duracion promedio de todos los porgrmas del canal
		for (int i = 0; i < cantidadDeProgramasActual; i++) {
			promedio += programacion[i].getDuracion();
		}
		promedio=(promedio/cantidadDeProgramasActual);
		return promedio;
	}

	public void incrementarCantidadDeActores(String codigoDePrograma, int cantidadDeActoresAIncrementar) {
		
		//Dado el codigo de programa incremta la cantidad de actores
		for (int i = 0; i < cantidadDeProgramasActual; i++) {
			if(programacion[i].getNombre().equals(codigoDePrograma)) {
				int actoresIncrementados = 0;
				actoresIncrementados = programacion[i].getCantidadDeActores()+cantidadDeActoresAIncrementar;
				programacion[i].setCantidadDeActores(actoresIncrementados);
			}
		}
		
		
	}
	
	public String toString() {
		String lista = "";
		for (int i = 0; i < cantidadDeProgramasActual; i++) {
			lista = programacion[i].getNombre()+" "+programacion[i].getCantidadDeActores()+" "+programacion[i].getDuracion()+"\n";
		}
		return lista;
	}

}
