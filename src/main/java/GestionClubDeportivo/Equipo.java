package GestionClubDeportivo;

import java.util.ArrayList;
import java.util.Collection;

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

	public Equipo(String nombre, ArrayList<Jugador> jugadores, Entrenador entrenador, Deporte deporte, ArrayList<PartidoJugado> partidosjugados) {
		this.nombre = nombre;
		this.jugadores = jugadores;
		this.entrenador = entrenador;
		this.deporte = deporte;
		this.partidosjugados = partidosjugados;
	}

	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	public ArrayList<Jugador> getJugadores() {
		return this.jugadores;
	}
	}
