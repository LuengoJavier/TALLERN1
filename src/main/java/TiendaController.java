import java.util.ArrayList;

public class TiendaController {
	private ArrayList<Tienda> tienda = new ArrayList<Tienda>();

	public Tienda agregarTienda(Tienda tienda) {
		this.tienda.add(tienda);
		return tienda;
	}

	public Producto agregarProducto(Producto producto, Tienda tienda) {
		if (buscarProducto(producto) != null){
			tienda.getProductos().add(producto);
		}
		return producto;
	}

	public Cliente agregarCliente(Cliente cliente, Tienda tienda) {
		if (buscarCliente(cliente) != null){
			tienda.getClientes().add(cliente);
		}
		return cliente;
	}

	public Cliente buscarCliente(Cliente cliente, Tienda tienda) {
		for (Cliente cliente1 : tienda.getClientes()){
			if (cliente1.equals(cliente)){
				return cliente;
			}
		}
		return null;
	}

	public Producto buscarProducto(Producto producto, Tienda tienda) {
		for (Producto producto1 : tienda.getProductos()){
			if (producto1.equals(producto)){
				return producto;
			}
		}
		return null;
	}

	public Producto buscarProductoMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	public Producto buscarProductoModelo(String modelo) {
		throw new UnsupportedOperationException();
	}

	public Producto buscarProductoTipo(String tipo) {
		throw new UnsupportedOperationException();
	}

	public Producto agregarProductoCompra(Producto producto, Compra compra) {
		compra.getProductos().add(producto);
		return producto;

	}

	public void eliminarProductoCompra(Producto producto, Compra compra) {
		throw new UnsupportedOperationException();
	}

	public boolean realizarCompra(Compra compra) {
		throw new UnsupportedOperationException();
	}

	public Compra agregarCompra(Compra compra, Tienda tienda) {
		tienda.getCompras().add(compra);
		return compra;
	}

	public void mostrarCompra(Compra conpra) {
		throw new UnsupportedOperationException();
	}
}