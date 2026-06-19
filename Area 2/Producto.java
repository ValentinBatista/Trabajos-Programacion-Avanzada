package Practicos;

public abstract class Producto {
String id;
int precio;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public Producto(String id, int precio) {
	super();
	this.id = id;
	this.precio = precio;
}

}
