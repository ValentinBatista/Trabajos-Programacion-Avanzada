package Practico2;

public class ArticuloCientifico extends Publicacion{
String areaInvestigacion;
String doi;
public String getAreaInvestigacion() {
	return areaInvestigacion;
}
public void setAreaInvestigacion(String areaInvestigacion) {
	this.areaInvestigacion = areaInvestigacion;
}
public String getDoi() {
	return doi;
}
public void setDoi(String doi) {
	this.doi = doi;
}
public ArticuloCientifico(String titulo, String fechaPublicacion, String areaInvestigacion, String doi) {
	super(titulo, fechaPublicacion);
	this.areaInvestigacion = areaInvestigacion;
	this.doi = doi;
}

}
