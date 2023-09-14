package GestionClubDeportivo;

public class Jugador extends Deportista {
	private Equipo equipo;

	public Jugador(String nombre,String apellido,String direccionCorreo,int numeroContacto,String posicionRol,Equipo equipo) {
		super(nombre,apellido,direccionCorreo,numeroContacto,posicionRol);
		this.equipo = equipo;
	}
}