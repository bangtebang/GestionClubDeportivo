package GestionClubDeportivo;

public class Tenis extends Deporte {
	private String tipoSuperficie;
	private String tipoPartido;

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getTipoPartido() {
		return this.tipoPartido;
	}

	public void setTipoPartido(String tipoPartido) {
		this.tipoPartido = tipoPartido;
	}

	public Tenis(String nombre,Equipo equipo, String tipoSuperficie, String tipoPartido) {
		super(nombre,equipo);
		this.tipoSuperficie = tipoSuperficie;
		this.tipoPartido = tipoPartido;
	}
}