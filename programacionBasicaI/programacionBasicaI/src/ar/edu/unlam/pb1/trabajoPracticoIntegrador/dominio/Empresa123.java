package ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio;

public class Empresa123 {
	
	private Operario12 operarios[];
	//private int cantidadDiasLaborables;
	
	public Empresa123(int cantidadOperarios, int cantidadDiasLaborables) {
		operarios = new Operario12[cantidadOperarios];
		//this.cantidadDiasLaborables = cantidadDiasLaborables; 
	}
	
	public void nuevoOperario(Operario12 nuevoOperario) {			
			operarios[Operario12.getCantidadOperarios()-1] = nuevoOperario;
	}
	
	public Operario12 buscarOperarioConMayorAntiguedad(String fechaActual) {
		int mayorAntiguedad=0, posicionMayorAntiguedad=0;
		
		for(int i = 0; i<Operario12.getCantidadOperarios(); i++) {
			if(operarios[i].calcularAntiguedad(fechaActual)>mayorAntiguedad) {
				mayorAntiguedad = operarios[i].calcularAntiguedad(fechaActual);
				posicionMayorAntiguedad = i;
			}
		}
		
		return operarios[posicionMayorAntiguedad];
	}
	
	public int calcularHorasDeTrabajoPromedio() {
		int sumatoriaHoras = 0;
		
		for(int i=0; i<Operario12.getCantidadOperarios(); i++) {
			sumatoriaHoras+=operarios[i].calcularHorasTrabajadas();
		}
		
		return sumatoriaHoras/Operario12.getCantidadOperarios();
	}
}
