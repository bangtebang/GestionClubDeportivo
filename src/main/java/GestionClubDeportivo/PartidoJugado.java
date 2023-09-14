package GestionClubDeportivo;

public class PartidoJugado {
	private String equipoOponente;
	private String resultado;
	private String fecha;
	private String lugar;
	private Equipo equipo;

	public String getEquipoOponente() {
		return this.equipoOponente;
	}

	public void setEquipoOponente(String equipoOponente) {
		this.equipoOponente = equipoOponente;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public PartidoJugado() {
		throw new UnsupportedOperationException();
	}
}