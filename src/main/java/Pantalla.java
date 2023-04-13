public class Pantalla {
	private String marca;
	private String modelo;
	private int anho;

	public Pantalla(String marca, String modelo, int anho) {
		this.modelo = modelo;
		this.marca = marca;
		this.anho = anho;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAnho() {
		return this.anho;
	}
}