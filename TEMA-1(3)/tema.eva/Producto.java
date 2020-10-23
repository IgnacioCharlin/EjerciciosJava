

public class Producto {
	/*
	 * Identificar e incorporar los atributos necesarios.
	 */
	private Integer codigo;
	private String descripcion;
	private Double precio;
	
	public Producto(Integer codigo, String descripcion, Double precio) {
		/*
		 * Costructor de la clase.
		 */
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.precio=precio;
	}

	public int getCodigo() {
		/*
		 * Devuelve el codigo del producto.
		 */
		return codigo;
	}

	public String getDescripcion() {
		/*
		 * Devuelve la descripcion del producto.
		 */
		return descripcion;
	}

	public Double getPrecio() {
		/*
		 * Devuelve el precio del producto.
		 */
		return precio;
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}	
}
