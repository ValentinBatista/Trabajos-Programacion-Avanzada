package Practico2;

public abstract class Publicacion {
String titulo;
String fechaPublicacion;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getFechaPublicacion() {
	return fechaPublicacion;
}
public void setFechaPublicacion(String fechaPublicacion) {
	this.fechaPublicacion = fechaPublicacion;
}
public Publicacion(String titulo, String fechaPublicacion) {
	super();
	this.titulo = titulo;
	this.fechaPublicacion = fechaPublicacion;
}

}
