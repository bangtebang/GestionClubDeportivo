package GestionClubDeportivo;

public class Baloncesto extends Deporte {
	private String tipoCancha;
	private int numeroTiemposJugados;

	public String getTipoCancha() {
		return this.tipoCancha;
	}

	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}

	public int getNumeroTiemposJugados() {
		return this.numeroTiemposJugados;
	}

	public void setNumeroTiemposJugados(int numeroTiemposJugados) {
		this.numeroTiemposJugados = numeroTiemposJugados;
	}

	public Baloncesto(String nombre,Equipo equipo, String tipoCancha, int numeroTiemposJugados) {
		super(nombre,equipo);
		this.tipoCancha = tipoCancha;
		this.numeroTiemposJugados = numeroTiemposJugados;
	}
	}
