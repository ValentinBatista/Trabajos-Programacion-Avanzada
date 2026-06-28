package Practico2;

public class Revista extends Publicacion{
int numeroEdicion;
String editorial;
public int getNumeroEdicion() {
	return numeroEdicion;
}
public void setNumeroEdicion(int numeroEdicion) {
	this.numeroEdicion = numeroEdicion;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public Revista(String titulo, String fechaPublicacion, int numeroEdicion, String editorial) {
	super(titulo, fechaPublicacion);
	this.numeroEdicion = numeroEdicion;
	this.editorial = editorial;
}

}
