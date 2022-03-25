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
			System.out.println("- 4. Modificación      -");
			System.out.println("- 5. Entrada Mercancía -");
			System.out.println("- 6. Salida Mercancía  -");
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
					System.out.println("No hay artículos en el almacen");
				}
				break;
			case "2":
				if (numsArticulos < 100) {
					articulo[numsArticulos] = new Articulo();

					articulo[numsArticulos].setCodigo(codigoRepetido(numsArticulos, articulo, sn));

					System.out.println("Dame la descripción del nuevo artículo: ");
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
					System.out.println("El límite de los artículo ha legado al máximo");
				}
				break;
			case "3":
				System.out.println("Dame el código del árticulo que quieres borrar");
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
					System.out.println("No se encontró un artículo con esas características");
				}
				break;
			case "4":
				System.out.println("Dame el código del articulo que quieres modificar: ");
				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < numsArticulos; i++) {
					if (articulo[i].getCodigo().equalsIgnoreCase(cod)) {
						entrarIf = true;
						System.out.println("Dime que característica quieres modificar: ");
						System.out.println("-----------------------");
						System.out.println("-1. Código            -");
						System.out.println("-2. Descripción       -");
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
							System.out.println("Dame la nueva descripción del artículo: ");
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
					System.out.println("No se encontró un artículo con ese código.");
				}
				break;
			case "5":
				System.out.println("Dame el código del artículo al cual quieres añadir stock");
				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < numsArticulos; i++) {
					if (articulo[i].getCodigo().equalsIgnoreCase(cod)) {
						entrarIf = true;

						System.out.println("Cuanto stock quieres añadir: ");
						articulo[i].setStock(articulo[i].getStock() + sn.nextInt());
						System.out.println("El stock se aumentó con exíto a: " + articulo[i].getStock());
						sn.nextLine();
					}
				}

				if (!entrarIf) {
					System.out.println("No se encontró un artículo con ese código.");
				}
				break;
			case "6":
				System.out.println("Dame el código del artículo al cual quieres deducir stock");
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
							System.out.println("El stock se dedució con exíto a: " + articulo[i].getStock());
						}
						sn.nextLine();
					}
				}

				if (!entrarIf) {
					System.out.println("No se encontró un artículo con ese código.");
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

	// ORDENA EL ARRAY CUANDO BORREMOS UN ARTÍCULO
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
	// SIRVE PARA COMPROBAR QUE EL CÓDIGO QUE ESTAMOS INTRODUCIENDO NO ESTÉ REPETIDO
	public static String codigoRepetido(int numsArticulos, final Articulo[] articulo, final Scanner sn) {
		boolean correcto = false;
		String cod = "";
		while (!correcto) {
			System.out.println("Dame un código de artículo válido (no puede estar repetido): ");
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
