package Practicos;

public class Ropa extends Producto{
String talle;
String tipoRopa;
public String getTalle() {
	return talle;
}
public void setTalle(String talle) {
	this.talle = talle;
}
public String getTipoRopa() {
	return tipoRopa;
}
public void setTipoRopa(String tipoRopa) {
	this.tipoRopa = tipoRopa;
}
public Ropa(String id, int precio, String talle, String tipoRopa) {
	super(id, precio);
	this.talle = talle;
	this.tipoRopa = tipoRopa;
}



}