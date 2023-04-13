import java.util.ArrayList;

public class Tablet extends Producto {
	private String resolucion;
	private ArrayList<String> accesorios;

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public ArrayList<String> getAccesorios() {
		throw new UnsupportedOperationException();
	}

	public void setAccesorios(ArrayList<String> accesorios) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		return "TABLET";
	}

	public Tablet(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int stock, String resolucion, ArrayList<String> accesorios) {
		super(marca, memoriaRAM, almacenamiento, procesador, modelo, anhoFabricacion, precio, stock);
		this.resolucion = resolucion;
		this.accesorios = new ArrayList<>();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}