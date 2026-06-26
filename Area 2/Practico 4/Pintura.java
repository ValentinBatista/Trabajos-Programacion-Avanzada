package Practico4;

public class Pintura extends ObraDeArte{
String genero;
String superficePinta;
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getSuperficePinta() {
	return superficePinta;
}
public void setSuperficePinta(String superficePinta) {
	this.superficePinta = superficePinta;
}
public Pintura(String autor, String fechaRealizacion, String genero, String superficePinta) {
	super(autor, fechaRealizacion);
	this.genero = genero;
	this.superficePinta = superficePinta;
}

}
