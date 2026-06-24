package Practico3;

public class Apartamento extends Edificio {
	int nvlPiso;
	String nroHabitacion;

	public int getNvlPiso() {
		return nvlPiso;
	}

	public void setNvlPiso(int nvlPiso) {
		this.nvlPiso = nvlPiso;
	}

	public String getNroHabitacion() {
		return nroHabitacion;
	}

	public void setNroHabitacion(String nroHabitacion) {
		this.nroHabitacion = nroHabitacion;
	}

	public Apartamento(String calle, String materialFachada, int nvlPiso, String nroHabitacion) {
		super(calle, materialFachada);
		this.nvlPiso = nvlPiso;
		this.nroHabitacion = nroHabitacion;
	}

}
