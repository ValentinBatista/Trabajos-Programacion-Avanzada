package Practico2;

import java.util.Scanner;

public class GestorAcademico {

	public static void main(String[] args) {

		Libro libro1 = new Libro(null, null, null, 0);
		Libro arregloLibro[] = new Libro[10];

		Revista revista1 = new Revista(null, null, 0, null);
		Revista arregloRevista[] = new Revista[10];

		ArticuloCientifico articulocientifico1 = new ArticuloCientifico(null, null, null, null);
		ArticuloCientifico arregloArticuloCientifico[] = new ArticuloCientifico[10];

		Scanner input = new Scanner(System.in);
		int opcion;
		do {

			System.out.println("Ingrese una opcion");
			System.out.println("1.Ingresar los datos de un libro:");
			System.out.println("2.Ingresar los datos de una revista:");
			System.out.println("3.Ingresar los datos de un articulo cientifico:");
			System.out.println("4.Mostrar todos los datos:");
			System.out.println("5.Bajar articulos:");
			System.out.println("6.Modificar los articulos:");
			System.out.println("7.Salir");
			opcion = input.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Ingrese el titulo del libro:");
				String titulo = input.next();
				System.out.println("Ingrese fecha de publicacion:");
				String fechaPublicacion = input.next();
				System.out.println("Ingrese el ISBN:");
				String isbn = input.next();
				System.out.println("Ingrese el numero de paginas:");
				int cantidadPaginas = input.nextInt();
				pedirLibro(arregloLibro, libro1, titulo, fechaPublicacion, isbn, cantidadPaginas);
				break;
			}

			case 2: {
				System.out.println("Ingrese el titulo de la revista:");
				String titulo = input.next();
				System.out.println("Ingrese fecha de publicacion:");
				String fechaPublicacion = input.next();
				System.out.println("Ingrese el numero de la edicion:");
				int numeroEdicion = input.nextInt();
				System.out.println("Ingrese la editorial:");
				String editorial = input.next();
				pedirRevista(arregloRevista, revista1, titulo, fechaPublicacion, numeroEdicion, editorial);
				break;
			}

			case 3: {
				System.out.println("Ingrese el titulo del articulo cientifico:");
				String titulo = input.next();
				System.out.println("Ingrese fecha de publicacion:");
				String fechaPublicacion = input.next();
				System.out.println("Ingrese el area que se investiga:");
				String areaInvestigacion = input.next();
				System.out.println("Ingrese el DOI:");
				String doi = input.next();
				pedirArticuloCientifico(arregloArticuloCientifico, articulocientifico1, titulo, fechaPublicacion,
						areaInvestigacion, doi);
				break;
			}

			case 4: {
				mostrarLibro(arregloLibro);
				mostrarRevista(arregloRevista);
				mostrarArticuloCientifico(arregloArticuloCientifico);
				break;
			}

			case 5: {
				System.out.println(
						"Que articulo quiere borrar?" + "\n1.Libro" + "\n2.Revista" + "\n3.Articulo cientifico");
				int baja = input.nextInt();
				if (baja == 1) {
					System.out.println("Ingresa el titulo del libro a borrar:");
					String bajaTitulo = input.next();
					bajaLibro(arregloLibro, bajaTitulo);
				}
				if (baja == 2) {
					System.out.println("Ingresa el titulo de la revista a borrar:");
					String bajaTitulo = input.next();
					bajaRevista(arregloRevista, bajaTitulo);
				}
				if (baja == 3) {
					System.out.println("Ingresa el titulo del articulo cientifico:");
					String bajaArticuloCientifico = input.next();
					bajaArticuloCientifico(arregloArticuloCientifico, bajaArticuloCientifico);
				}
				break;
			}

			case 6: {
				String titulo = "";
				String fechaPublicacion = "";
				int opcionPub;
				System.out.println("Que clase de publicacion quiere modificar?" + "\n1.Libro" + "\n2.Revista"
						+ "\n3.Articulo Cientifico");
				opcionPub = input.nextInt();
				if (opcionPub == 1) {
					System.out.println("Ingrese el titulo del libro a modificar:");
					String tituloActual = input.next();
					System.out.println(
							"Ingrese el dato que desea modificar:" + "\n1.Titulo" + "\n2.Fecha de publicacion");
					opcionPub = input.nextInt();
					if (opcionPub == 1) {
						System.out.println("Ingrese el nuevo titulo:");
						titulo = input.next();
					} else {
						System.out.println("Ingrese la nueva fecha de publicacion:");
						fechaPublicacion = input.next();
					}
					modificarLibro(arregloLibro, tituloActual, titulo, fechaPublicacion, opcionPub);
				} else if (opcionPub == 2) {
					System.out.println("Ingrese el titulo de la revista a modificar:");
					String tituloActual = input.next();
					System.out
							.println("Ingrese el dato que desea modificar:" + "\n1.Titulo" + "\nFecha de publicacion");
					opcionPub = input.nextInt();
					if (opcionPub == 1) {
						System.out.println("Ingrese el nuevo titulo:");
						titulo = input.next();
					} else {
						System.out.println("Ingrese la nueva fecha de publicacion:");
						fechaPublicacion = input.next();
					}
					modificarRevista(arregloRevista, tituloActual, titulo, fechaPublicacion, opcionPub);
				} else if (opcionPub == 3) {
					System.out.println("Ingrese el titulo del articulo cientifico a modificar:");
					String tituloActual = input.next();
					System.out
							.println("Ingrese el dato que desea modificar:" + "\n1.Titulo" + "\nFecha de publicacion");
					opcionPub = input.nextInt();
					if (opcionPub == 1) {
						System.out.println("Ingrese el nuevo titulo:");
						titulo = input.next();
					} else {
						System.out.println("Ingrese la nueva fecha de publicacion:");
						fechaPublicacion = input.next();
					}
					modificarArticuloCientifico(arregloArticuloCientifico, tituloActual, titulo, fechaPublicacion,
							opcionPub);
				}
				break;
			}
			}

		} while (opcion != 7);

	}

	public static void pedirLibro(Libro[] ar, Libro a, String t, String f, String is, int c) {
		a.setTitulo(t);
		a.setFechaPublicacion(f);
		a.setIsbn(is);
		a.setCantidadPags(c);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Libro(t, f, is, c);
				break;
			}
		}
	}

	public static void pedirRevista(Revista[] ar, Revista a, String t, String f, int n, String e) {
		a.setTitulo(t);
		a.setFechaPublicacion(f);
		a.setNumeroEdicion(n);
		a.setEditorial(e);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Revista(t, f, n, e);
				break;
			}
		}
	}

	public static void pedirArticuloCientifico(ArticuloCientifico[] ar, ArticuloCientifico a, String t, String f,
			String area, String d) {
		a.setTitulo(t);
		a.setFechaPublicacion(f);
		a.setAreaInvestigacion(area);
		a.setDoi(d);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new ArticuloCientifico(t, f, area, d);
				break;
			}
		}
	}

	public static void mostrarLibro(Libro[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Libro: " + "Pos Nroº " + i + " Titulo: " + ar[i].getTitulo()
						+ " Fecha publicacion: " + ar[i].getFechaPublicacion() + " ISBN: " + ar[i].getIsbn()
						+ " Cantidad de paginas: " + ar[i].getCantidadPags());
			}
		}
	}

	public static void mostrarRevista(Revista[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Revista: " + "Pos Nroº " + i + " Titulo: " + ar[i].getTitulo()
						+ " Fecha publicacion: " + ar[i].getFechaPublicacion() + " Numero edicion: "
						+ ar[i].getNumeroEdicion() + " Editorial: " + ar[i].getEditorial());
			}
		}
	}

	public static void mostrarArticuloCientifico(ArticuloCientifico[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Articulo cientifico: " + "Pos Nroº " + i + " Titulo: " + ar[i].getTitulo()
						+ " Fecha publicacion: " + ar[i].getFechaPublicacion() + " Area de investigacion: "
						+ ar[i].getAreaInvestigacion() + " DOI: " + ar[i].getDoi());
			}
		}
	}

	public static void bajaLibro(Libro[] ar, String titulo) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getTitulo().equals(titulo)) {
				ar[i] = null;
				System.out.println("Articulo borrado!");
				break;
			}
		}
	}

	public static void bajaRevista(Revista[] ar, String titulo) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getTitulo().equals(titulo)) {
				ar[i] = null;
				System.out.println("Articulo borrado!");
				break;
			}
		}
	}

	public static void bajaArticuloCientifico(ArticuloCientifico[] ar, String titulo) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getTitulo().equals(titulo)) {
				ar[i] = null;
				System.out.println("Articulo borrado!");
				break;
			}
		}
	}

	public static void modificarLibro(Libro[] ar, String tituloActual, String tituloAModificar,
			String fechaPublicacionAModificar, int opcion) {
		System.out.println("Articulo modificado: " + tituloActual + "\n");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getTitulo().equals(tituloActual)) {
				if (opcion == 1) {
					ar[i].setTitulo(tituloAModificar);
				} else if (opcion == 2) {
					ar[i].setFechaPublicacion(fechaPublicacionAModificar);
				}
				break;
			}
		}
	}

	public static void modificarRevista(Revista[] ar, String tituloActual, String tituloAModificar,
			String fechaPublicacionAModificar, int opcion) {
		System.out.println("Articulo modificado: " + tituloActual + "\n");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getTitulo().equals(tituloActual)) {
				if (opcion == 1) {
					ar[i].setTitulo(tituloAModificar);
				} else if (opcion == 2) {
					ar[i].setFechaPublicacion(fechaPublicacionAModificar);
				}
				break;
			}
		}
	}

	public static void modificarArticuloCientifico(ArticuloCientifico[] ar, String tituloActual,
			String tituloAModificar, String fechaPublicacionAModificar, int opcion) {
		System.out.println("Articulo modificado: " + tituloActual + "\n");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getTitulo().equals(tituloActual)) {
				if (opcion == 1) {
					ar[i].setTitulo(tituloAModificar);
				} else if (opcion == 2) {
					ar[i].setFechaPublicacion(fechaPublicacionAModificar);
				}
				break;
			}
		}
	}
}
