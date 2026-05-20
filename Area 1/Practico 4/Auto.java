package Herencia;

public class Auto extends Vehiculo {
	private String marcaAuto;
	private String pinturaAuto;
	private int velocidadLimite;

	public String getMarcaAuto() {
		return marcaAuto;
	}

	public void setMarcaAuto(String marcaAuto) {
		this.marcaAuto = marcaAuto;
	}

	public String getPinturaAuto() {
		return pinturaAuto;
	}

	public void setPinturaAuto(String pinturaAuto) {
		this.pinturaAuto = pinturaAuto;
	}

	public int getVelocidadLimite() {
		return velocidadLimite;
	}

	public void setVelocidadLimite(int velocidadLimite) {
		this.velocidadLimite = velocidadLimite;
	}

	public Auto(String tipoRuedas, String matricula, int yearFabricacion, String marcaAuto, String pinturaAuto,
			int velocidadLimite) {
		super(tipoRuedas, matricula, yearFabricacion);
		this.marcaAuto = marcaAuto;
		this.pinturaAuto = pinturaAuto;
		this.velocidadLimite = velocidadLimite;
	}



}
