public class Cliente {
	private String nombre;
	private String apellido;
	private String correo;
	private String estadoCivil;
	private String ciudad;
	private Compra compra;
	public Cliente(String nombre, String apellido, String correo, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}


}