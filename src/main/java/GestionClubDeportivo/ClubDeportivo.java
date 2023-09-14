package GestionClubDeportivo;

import java.util.ArrayList;

public class ClubDeportivo {
    private ArrayList<Deportista> deportistas;
    private ArrayList<PartidoJugado> partidosjugados = new ArrayList<PartidoJugado>();
    private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public ClubDeportivo() {
        this.deportistas = new ArrayList<Deportista>();
    }

    public void registrarJugador(Deportista deportista) {
        // Verificar si el deportista ya existe
        if (!deportistas.contains(deportista)) {
            deportistas.add(deportista);
            System.out.println("Deportista registrado con éxito.");
        }
        else {
            System.out.println("El jugador ya existe.");
        }
    }
    public void registrarEntrenador(Deportista deportista,String experiencia,String especialidadDeportiva) {
        // Verificar si el deportista ya existe
        if (!deportistas.contains(deportista)) {
            deportistas.add(deportista);
            System.out.println("Entrenador registrado con éxito.");
        }
        else {
            System.out.println("El entrenador ya existe.");
        }
    }
    public void crearEquipo(String nombre,ArrayList<Jugador> jugadores,Entrenador entrenador,Deporte deporte,ArrayList<PartidoJugado> partidosjugados) {
        Equipo equipo = new Equipo(nombre,jugadores,entrenador,deporte,partidosjugados);
    }
    public void asignarJugadorAEquipo(String nombreEquipo, Jugador jugador) {
        // Buscar el equipo por nombre
        Equipo equipo = null;
        for (Equipo e : equipos) {
            if (e.getNombre().equals(nombreEquipo)) {
                equipo = e;
                break;
            }
        }
        if (equipo != null) {
            // Verificar si el jugador ya está en el equipo
            if (!equipo.getJugadores().contains(jugador)) {
                equipo.agregarJugador(jugador);
                System.out.println("Jugador asignado con éxito.");
            }
        }
        else {
            System.out.println("El equipo no existe o el jugador ya está asignado.");
        }
    }
       public void registrarPartidoJugado(PartidoJugado partidoJugado) {
            // Verificar si el partido ya existe
            if (!partidosjugados.contains(partidoJugado)) {
                partidosjugados.add(partidoJugado);
                System.out.println("Partido registrado con éxito.");
            }
            else {
                System.out.println("El partido ya existe.");
            }
        }
}
