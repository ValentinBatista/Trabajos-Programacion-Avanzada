package Herencia;

public class Circulo extends FiguraGeometrica {
	private double radio;
	private double punto;
	private double perimetro;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPunto() {
		return punto;
	}

	public void setPunto(double punto) {
		this.punto = punto;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public Circulo(String nombreFigura, double centro, double area, double radio, double punto, double perimetro) {
		super(nombreFigura, centro, area);
		this.radio = radio;
		this.punto = punto;
		this.perimetro = perimetro;
	}

}
