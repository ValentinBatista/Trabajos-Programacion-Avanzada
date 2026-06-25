package Practicos;

public class Electronica extends Producto{
String dispositivo;
int yearFabricacion;
public String getDispositivo() {
	return dispositivo;
}
public void setDispositivo(String dispositivo) {
	this.dispositivo = dispositivo;
}
public int getYearFabricacion() {
	return yearFabricacion;
}
public void setYearFabricacion(int yearFabricacion) {
	this.yearFabricacion = yearFabricacion;
}
public Electronica(String id, int precio, String dispositivo, int yearFabricacion) {
	super(id, precio);
	this.dispositivo = dispositivo;
	this.yearFabricacion = yearFabricacion;
}



	
}