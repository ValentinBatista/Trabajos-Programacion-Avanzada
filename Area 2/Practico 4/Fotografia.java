package Practico4;

public class Fotografia extends ObraDeArte{
String tema;
String dimension;
public String getTema() {
	return tema;
}
public void setTema(String tema) {
	this.tema = tema;
}
public String getDimension() {
	return dimension;
}
public void setDimension(String dimension) {
	this.dimension = dimension;
}
public Fotografia(String autor, String fechaRealizacion, String tema, String dimension) {
	super(autor, fechaRealizacion);
	this.tema = tema;
	this.dimension = dimension;
}

}
