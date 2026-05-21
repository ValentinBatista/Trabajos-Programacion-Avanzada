package Herencia;

public class Alumno extends Persona {
	private String localidad;
	private String clase;
	private int edad;

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Alumno(int cedula, String nombre, String apellido, String localidad, String clase, int edad) {
		super(cedula, nombre, apellido);
		this.localidad = localidad;
		this.edad = edad;
		this.clase = clase;
	}

}
