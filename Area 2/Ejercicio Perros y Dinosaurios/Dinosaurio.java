package Videojuego;

public class Dinosaurio implements Acciones {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Dinosaurio(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void comer() {
		System.out.println("Come 50 kilos");

	}

	@Override
	public void dormir() {
		System.out.println("Duerme 12 horas");

	}

}
