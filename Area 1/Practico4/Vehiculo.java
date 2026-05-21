package Herencia;

public abstract class Vehiculo {
String tipoRuedas;
String matricula;
int yearFabricacion;
public String getTipoRuedas() {
	return tipoRuedas;
}
public void setTipoRuedas(String tipoRuedas) {
	this.tipoRuedas = tipoRuedas;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public int getYearFabricacion() {
	return yearFabricacion;
}
public void setYearFabricacion(int yearFabricacion) {
	this.yearFabricacion = yearFabricacion;
}
public Vehiculo(String tipoRuedas, String matricula, int yearFabricacion) {
	super();
	this.tipoRuedas = tipoRuedas;
	this.matricula = matricula;
	this.yearFabricacion = yearFabricacion;
}



}
