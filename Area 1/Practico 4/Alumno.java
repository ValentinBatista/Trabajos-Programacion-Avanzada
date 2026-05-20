package Herencia;

public class Alumno extends Persona {
	private String nombreAlumno;
	private int cedulaAlumno;
	private int grado;

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public int getCedulaAlumno() {
		return cedulaAlumno;
	}

	public void setCedulaAlumno(int cedulaAlumno) {
		this.cedulaAlumno = cedulaAlumno;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public Alumno(int cedula, String nombre, String apellido, String nombreAlumno, int cedulaAlumno, int grado) {
		super(cedula, nombre, apellido);
		this.nombreAlumno = nombreAlumno;
		this.cedulaAlumno = cedulaAlumno;
		this.grado = grado;
	}

}
