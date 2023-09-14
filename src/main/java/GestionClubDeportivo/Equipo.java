package GestionClubDeportivo;

import java.util.ArrayList;
import GestionClubDeportivo.Jugador;
import GestionClubDeportivo.PartidoJugado;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private Entrenador entrenador;
	private Deporte deporte;
	private ArrayList<PartidoJugado> partidosjugados = new ArrayList<PartidoJugado>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo() {
		throw new UnsupportedOperationException();
	}
}