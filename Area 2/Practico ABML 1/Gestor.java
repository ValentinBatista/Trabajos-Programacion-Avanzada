package Practicos;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Electronica electronica1 = new Electronica(null, 0, null, 0);
		Electronica arregloElectronica[] = new Electronica[10];

		Ropa ropa1 = new Ropa(null, 0, null, null);
		Ropa arregloRopa[] = new Ropa[10];

		Alimento alimento1 = new Alimento(null, 0, null, null);
		Alimento arregloAlimento[] = new Alimento[10];

		Scanner input = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("Ingrese una opcion: ");
			System.out.println("1.Ingresar producto electronico");
			System.out.println("2.Ingrese prenda de ropa");
			System.out.println("3.Ingrese alimento");
			System.out.println("4.Listar productos");
			System.out.println("5.Bajar productos");
			System.out.println("6.Modificar productos");
			System.out.println("7.Salir");
			opcion = input.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("Ingrese la id del producto: ");
				String idProducto = input.next();
				System.out.println("Ingrese el precio del producto: ");
				int precio = input.nextInt();
				System.out.println("Ingrese el tipo de dispositivo: ");
				String tipoDispositivo = input.next();
				System.out.println("Año de fabricacion: ");
				int yearFabricacion = input.nextInt();
				pedirElectronica(arregloElectronica, electronica1, idProducto, precio, tipoDispositivo,
						yearFabricacion);
				break;
			}

			case 2: {
				System.out.println("Ingrse la id del producto: ");
				String idProducto = input.next();
				System.out.println("Ingrese el precio del producto: ");
				int precio = input.nextInt();
				System.out.println("Ingrese talle: ");
				String talle = input.next();
				System.out.println("Ingrese el tipo de ropa: ");
				String tipoRopa = input.next();
				pedirRopa(arregloRopa, ropa1, idProducto, precio, talle, tipoRopa);
				break;
			}

			case 3: {
				System.out.println("Ingrese la id del producto: ");
				String idProducto = input.next();
				System.out.println("Ingrese el precio del producto: ");
				int precio = input.nextInt();
				System.out.println("Ingrese la fecha de caducidad: ");
				String fechaCaducidad = input.next();
				System.out.println("Ingrese el tipo de alimento: ");
				String tipoAlimento = input.next();
				pedirAlimento(arregloAlimento, alimento1, idProducto, precio, fechaCaducidad, tipoAlimento);
				break;
			}

			case 4: {
				mostrarElectronica(arregloElectronica);
				mostrarRopa(arregloRopa);
				mostrarAlimento(arregloAlimento);
				break;
			}

			case 5: {
				System.out.println(
						"Que clase de producto quiere borrar?" + "\n1.Electronico" + "\n2.Ropa" + "\n3.Alimento");
				int baja = input.nextInt();
				if (baja == 1) {
					System.out.println("Ingresa la id del electronico a borrar:");
					String bajaId = input.next();
					bajaElectronica(arregloElectronica, bajaId);
				}
				if (baja == 2) {
					System.out.println("Ingresa la id de la prenda de ropa a borrar:");
					String bajaId = input.next();
					bajaRopa(arregloRopa, bajaId);
				}
				if (baja == 3) {
					System.out.println("Ingresa la id del alimento a borrar:");
					String bajaId = input.next();
					bajaAlimento(arregloAlimento, bajaId);
				} else {
					System.out.println("Ingrese una opcion valida\n");
				}
				break;
			}

			case 6: {
				int precio = 0;
				String id = "";
				int opcionMod;
				System.out.println(
						"Que clase de producto quiere modificar?" + "\n1.Electronico" + "\n2.Ropa" + "\n3.Alimento");
				opcionMod = input.nextInt();
				if (opcionMod == 1) {
					System.out.println("Ingresa la id del electronico a modificar:");
					String idActual = input.next();
					System.out.println("Ingrese el dato que desea modificar:" + "\n1.Id" + "\n2.Precio");
					opcionMod = input.nextInt();
					if (opcionMod == 1) {
						System.out.println("Ingresa la nueva id:");
						id = input.next();
					} else {
						System.out.println("Ingrese el nuevo precio:");
						precio = input.nextInt();
					}
					modificarElectronica(arregloElectronica, idActual, id, precio, opcionMod);
				} else if (opcionMod == 2) {
					System.out.println("Ingresa la id de la prenda de ropa a modificar:");
					String idActual = input.next();
					System.out.println("Ingrese el dato que desea modificar:" + "\n1.Id" + "\n2.Precio");
					opcionMod = input.nextInt();
					if (opcionMod == 1) {
						System.out.println("Ingresa la nueva id:");
						id = input.next();
					} else {
						System.out.println("Ingrese el nuevo precio:");
						precio = input.nextInt();
					}
					modificarRopa(arregloRopa, idActual, id, precio, opcionMod);
				} else if (opcionMod == 3) {
					System.out.println("Ingresa la id del alimento a modificar:");
					String idActual = input.next();
					System.out.println("Ingrese el dato que desea modificar:" + "\n1.Id" + "\n2.Precio");
					opcionMod = input.nextInt();
					if (opcionMod == 1) {
						System.out.println("Ingresa la nueva id:");
						id = input.next();
					} else {
						System.out.println("Ingrese el nuevo precio:");
						precio = input.nextInt();
					}
					modificarAlimento(arregloAlimento, idActual, id, precio, opcionMod);
				}
				break;
			}
			}

		} while (opcion != 7);

	}

	public static void pedirElectronica(Electronica[] ar, Electronica a, String id, int p, String d, int y) {
		a.setId(id);
		a.setPrecio(p);
		a.setDispositivo(d);
		a.setYearFabricacion(y);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Electronica(id, p, d, y);
				break;
			}
		}

	}

	public static void pedirRopa(Ropa[] ar, Ropa a, String id, int p, String t, String ti) {
		a.setId(id);
		a.setPrecio(p);
		a.setTalle(t);
		a.setTipoRopa(ti);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Ropa(id, p, t, ti);
				break;
			}
		}
	}

	public static void pedirAlimento(Alimento[] ar, Alimento a, String id, int p, String f, String tip) {
		a.setId(id);
		a.setPrecio(p);
		a.setFechaCaducidad(f);
		a.setTipoAlimento(tip);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Alimento(id, p, f, tip);
				break;
			}
		}
	}

	public static void mostrarElectronica(Electronica[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Electronico: " + "Pos. Nroº" + i + " Id: " + ar[i].getId() + " Precio: "
						+ ar[i].getPrecio() + " Dispositivo: " + ar[i].getDispositivo() + " Año fabricacion: "
						+ ar[i].getYearFabricacion());
			}
		}
	}

	public static void mostrarRopa(Ropa[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Ropa: " + "Pos. Nroº" + i + " Id: " + ar[i].getId() + " Precio: "
						+ ar[i].getPrecio() + " Talle: " + ar[i].getTalle() + " Tipo de ropa: " + ar[i].getTipoRopa());
			}
		}

	}

	public static void mostrarAlimento(Alimento[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println("Alimento: " + "Pos. Nroº" + i + " Id: " + ar[i].getId() + " Precio: "
						+ ar[i].getPrecio() + " Fecha de caducidad: " + ar[i].getFechaCaducidad()
						+ " Tipo de alimento: " + ar[i].getTipoAlimento());
			}
		}
	}

	public static void bajaElectronica(Electronica[] ar, String bajaId) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i].getId().equals(bajaId)) {
				ar[i] = null;
				System.out.println("Producto borrado!");
				break;
			}
		}
	}

	public static void bajaRopa(Ropa[] ar, String bajaId) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i].getId().equals(bajaId)) {
				ar[i] = null;
				System.out.println("Producto borrado!");
				break;
			}

		}
	}

	public static void bajaAlimento(Alimento[] ar, String bajaId) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].getId().equals(bajaId)) {
				ar[i] = null;
				System.out.println("Producto borrado!");
				break;
			}
		}
	}

	public static void modificarElectronica(Electronica[] ar, String idActual, String idAModificar,
			int precioAModificar, int opcionMod) {
		System.out.println("Producto modificado: " + idActual + "\n");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getId().equals(idActual)) {
				if (opcionMod == 1) {
					ar[i].setId(idAModificar);
				} else if (opcionMod == 2) {
					ar[i].setPrecio(precioAModificar);
				}
				break;
			}
		}
	}

	public static void modificarRopa(Ropa[] ar, String idActual, String idAModificar, int precioAModificar,
			int opcionMod) {
		System.out.println("Producto modificado: " + idActual);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getId().equals(idActual)) {
				if (opcionMod == 1) {
					ar[i].setId(idAModificar);
				} else if (opcionMod == 2) {
					ar[i].setPrecio(precioAModificar);
				}
				break;
			}
		}
	}

	public static void modificarAlimento(Alimento[] ar, String idActual, String idAModificar, int precioAModificar,
			int opcionMod) {
		System.out.println("Producto modificado: " + idActual);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getId().equals(idActual)) {
				if (opcionMod == 1) {
					ar[i].setId(idAModificar);
				} else if (opcionMod == 2) {
					ar[i].setPrecio(precioAModificar);
				}
				break;
			}
		}
	}
}