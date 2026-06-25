package Practicos;

import java.util.Scanner;

public class GestorAuto {

	public static void main(String[] args) {

		autoo auto1 = new autoo(0, null);
		autoo arregloAutos[] = new autoo[10];

		Scanner lector = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("Bienvenido al programita");
			System.out.println("1.Alta de Auto");
			System.out.println("2.Listar los autos");
			System.out.println("3. Borrar auto");
			System.out.println("4. Modificar");
			System.out.println("5. Salir");
			System.out.println("Ingresar la opcion");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1: {
				// Alta de auto
				System.out.println("Ingresa nro chasis:");
				int nro = lector.nextInt();
				System.out.println("Ingresa marca:");
				String marca = lector.next();
				System.out.println("Datos ingresados correctamente.");
				altaAutos(arregloAutos, auto1, nro, marca);
				break;
			}
			case 2: {
				// Listado de autos
				listarAutos(arregloAutos);
				break;
			}
			case 3: {
				System.out.println("Ingresa el Chasis del auto a borrar");
				int bajaChasis = lector.nextInt();
				bajaAutos(arregloAutos, bajaChasis);
				break;
			}
			case 4:
				// modificar autos
				int p = 0;
				String m = "";
				System.out.println("Ingresa el Nro de  Chasis del auto a modificar: ");
				int chasisActual = lector.nextInt();
				System.out.println("Ingrese el dato que deseas modificar:");
				System.out.println("1. Chasis");
				System.out.println("2. Marca");
				int datoAModificar = lector.nextInt();
				if (datoAModificar == 1) {
					System.out.println("Ingresa nuevo Chasis: ");
					p = lector.nextInt();
				} else {
					System.out.println("Ingresa nueva marca:");
					m = lector.next();
				}
				modificarAuto(arregloAutos, chasisActual, datoAModificar, p, m);
				
				break;

			default:
				System.out.println("Error");
			}
		} while (opcion != 5);

	}

	public static void altaAutos(autoo[] ar, autoo a, int n, String m) {
		// a.setNroChasis(n);
		// a.setMarca(m);

		if (m.length() > 2) {

			for (int i = 0; i < ar.length; i++) {

				if (ar[i] == null) {

					ar[i] = new autoo(n, m);
					System.out.println("Guardó");
					break;

				}
			}
		} else {
			System.out.println("Marca de menos de 2 carcateres ");
		}
	}

	public static void listarAutos(autoo[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {
				System.out.println("Pos. N°" + i + "Chasis: " + a[i].getNroChasis() + " Marca: " + a[i].getMarca());

			}
		}

	}

	public static void bajaAutos(autoo[] a, int bajaChasis) {

		for (int i = 0; i < a.length; i++) {

			if (a[i].getNroChasis() == bajaChasis) {
				a[i] = null;
				System.out.println("Auto borrado.");
			}
			break;

		}
	}

	public static boolean chequearExistencia(int nroChasis, autoo[] a) {
		boolean existe = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNroChasis() == nroChasis) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	public static void modificarAuto(autoo[] a, int chasisActual, int datoAModificar, int nuevoChasis,
			String marcaAModificar) {
		
		System.out.println("Auto modificado: " + chasisActual);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNroChasis() == chasisActual) {
				
				if (datoAModificar == 1 && !chequearExistencia(nuevoChasis, a)) {
					a[i].setNroChasis(nuevoChasis);
				
					
			} else {
				
				a[i].setMarca(marcaAModificar);
				break;
			}
		}
	}

}
}

