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
			System.out.println("4.Baja edificio");
			System.out.println("5.Modificar edificio");
			System.out.println("6.Salir");
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
			case 4: {
				System.out.println("Que edificio quiere borrar?" + "\n1.Casa" + "\n2.Apartamento");
				int baja = input.nextInt();
				if (baja == 1) {
					System.out.println("Ingrese el nombre de la calle del edificio a borrar:");
					String bajaCalle = input.next();
					bajaCasa(arregloCasa, bajaCalle);
				}
				if (baja == 2) {
					System.out.println("Ingresa el nombre de la calle del edificio a borrar");
					String bajaCalle = input.next();
					bajaApartamento(arregloApartamento, bajaCalle);
				}
				break;
			}

			case 5: {
				String calle = "";
				String materialFachada = "";
				int opcionEd;
				System.out.println("Que clase de edificio quiere modificar?" + "\n1.Casa" + "\n2.Apartamento");
				opcionEd = input.nextInt();
				if (opcionEd == 1) {
					System.out.println("Ingrese el nombre de la calle de la casa a modificar");
					String calleActual = input.next();
					System.out.println("Ingrese el dato que desea modificar:" + "\n1.Calle" + "\n2.Material fachada");
					opcionEd = input.nextInt();
					if (opcionEd == 1) {
						System.out.println("Ingrese la nueva calle:");
						calle = input.next();
					} else {
						System.out.println("Ingrese el nuevo material de la fachada:");
						materialFachada = input.next();
					}
					modificarCasa(arregloCasa, calleActual, calle, materialFachada, opcionEd);
				} else if (opcionEd == 2) {
					System.out.println("Ingrese el nombre de la calle de la casa a modificar");
					String calleActual = input.next();
					System.out.println("Ingrese el dato que desea modificar:" + "\n1.Calle" + "\n2.Material fachada");
					opcionEd = input.nextInt();
					if (opcionEd == 1) {
						System.out.println("Ingrese la nueva calle:");
						calle = input.next();
					} else {
						System.out.println("Ingrese el nuevo material de la fachada:");
						materialFachada = input.next();
					}
					modificarApartamento(arregloCasa, calleActual, calle, materialFachada, opcionEd);
				}
				break;
			}
			}
		} while (opcion != 6);

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
				System.out.println("Casa: " + "Pos Nroº " + i + " Calle: " + ar[i].getCalle() + " Material fachada: "
						+ ar[i].getMaterialFachada() + " Nro de puerta: " + ar[i].getNroPuerta() + " Color: "
						+ ar[i].getColor());
			}
		}
	}

	public static void mostrarDepartamento(Apartamento[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Casa: " + "Pos Nroº " + i + " Calle: " + ar[i].getCalle() + " Material fachada: "
						+ ar[i].getMaterialFachada() + " Nivel del piso: " + ar[i].getNvlPiso() + " Nro habitacion: "
						+ ar[i].getNroHabitacion());
			}
		}
	}

	public static void bajaCasa(Casa[] ar, String calle) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getCalle().equals(calle)) {
				ar[i] = null;
				System.err.println("Edificio borrado correctamente!");
				break;
			}
		}
	}

	public static void bajaApartamento(Apartamento[] ar, String calle) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getCalle().equals(calle)) {
				ar[i] = null;
				System.out.println("Edificio borrado correctamente");
				break;
			}
		}
	}

	public static void modificarCasa(Casa[] ar, String calleActual, String calleAModificar,
			String materialFachadaAModificar, int opcion) {
		System.out.println("Edificio modificado:" + calleActual + "\n");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getCalle().equals(calleActual)) {
				if (opcion == 1) {
					ar[i].setCalle(calleAModificar);
				} else if (opcion == 2) {
					ar[i].setMaterialFachada(materialFachadaAModificar);
				}
				break;
			}
		}
	}

	public static void modificarApartamento(Casa[] ar, String calleActual, String calleAModificar,
			String materialFachadaAModificar, int opcion) {
		System.out.println("Edificio modificado:" + calleActual + "\n");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getCalle().equals(calleActual)) {
				if (opcion == 1) {
					ar[i].setCalle(calleAModificar);
				} else if (opcion == 2) {
					ar[i].setMaterialFachada(materialFachadaAModificar);
				}
				break;
			}
		}
	}
}