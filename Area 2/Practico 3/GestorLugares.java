package Practico3;

import java.util.Scanner;

public class GestorLugares {

	public static void main(String[] args) {
		Casa casa1 = new Casa(null, null, 0, null);
		Casa arregloCasa[] = new Casa[10];

		Apartamento apartamento1 = new Apartamento(null, null, 0, null);
		Apartamento arregloApartamento[] = new Apartamento[10];

		Scanner input = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese una opcion");
			System.out.println("1.Ingrese los datos de la casa:");
			System.out.println("2.Ingrese los datos del departamento:");
			System.out.println("3.Ver los datos de los edificios");
			System.out.println("4.Salir");
			opcion = input.nextInt();

			switch (opcion) {

			case 1: {
				System.out.println("Ingrese el nombre de la calle:");
				String calle = input.next();
				System.out.println("Ingrese el material de la fachada:");
				String materialFachada = input.next();
				System.out.println("Ingrese el numero de la puerta:");
				int nroPuerta = input.nextInt();
				System.out.println("Ingrese el color de la casa:");
				String color = input.next();
				pedirCasa(arregloCasa, casa1, calle, materialFachada, nroPuerta, color);
				break;
			}
			case 2: {
				System.out.println("Ingrese el nombre de la calle:");
				String calle = input.next();
				System.out.println("Ingrese el material de la fachada:");
				String materialFachada = input.next();
				System.out.println("Ingrese el nivel del piso:");
				int nvlPiso = input.nextInt();
				System.out.println("Ingrese el numero de la habitacion:");
				String nroHabitacion = input.next();
				pedirApartamento(arregloApartamento, apartamento1, calle, materialFachada, nvlPiso, nroHabitacion);
				break;
			}
			case 3: {
				mostrarCasa(arregloCasa);
				mostrarDepartamento(arregloApartamento);
				break;
			}
			
			}
		} while (opcion != 4);

	}

	public static void pedirCasa(Casa[] ar, Casa a, String c, String m, int n, String co) {
		a.setCalle(c);
		a.setMaterialFachada(m);
		a.setNroPuerta(n);
		a.setColor(co);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Casa(c, m, n, co);
				break;
			}
		}

	}

	public static void pedirApartamento(Apartamento[] ar, Apartamento a, String c, String m, int n, String nr) {
		a.setCalle(c);
		a.setMaterialFachada(m);
		a.setNvlPiso(n);
		a.setNroHabitacion(nr);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Apartamento(c, m, n, nr);
				break;
			}
		}
	}

	public static void mostrarCasa(Casa[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Casa: " + i + "Pos Nroº " + i + " Calle: " + ar[i].getCalle()
						+ " Material fachada: " + ar[i].getMaterialFachada() + " Nro de puerta: " + ar[i].getNroPuerta()
						+ " Color: " + ar[i].getColor());
			}
		}
	}

	public static void mostrarDepartamento(Apartamento[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Casa: " + i + "Pos Nroº " + i + " Calle: " + ar[i].getCalle()
						+ " Material fachada: " + ar[i].getMaterialFachada() + " Nivel del piso: " + ar[i].getNvlPiso()
						+ " Nro habitacion: " + ar[i].getNroHabitacion());
			}
		}
	}
}