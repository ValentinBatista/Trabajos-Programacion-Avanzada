package Practico4;

import java.util.Scanner;

public class GestorArte {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Escultura escultura1 = new Escultura(null, null, null, 0);
		Escultura arregloEscultura[] = new Escultura[10];

		Fotografia fotografia1 = new Fotografia(null, null, null, null);
		Fotografia arregloFotografia[] = new Fotografia[10];

		Pintura pintura1 = new Pintura(null, null, null, null);
		Pintura arregloPintura[] = new Pintura[10];

		int opcion;

		do {
			System.out.println("Bienvenido al programa");
			System.out.println("Ingrese una opcion: ");
			System.out.println("1.Ingresar datos de la escultura");
			System.out.println("2.Ingresar datos de la fotografia");
			System.out.println("3.Ingresar datos de la pintura");
			System.out.println("4.Mostrar todos los datos");
			System.out.println("5.Salir");
			opcion = input.nextInt();

			switch (opcion) {

			case 1: {
				System.out.println("Ingrese el autor:");
				String autor = input.next();
				System.out.println("Ingrese la fecha que se creo la obra:");
				String fechaRealizacion = input.next();
				System.out.println("Ingrese el material:");
				String material = input.next();
				System.out.println("Ingrese el peso:");
				int peso = input.nextInt();
				pedirEscultura(arregloEscultura, escultura1, autor, fechaRealizacion, material, peso);
				break;
			}

			case 2: {
				System.out.println("Ingrese el autor:");
				String autor = input.next();
				System.out.println("Ingrese la fecha que se creo la obra:");
				String fechaRealizacion = input.next();
				System.out.println("Ingrese el tema:");
				String tema = input.next();
				System.out.println("Ingrese las dimensiones:");
				String dimension = input.next();
				pedirFotografia(arregloFotografia, fotografia1, autor, fechaRealizacion, tema, dimension);
				break;
			}

			case 3: {
				System.out.println("Ingrese el autor:");
				String autor = input.next();
				System.out.println("Ingrese la fecha que se creo la obra:");
				String fechaRealizacion = input.next();
				System.out.println("Ingrese el genero:");
				String genero = input.next();
				System.out.println("Ingrese la superficie sobre la que se pinta:");
				String superficePinta = input.next();
				pedirPintura(arregloPintura, pintura1, autor, fechaRealizacion, genero, superficePinta);
				break;
			}

			case 4: {
				mostrarEscultura(arregloEscultura);
				mostrarFotografia(arregloFotografia);
				mostrarPintura(arregloPintura);
				break;
			}

			}
		} while (opcion != 5);

	}

	public static void pedirEscultura(Escultura[] ar, Escultura a, String au, String f, String m, int p) {
		a.setAutor(au);
		a.setFechaRealizacion(f);
		a.setMaterial(m);
		a.setPeso(p);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Escultura(au, f, m, p);
				break;
			}
		}
	}

	public static void pedirFotografia(Fotografia[] ar, Fotografia a, String au, String f, String t, String d) {
		a.setAutor(au);
		a.setFechaRealizacion(f);
		a.setTema(t);
		a.setDimension(d);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Fotografia(au, f, t, d);
				break;
			}
		}

	}

	public static void pedirPintura(Pintura[] ar, Pintura a, String au, String f, String g, String s) {
		a.setAutor(au);
		a.setFechaRealizacion(f);
		a.setGenero(g);
		a.setSuperficePinta(s);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Pintura(au, f, g, s);
				break;
			}
		}
	}

	public static void mostrarEscultura(Escultura[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Escultura: " + "Pos Nroº " + i + " Autor: " + ar[i].getAutor() + " Fecha: "
						+ ar[i].getFechaRealizacion() + " Material: " + ar[i].getMaterial() + " Peso: "
						+ ar[i].getPeso());
			}
		}
	}

	public static void mostrarFotografia(Fotografia[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Escultura: " + "Pos Nroº " + i + " Autor: " + ar[i].getAutor() + " Fecha: "
						+ ar[i].getFechaRealizacion() + " Tema: " + ar[i].getTema() + " Dimension: "
						+ ar[i].getDimension());
			}
		}
	}

	public static void mostrarPintura(Pintura[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Escultura: " + "Pos Nroº " + i + " Autor: " + ar[i].getAutor() + " Fecha: "
						+ ar[i].getFechaRealizacion() + " Genero: " + ar[i].getGenero() + " Superficie: "
						+ ar[i].getSuperficePinta());
			}
		}
	}
}
