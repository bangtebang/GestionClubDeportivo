package GestionClubDeportivo;

import java.util.ArrayList;

public class ClubDeportivo {
    private ArrayList<Deportista> deportistas;

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

}
