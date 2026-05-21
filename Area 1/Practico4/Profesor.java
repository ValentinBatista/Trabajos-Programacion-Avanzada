package Herencia;

public class Profesor extends Persona {
	private String especialidad;
	private String turno;
	private int sueldoProfesor;

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getSueldoProfesor() {
		return sueldoProfesor;
	}

	public void setSueldoProfesor(int sueldoProfesor) {
		this.sueldoProfesor = sueldoProfesor;
	}

	public Profesor(int cedula, String nombre, String apellido, String especialidad, String turno, int sueldoProfesor) {
		super(cedula, nombre, apellido);
		this.especialidad = especialidad;
		this.turno = turno;
		this.sueldoProfesor = sueldoProfesor;
	}

}
