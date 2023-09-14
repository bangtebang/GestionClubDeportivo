package GestionClubDeportivo;

public class Entrenador extends Deportista {
	private String experiencia;
	private String especialidadDeportiva;
	private Equipo equipo;

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getEspecialidadDeportiva() {
		return this.especialidadDeportiva;
	}

	public void setEspecialidadDeportiva(String especialidadDeportiva) {
		this.especialidadDeportiva = especialidadDeportiva;
	}

	public Entrenador() {
		throw new UnsupportedOperationException();
	}
}