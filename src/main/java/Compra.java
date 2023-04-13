import java.util.ArrayList;

public class Compra {
	private String fechaCompra;
	private ArrayList<Producto> productos;
	public Cliente cliente;

	public Compra(String fechaCompra, Cliente cliente) {
		this.fechaCompra = fechaCompra;
		this.cliente = cliente;
		this.productos = new ArrayList<>();
	}

	public String getFechaCompra() {
		return this.fechaCompra;
	}
	public Cliente getCliente(){
		return this.cliente;
	}
	public ArrayList<Producto> getProductos(){
		return this.productos;
	}
	@Override
	public String toString() {
		throw new UnsupportedOperationException();
	}
}