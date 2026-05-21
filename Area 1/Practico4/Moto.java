package Herencia;

public class Moto extends Vehiculo {
	private String marca;
	private String pintura;
	private int velocidadLimite;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPintura() {
		return pintura;
	}

	public void setPintura(String pintura) {
		this.pintura = pintura;
	}

	public int getVelocidadLimite() {
		return velocidadLimite;
	}

	public void setVelocidadLimite(int velocidadLimite) {
		this.velocidadLimite = velocidadLimite;
	}

	public Moto(String tipoRuedas, String matricula, int yearFabricacion, String marca, String pintura,
			int velocidadLimite) {
		super(tipoRuedas, matricula, yearFabricacion);
		this.marca = marca;
		this.pintura = pintura;
		this.velocidadLimite = velocidadLimite;
	}

}
