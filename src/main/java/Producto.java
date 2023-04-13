public abstract class Producto {
	private String marca;
	private int memoriaRAM;
	private int almacenamiento;
	private String procesador;
	private String modelo;
	private int anhoFabricacion;
	private int precio;
	private int stock;

	public Producto(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int stock) {
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.anhoFabricacion = anhoFabricacion;
		this.precio = precio;
		this.stock = stock;
	}

	public String getMarca() {
		return this.marca;
	}

	public int getMemoriaRAM() {
		return this.memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getAlmacenamiento() {
		return this.almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAnhoFabricacion() {
		return this.anhoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}



	public abstract String getTipo();
}