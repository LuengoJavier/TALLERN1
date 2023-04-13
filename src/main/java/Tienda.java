import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Compra> compras = new ArrayList<Compra>();

	public Tienda(String direccion) {
		throw new UnsupportedOperationException();
	}

	public String getDireccion() {
		return this.direccion;
	}
}