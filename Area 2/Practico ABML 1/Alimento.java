package Practicos;

public class Alimento extends Producto{
String fechaCaducidad;
String tipoAlimento;
public String getFechaCaducidad() {
	return fechaCaducidad;
}
public void setFechaCaducidad(String fechaCaducidad) {
	this.fechaCaducidad = fechaCaducidad;
}
public String getTipoAlimento() {
	return tipoAlimento;
}
public void setTipoAlimento(String tipoAlimento) {
	this.tipoAlimento = tipoAlimento;
}
public Alimento(String id, int precio, String fechaCaducidad, String tipoAlimento) {
	super(id, precio);
	this.fechaCaducidad = fechaCaducidad;
	this.tipoAlimento = tipoAlimento;
}


	
}
