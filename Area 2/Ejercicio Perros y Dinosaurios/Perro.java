package Videojuego;

public class Perro implements Acciones {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void comer() {
		System.out.println("Come 5 kilos");

	}

	@Override
	public void dormir() {
		System.out.println("Duerme 9 horas");

	}

}
