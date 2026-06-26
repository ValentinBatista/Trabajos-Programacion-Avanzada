package Practico4;

public class Escultura extends ObraDeArte{
String material;
int peso;
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public Escultura(String autor, String fechaRealizacion, String material, int peso) {
	super(autor, fechaRealizacion);
	this.material = material;
	this.peso = peso;
}

}
