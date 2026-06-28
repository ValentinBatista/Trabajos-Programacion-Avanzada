package Practico3;

public class Casa extends Edificio {
	int nroPuerta;
	String color;

	public int getNroPuerta() {
		return nroPuerta;
	}

	public void setNroPuerta(int nroPuerta) {
		this.nroPuerta = nroPuerta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Casa(String calle, String materialFachada, int nroPuerta, String color) {
		super(calle, materialFachada);
		this.nroPuerta = nroPuerta;
		this.color = color;
	}

}
