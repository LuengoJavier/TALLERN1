public class Computador extends Producto {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public Computador(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int stock, String tajetaVideo, String fuentePoder, String chasis, Pantalla pantallla) {
		super(marca, memoriaRAM, almacenamiento, procesador, modelo, anhoFabricacion, precio, stock);
		this.chasis = chasis;
		this.fuentePoder = fuentePoder;
		this.tarjetaVideo = tajetaVideo;
		this.pantalla = pantallla;
	}
	public String getTipo() {
		return "COMPUTADOR";
	}
	public String toString() {
		throw new UnsupportedOperationException();
	}
}