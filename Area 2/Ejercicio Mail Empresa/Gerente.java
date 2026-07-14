package Mails;

import java.util.Scanner;

public class Gerente implements Mail {
	Scanner input = new Scanner(System.in);

	String id;
	int opcion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Gerente(String id) {
		super();
		this.id = id;
	}

	@Override
	public void enviar() {
		opcion = input.nextInt();
		if (opcion == 2) {
			System.out.println("Puede enviarle un mail");
		} else {
			System.out.println("No puede enviarle el mail");
		}
	}

}
