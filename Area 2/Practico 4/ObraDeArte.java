package Practico4;

public abstract class ObraDeArte {
String autor;
String fechaRealizacion;
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getFechaRealizacion() {
	return fechaRealizacion;
}
public void setFechaRealizacion(String fechaRealizacion) {
	this.fechaRealizacion = fechaRealizacion;
}
public ObraDeArte(String autor, String fechaRealizacion) {
	super();
	this.autor = autor;
	this.fechaRealizacion = fechaRealizacion;
}


}
