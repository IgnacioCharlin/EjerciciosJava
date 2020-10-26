package ar.edu.unlam.pb1.trabajoPractico11.prueba;

import jdk.nashorn.api.tree.ImportEntryTree;

public class Restaurant {
	private Mozo mozos[];
	private Comensal comensales[];
	private Comensal mesas[][];
	private String nombreDelResto;
	private Pedido pedidos[];
	private Plato platos[];
	private final int CAPACIDAD_DE_MESA = 4;
	private final int FILAS_DE_MESAS=5;
	private final int COLUMNAS_DE_MESAS=5;
	private int cantidadDeComensalesAgregados;
	private int cantidadDeMozosIngresados;
	private double importeDelResto;
	
	public Restaurant(String nombreDelResto , int capacidadMaxima) {
		super();
		this.nombreDelResto = nombreDelResto;
		comensales = new Comensal[capacidadMaxima];
		mozos = new Mozo[5];
		platos = new Plato[10];
		mesas = new Comensal[FILAS_DE_MESAS][COLUMNAS_DE_MESAS];
		pedidos = new Pedido[10];
		cantidadDeComensalesAgregados=0;
		cantidadDeMozosIngresados=0;
		importeDelResto=0.0;
	}
	
	public boolean agregarMozo(Mozo nuevo) {
		for (int i = 0; i < mozos.length; i++) {
			if (mozos[i]==null) {
				mozos[i]=nuevo;
				cantidadDeMozosIngresados++;
				return true;
			}
		}
		return false;
	}
	
	public void agregarComensal(Comensal nuevo , int fila , int columna) {
		mesas[fila][columna]=nuevo;
	}
	
	public Comensal buscarMesa(int dni) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j]!=null && mesas[i][j].getDni()== dni) {
					return mesas[i][j];
				}
			}
		}
		return null;
	}
	
	public Comensal[][] getMesas() {
		return mesas;
	}

	public double cerrarMesa (int fila , int columna, Pedido actual) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j] != null && mesas[i][j].getDni() == actual.getMesa().getDni()) {
					importeDelResto+=actual.getPrecioTotalDelPedido();
					return actual.getPrecioTotalDelPedido();
				}
			}
		}
		return 0.0;
	}
	
	public int mesasDisponibles() {
		int mesasDisponibles=0;
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j]==null) {
					mesasDisponibles++;
				}
			}
		}
		return mesasDisponibles;
	}
	
	public double cerrarCaja() {
		return importeDelResto;
	}
	
	public void agregarPlatos(Plato nuevo) {
		for (int i = 0; i < platos.length; i++) {
			if (platos[i]==null) {
				platos[i]=nuevo;
				break;
			}
		}
	}
	
	public String listadoDePlatos() {
		String listadoDePlatos = "";
		for (int i = 0; i < platos.length; i++) {
			if (platos[i]!=null) {
				listadoDePlatos+=(i+1) +"- "+platos[i].getDescipcionDelPlato()+" $"+ platos[i].getPrecio() +"\n";
			}
		}
		return listadoDePlatos;
	}
	
	public void ordenarMozosPorDni() {
		Mozo aux =null;
		for (int i = 1; i < cantidadDeMozosIngresados; i++) {
			for (int j = 0; j < cantidadDeMozosIngresados-1; j++) {
				if (mozos[j].getDni()>mozos[j+1].getDni()) {
					aux=mozos[j+1];
					mozos[j+1]=mozos[j];
					mozos[j]=aux;
				}
			}
		}
	}
	
	public String listadoDeMozos() {
		String listadoDeMozos="";
		for (int i = 0; i < mozos.length; i++) {
			if (mozos[i]!=null) {
				listadoDeMozos+=(i+1)+" "+mozos[i].getNombre()+" "+mozos[i].getDni()+"\n";
			}
		}
		return listadoDeMozos;
	}
	
	public Plato[] getPlatos() {
		return platos;
	}

	public boolean agregarPedido(Pedido nuevo) {
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] == null) {
				pedidos[i] = nuevo;
				return true;
			}
		}
		return false;
	}
}
