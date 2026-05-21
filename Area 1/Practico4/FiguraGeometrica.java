package Herencia;

public abstract class FiguraGeometrica {
	String nombreFigura;
	double centro;
	double area;

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	public double getCentro() {
		return centro;
	}

	public void setCentro(double centro) {
		this.centro = centro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public FiguraGeometrica(String nombreFigura, double centro, double area) {
		super();
		this.nombreFigura = nombreFigura;
		this.centro = centro;
		this.area = area;
	}

}
