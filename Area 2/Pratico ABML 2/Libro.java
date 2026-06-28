package Practico2;

public class Libro extends Publicacion{
String isbn;
int cantidadPags;
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public int getCantidadPags() {
	return cantidadPags;
}
public void setCantidadPags(int cantidadPags) {
	this.cantidadPags = cantidadPags;
}
public Libro(String titulo, String fechaPublicacion, String isbn, int cantidadPags) {
	super(titulo, fechaPublicacion);
	this.isbn = isbn;
	this.cantidadPags = cantidadPags;
}

}
