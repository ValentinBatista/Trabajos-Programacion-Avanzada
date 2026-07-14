package Mails;

import java.util.Scanner;

public class GestorMails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Dueño dueño1 = new Dueño("1");
		Gerente gerente1 = new Gerente("2");
		Empleado empleado1 = new Empleado("3");
		int opcion;
		int seleccionar;

		do {

			System.out.println("Quien esta enviando el mail?" + "\n1.Dueño" + "\n2.Gerente" + "\n3.Empleado");
			opcion = input.nextInt();
			switch (opcion) {

			case 1: {
				System.out.println("A quien quiere enviarle el mail?" + "\n1.Gerente" + "\n2.Empleado");
				dueño1.enviar();
				break;
			}

			case 2: {
				System.out.println("A quien quiere enviarle el mail?" + "\n1.Dueño" + "\n2.Empleado");
				gerente1.enviar();
				break;
			}

			case 3: {
				System.out.println("A quien quiere enviarle el mail?" + "\n1.Dueño" + "\n2.Encargado");
				empleado1.enviar();
				break;
			}
			}

		} while (opcion != 4);
	}

}
