package Ejercicio9;

import java.util.*;

public class ProgramaGestimal {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Articulo articulo[] = new Articulo[100];
		int numsArticulos = 0;
		String cod = "";
		boolean entrarIf;
		boolean salir = false;

		while (!salir) {
			System.out.println("------------------------");
			System.out.println("- 1. Listado           -");
			System.out.println("- 2. Alta              -");
			System.out.println("- 3. Baja              -");
			System.out.println("- 4. Modificaci�n      -");
			System.out.println("- 5. Entrada Mercanc�a -");
			System.out.println("- 6. Salida Mercanc�a  -");
			System.out.println("- 7. Salir             -");
			System.out.println("------------------------");

			String opc = sn.nextLine();
			switch (opc) {

			case "1":
				if (numsArticulos - 1 >= 0) {
					for (int i = 0; i < numsArticulos; i++) {
						System.out.println(articulo[i].toString());
					}
				} else {
					System.out.println("No hay art�culos en el almacen");
				}
				break;
			case "2":
				if (numsArticulos < 100) {
					articulo[numsArticulos] = new Articulo();

					articulo[numsArticulos].setCodigo(codigoRepetido(numsArticulos, articulo, sn));

					System.out.println("Dame la descripci�n del nuevo art�culo: ");
					articulo[numsArticulos].setDescripcion(sn.nextLine());

					System.out.println("Dame el precio de compra del producto: ");
					articulo[numsArticulos].setPrecioCompra(sn.nextDouble());

					System.out.println("Dame el precio venta del producto: ");
					articulo[numsArticulos].setPrecioVenta(sn.nextDouble());

					System.out.println("Dame el stock del producto: ");
					articulo[numsArticulos].setStock(sn.nextInt());

					numsArticulos++;
					sn.nextLine();
				} else {
					System.out.println("El l�mite de los art�culo ha legado al m�ximo");
				}
				break;
			case "3":
				System.out.println("Dame el c�digo del �rticulo que quieres borrar");
				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < numsArticulos; i++) {
					if (articulo[i].getCodigo().equalsIgnoreCase(cod)) {
						entrarIf = true;
						articulo[i].setCodigo("n");
						articulo[i].setDescripcion("n");
						articulo[i].setPrecioCompra(-1);
						articulo[i].setPrecioVenta(-1);
						articulo[i].setStock(-1);

						ordenarArray(numsArticulos, articulo);
						numsArticulos--;
					}
				}

				if (!entrarIf) {
					System.out.println("No se encontr� un art�culo con esas caracter�sticas");
				}
				break;
			case "4":
				System.out.println("Dame el c�digo del articulo que quieres modificar: ");
				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < numsArticulos; i++) {
					if (articulo[i].getCodigo().equalsIgnoreCase(cod)) {
						entrarIf = true;
						System.out.println("Dime que caracter�stica quieres modificar: ");
						System.out.println("-----------------------");
						System.out.println("-1. C�digo            -");
						System.out.println("-2. Descripci�n       -");
						System.out.println("-3. Precio Compra     -");
						System.out.println("-4. Precio Venta      -");
						System.out.println("-5. Stock             -");
						System.out.println("-----------------------");
						int opcMod = sn.nextInt();
						sn.nextLine();

						switch (opcMod) {

						case 1:
							articulo[i].setCodigo(codigoRepetido(numsArticulos, articulo, sn));
							break;
						case 2:
							System.out.println("Dame la nueva descripci�n del art�culo: ");
							articulo[i].setDescripcion(sn.nextLine());
							break;
						case 3:
							System.out.println("Dam el nuevo precio de compra: ");
							articulo[i].setPrecioCompra(sn.nextDouble());
							break;
						case 4:
							System.out.println("Dame el nuevo precio de compra: ");
							articulo[i].setPrecioVenta(sn.nextDouble());
							break;
						case 5:
							System.out.println("Dame el nuevo stock del producto: ");
							articulo[i].setStock(sn.nextInt());
							break;
						}
					}
				}
				if (!entrarIf) {
					System.out.println("No se encontr� un art�culo con ese c�digo.");
				}
				break;
			case "5":
				System.out.println("Dame el c�digo del art�culo al cual quieres a�adir stock");
				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < numsArticulos; i++) {
					if (articulo[i].getCodigo().equalsIgnoreCase(cod)) {
						entrarIf = true;

						System.out.println("Cuanto stock quieres a�adir: ");
						articulo[i].setStock(articulo[i].getStock() + sn.nextInt());
						System.out.println("El stock se aument� con ex�to a: " + articulo[i].getStock());
						sn.nextLine();
					}
				}

				if (!entrarIf) {
					System.out.println("No se encontr� un art�culo con ese c�digo.");
				}
				break;
			case "6":
				System.out.println("Dame el c�digo del art�culo al cual quieres deducir stock");
				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < numsArticulos; i++) {
					if (articulo[i].getCodigo().equals(cod)) {
						entrarIf = true;

						System.out.println("Cuanto stock quieres deducir: ");
						int stockDeducir = sn.nextInt();
						if ((articulo[i].getStock() - stockDeducir) < 0) {
							System.out.println("El stock de un producto no puede ser un valor negativo");
						} else {
							articulo[i].setStock(articulo[i].getStock() - stockDeducir);
							System.out.println("El stock se deduci� con ex�to a: " + articulo[i].getStock());
						}
						sn.nextLine();
					}
				}

				if (!entrarIf) {
					System.out.println("No se encontr� un art�culo con ese c�digo.");
				}
				break;
			case "7":
				salir = true;
				System.out.println("Saliendo del programa...");
				break;
			}
		}
		sn.close();
	}

	// ORDENA EL ARRAY CUANDO BORREMOS UN ART�CULO
	public static void ordenarArray(int numsArticulos, Articulo[] articulos) {
		Articulo aux = new Articulo();
		for (int i = 1; i < numsArticulos; i++) {
			if (articulos[i - 1].getCodigo().equalsIgnoreCase("n")) {
				aux = articulos[i - 1];
				articulos[i - 1] = articulos[i];
				articulos[i] = aux;
			}
		}
	}
	// SIRVE PARA COMPROBAR QUE EL C�DIGO QUE ESTAMOS INTRODUCIENDO NO EST� REPETIDO
	public static String codigoRepetido(int numsArticulos, final Articulo[] articulo, final Scanner sn) {
		boolean correcto = false;
		String cod = "";
		while (!correcto) {
			System.out.println("Dame un c�digo de art�culo v�lido (no puede estar repetido): ");
			cod = sn.nextLine();
			correcto = true;

			for (int x = 0; x < numsArticulos; x++) {
				if (articulo[x].getCodigo().equalsIgnoreCase(cod)) {
					correcto = false;
					break;
				}
			}
		}
		return cod;
	}
}
