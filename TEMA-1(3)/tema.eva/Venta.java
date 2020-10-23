
public class Venta {
	/*
	 * Identificar e incorporar los atributos necesarios.
	 */
	private Integer dni;
	private String nombreDelCliente;
	private Producto itemsEnLaVenta[];
	private Double precioTotal;
	private Integer productosEnElChangito;

	public Venta(Integer dni, String nombreDelCliente) {
		/*
		 * Costructor de la clase.
		 */
		this.itemsEnLaVenta = new Producto[100];
		this.dni = dni;
		this.nombreDelCliente = nombreDelCliente;
		precioTotal = 0.0;
		productosEnElChangito = 0;
	}

	public int getDni() {
		/*
		 * Devuelve el dni del cliente.
		 */
		return dni;
	}

	public String getNombrDelCliente() {
		/*
		 * Devuelve el dni del cliente.
		 */
		return nombreDelCliente;
	}

	public void agregarItem(Producto producto) {
		/*
		 * Agrega un producto a la venta
		 */
		for (int i = 0; i < itemsEnLaVenta.length; i++) {
			if (itemsEnLaVenta[i] == null) {
				itemsEnLaVenta[i] = producto;
				precioTotal += itemsEnLaVenta[i].getPrecio();
				productosEnElChangito++;
				break;
			}
		}
	}

	public int getCantidadDeProductosComprados() {
		/*
		 * Devuelve la cantidad de proctos comprados
		 */
		return productosEnElChangito;
	}

	public double getImporteTotal() {
		/*
		 * Importe total de la venta o sumatoria del precio del producto
		 */
		
		return precioTotal;
	}

	@Override
	public String toString() {
		return "Venta [nombreDelCliente=" + nombreDelCliente + ", precioTotal=" + precioTotal + "]";
	}

}
