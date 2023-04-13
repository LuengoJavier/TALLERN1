public class Notebook extends Producto {
	private String resolucion;
	private String tipoTeclado;
	private int bateria;

	public String getResolucion() {
		return this.resolucion;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public String getTipo() {
		return "NOTEBOOK";
	}

	public Notebook(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int stock, String resolucion, int bateria, String tipoTeclado) {
		super(marca, memoriaRAM, almacenamiento, procesador, modelo, anhoFabricacion, precio, stock);
		this.bateria = bateria;
		this.resolucion = resolucion;
		this.tipoTeclado = tipoTeclado;
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}