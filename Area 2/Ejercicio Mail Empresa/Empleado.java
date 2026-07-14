package Mails;

import java.util.Scanner;

public class Empleado implements Mail {
	Scanner input = new Scanner(System.in);

	String id;
	int opcion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Empleado(String id) {
		super();
		this.id = id;
	}

	@Override
	public void enviar() {
		opcion = input.nextInt();
		if (opcion > 0) {
			System.out.println("No puedes enviarle un mail");

		}
	}
}
