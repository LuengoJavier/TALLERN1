import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private ArrayList<Producto> productos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Compra> compras;

	public Tienda(String direccion) {
		this.direccion = direccion;
		this.clientes = new ArrayList<>();
		this.compras = new ArrayList<>();
		this.productos = new ArrayList<>();
	}
	public ArrayList<Producto> getProductos(){
		return this.productos;
	}

	public ArrayList<Cliente> getClientes(){
		return this.clientes;
	}
	public ArrayList<Compra> getCompras(){
		return this.compras;
	}

	public String getDireccion() {
		return this.direccion;
	}
}