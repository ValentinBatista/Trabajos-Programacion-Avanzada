package Herencia;

public class Triangulo extends FiguraGeometrica {
	private int areaTriangulo;
	private String tipo;
	private int angulos;

	public int getareaTriangulo() {
		return areaTriangulo;
	}

	public void setareaTriangulo(int areaTriangulo) {
		this.areaTriangulo = areaTriangulo;
	}

	public String gettipo() {
		return tipo;
	}

	public void settipo(String tipo) {
		this.tipo = tipo;
	}

	public double getAngulos() {
		return angulos;
	}

	public void setAngulos(int angulos) {
		this.angulos = angulos;
	}

	public Triangulo(String nombreFigura, double centro, double area, int areaTriangulo, String tipo, int angulos) {
		super(nombreFigura, centro, area);
		this.areaTriangulo = areaTriangulo;
		this.tipo = tipo;
		this.angulos = angulos;
	}

}
