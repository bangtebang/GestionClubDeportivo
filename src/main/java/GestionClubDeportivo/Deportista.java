package GestionClubDeportivo;

public abstract class Deportista {
	private String nombre;
	private String apellido;
	private String direccionCorreo;
	private int numeroContacto;
	private String posicionRol;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccionCorreo() {
		return this.direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public int getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getPosicionRol() {
		return this.posicionRol;
	}

	public void setPosicionRol(String posicionRol) {
		this.posicionRol = posicionRol;
	}

	public Deportista(String nombre, String apellido, String direccionCorreo, int numeroContacto, String posicionRol) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccionCorreo = direccionCorreo;
		this.numeroContacto = numeroContacto;
		this.posicionRol = posicionRol;
	}
	}