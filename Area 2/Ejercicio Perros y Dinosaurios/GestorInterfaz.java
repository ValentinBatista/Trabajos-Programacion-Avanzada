package Videojuego;

import java.util.Scanner;

public class GestorInterfaz {

	public static void main(String[] args) {

		Dinosaurio dinosaurio1 = new Dinosaurio("Pancracio");
		Perro perro1 = new Perro("Phoebe");

		Scanner input = new Scanner(System.in);
		int opcion;
		int seleccionar;

		do {

			System.out.println("1.Dinosaurio" + "\n2.Perro");
			opcion = input.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Elija una opcion:" + "\n1.Cuanto duerme" + "\n2.Cuanto come");
				seleccionar = input.nextInt();
				if (seleccionar == 1) {
					dinosaurio1.dormir();
				} else {
					dinosaurio1.comer();
				}
				break;
			}

			case 2: {
				System.out.println("Elija una opcion:" + "\n1.Cuanto duerme" + "\n2.Cuanto come");
				seleccionar = input.nextInt();
				if (seleccionar == 1) {
					perro1.dormir();
				} else {
					perro1.comer();
				}

				break;
			}
			}

		} while (opcion != 3);
	}

}
