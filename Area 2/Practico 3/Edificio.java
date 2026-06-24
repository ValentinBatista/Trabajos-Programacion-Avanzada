package Practico3;

public abstract class Edificio {
	String calle;
	String materialFachada;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getMaterialFachada() {
		return materialFachada;
	}

	public void setMaterialFachada(String materialFachada) {
		this.materialFachada = materialFachada;
	}

	public Edificio(String calle, String materialFachada) {
		super();
		this.calle = calle;
		this.materialFachada = materialFachada;
	}

}
