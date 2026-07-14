package Mails;

import java.util.Scanner;

public class Dueño implements Mail {
	Scanner input = new Scanner(System.in);
	int opcion;
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Dueño(String id) {
		super();
		this.id = id;
	}

	@Override
	public void enviar() {
		opcion = input.nextInt();
		if (opcion == 1) {
			System.out.println("Puede enviarle un mail");
		} else {
			System.out.println("No puede enviarle el mail");
		}

	}

}
