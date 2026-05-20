package Herencia;

public class Triangulo extends FiguraGeometrica {
	private int areaTriangulo;
	private int tipo;
	private double angulos;

	public int getareaTriangulo() {
		return areaTriangulo;
	}

	public void setareaTriangulo(int areaTriangulo) {
		this.areaTriangulo = areaTriangulo;
	}

	public int gettipo() {
		return tipo;
	}

	public void settipo(int tipo) {
		this.tipo = tipo;
	}

	public double getAngulos() {
		return angulos;
	}

	public void setAngulos(double angulos) {
		this.angulos = angulos;
	}

	public Triangulo(String nombreFigura, double centro, double area, int areaTriangulo, int tipo, double angulos) {
		super(nombreFigura, centro, area);
		this.areaTriangulo = areaTriangulo;
		this.tipo = tipo;
		this.angulos = angulos;
	}

}
