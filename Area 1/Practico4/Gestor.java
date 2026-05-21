package Herencia;

public class Gestor {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Todo terreno", "GKA 3271", 2001, "Ferrari", "Rojo", 120);
		System.out.println("Especificaciones auto: ");
		System.out.println("Marca: " + auto1.getMarcaAuto());
		

		Moto moto1 = new Moto("Carreras", "PLS 4852", 2016, "Honda", "Negro", 250);
		System.out.println("\nEspecificaciones moto: ");
		System.out.println("Tipo de ruedas: "+moto1.getTipoRuedas());

		Alumno alumno1 = new Alumno(58018194, "Valentin", "Batista", "Piriapolis", "QuintoME", 16);
		System.out.println("\nDatos alumno: ");
		System.out.println("Localidad: "+alumno1.getLocalidad());
		
		Profesor profesor1 = new Profesor(53453898, "Ramiro", "Sosa", "Programacion", "Vespertino", 100000 ); //Un capo
		System.out.println("\nDatos profesor: ");
		System.out.println("Turno: "+profesor1.getTurno());
		
		Director director1 = new Director(54237457, "Julio", "NoMeAcuerdoLol", 40000, 12, "9AM/5PM");//Ponele
		System.out.println("\nDatos director: ");
		System.out.println("Horario: "+director1.getHorario());
		
		Triangulo triangulo1 = new Triangulo("TrianguloRectangulo", 0.3, 32.1, 20, "Rectangulo", 3);
		System.out.println("\nDatos triangulo: ");
		System.out.println("Tipo del triangulo: "+triangulo1.gettipo());
		
		Circulo circulo1 = new Circulo("Circulo", 0.0, 47.5, 1.5, 10.1, 120.3);
		System.out.println("\nDatos del circulo: ");
		System.out.println("Perimetro: "+circulo1.getArea());
	}

}
