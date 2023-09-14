package GestionClubDeportivo;

public abstract class Deporte {
	private String nombre;
	private Equipo equipo;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Deporte() {
		throw new UnsupportedOperationException();
	}
}