package Herencia;

public class Director extends Persona {
	private int sueldo;
	private int id;
	private String horario;

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Director(int cedula, String nombre, String apellido, int sueldo, int id, String horario) {
		super(cedula, nombre, apellido);
		this.sueldo = sueldo;
		this.id = id;
		this.horario = horario;
	}

}
