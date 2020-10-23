import java.util.Arrays;

public class Empresa {

	/*
	 * Identificar e incorporar los atributos necesarios.
	 */
	private String nombre;
	private Producto productosEnLaEmpresa[];
	private Venta ventas[];
	private Integer cantidadDeProductos;
	private Integer ventasRealizadas;

	public Empresa(String nombre) {
		/*
		 * Costructor de la clase.
		 */
		this.nombre = nombre;
		productosEnLaEmpresa = new Producto[100];
		ventas = new Venta[100];
		cantidadDeProductos = 0;
		ventasRealizadas = 0;
	}

	public String getNombre() {
		/*
		 * Devuelve el nombre de la empresa.
		 */
		return nombre;

	}

	public void agregarProducto(Producto nuevo) {
		/*
		 * Agrega un producto al catalogo
		 */
		for (int i = 0; i < productosEnLaEmpresa.length; i++) {
			if (productosEnLaEmpresa[i] == null) {
				productosEnLaEmpresa[i] = nuevo;
				cantidadDeProductos++;
				break;
			}
		}

	}

	public void realizarVenta(Venta nueva) {
		/*
		 * Registra una venta
		 */
		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i] == null) {
				ventas[i] = nueva;
				ventasRealizadas++;
				break;
			}
		}

	}

	public Producto getProductoPorNombre(String nombreDelProducto) {
		/*
		 * Busca y devuelve un producto basado en su nombre
		 */
		for (int i = 0; i < cantidadDeProductos; i++) {
			if (productosEnLaEmpresa[i].getDescripcion().equals(nombreDelProducto)) {
				return productosEnLaEmpresa[i];
			}
		}
		return null;
	}

	public double getImportePromedioDeVentas() {
		/*
		 * Busca y devuelve un producto basado en su nombre
		 */
		Double importeTotal = 0.0;
		for (int i = 0; i < ventasRealizadas; i++) {
			if (ventas[i] != null) {
				importeTotal += ventas[i].getImporteTotal();
			}
		}
		return (importeTotal / ventasRealizadas);

	}

	public void ordenarLosProductosPorCodigo() {
		/*
		 * Ordena el catalogo de productos por codigo
		 */
		Producto aux = null;
		for (int i = 0; i < productosEnLaEmpresa.length - 1; i++) {
			for (int j = 0; j < productosEnLaEmpresa.length - 1; j++) {
				if (productosEnLaEmpresa[j] != null && productosEnLaEmpresa[j + 1] != null) {
					if (productosEnLaEmpresa[j].getCodigo() > productosEnLaEmpresa[j + 1].getCodigo()) {
						aux = productosEnLaEmpresa[j + 1];
						productosEnLaEmpresa[j + 1] = productosEnLaEmpresa[j];
						productosEnLaEmpresa[j + 1] = aux;
					}
				}

			}
		}

	}

	@Override
	public String toString() {
		return "Empresa [productosEnLaEmpresa=" + Arrays.toString(productosEnLaEmpresa) + "]";
	}
}
