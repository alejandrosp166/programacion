package Ejericicio7;

import java.util.*;

public class ProgramaDisco {

	public static void main(String[] args) {
		Disco[] discos = new Disco[100];
		Scanner sn = new Scanner(System.in);
		int contDiscos = 0;
		String cod = "";
		boolean entrarIf;
		boolean salir = false;

		while (!salir) {

			System.out.println("---COLECCIÓN DE DISCOS---");
			System.out.println("=========================");
			System.out.println("(1) Listado.");
			System.out.println("(2) Nuevo disco.");
			System.out.println("(3) Modificar.");
			System.out.println("(4) Borrar disco.");
			System.out.println("(5) Salir del programa.");
			System.out.println("=========================");

			String opc = sn.nextLine();

			switch (opc) {

			case "1":
				if (contDiscos - 1 >= 0) {
					for (int i = 0; i < contDiscos; i++) {
						if (!(discos[i].getCodigo().equalsIgnoreCase("LIBRE"))) {
							System.out.println(discos[i].toString());
						}
					}
				} else {
					System.out.println("No hay discos almacenados dentro del sistema\n");
				}
				break;

			case "2":

				if (contDiscos < 100) {

					discos[contDiscos] = new Disco();

					System.out.println("Dame el título del nuevo disco: ");
					discos[contDiscos].setTitulo(sn.nextLine());

					System.out.println("Dame el autor del nuevo disco: ");
					discos[contDiscos].setAutor(sn.nextLine());

					System.out.println("Dame el género del nuevo disco: ");
					discos[contDiscos].setGenero(sn.nextLine());

					boolean correcto = false;
					while (!correcto) {
						System.out.println("Dame la código del nuevo disco: ");
						cod = sn.nextLine();
						correcto = true;
						
						for (int x = 0; x < contDiscos; x++) {
							if (discos[x].getCodigo().equalsIgnoreCase(cod)) {
								correcto = false;
								break;
							}
						}
					}
					discos[contDiscos].setCodigo(cod);

					System.out.println("Dame la duración del nuevo disco: ");
					discos[contDiscos].setDuracion(sn.nextDouble());

					sn.nextLine();
					contDiscos++;
				} else {
					System.out.println("El límite del almacenamiento ha llegado al máximo\n");
				}

				break;

			case "3":
				System.out.println("Dame el código del disco que quieres modificar: ");

				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < contDiscos; i++) {
					if (discos[i].getCodigo().equalsIgnoreCase(cod) && entrarIf == false) {

						entrarIf = true;

						System.out.println("Dame el nuevo título del disco: ");
						discos[i].setTitulo(sn.nextLine());

						System.out.println("Dame el nuevo autor del disco: ");
						discos[i].setAutor(sn.nextLine());

						System.out.println("Dame el nuevo género del disco: ");
						discos[i].setGenero(sn.nextLine());

						System.out.println("Dame la nueva duración del disco: ");
						discos[i].setDuracion(sn.nextDouble());
						sn.nextLine();
					}
				}

				if (!entrarIf) {
					System.out.println("No se encontró un disco con esas carácterísticas");
				}
				break;

			case "4":
				System.out.println("Dame el código del disco que quieres borrar");

				cod = sn.nextLine();
				entrarIf = false;

				for (int i = 0; i < contDiscos; i++) {
					if (discos[i].getCodigo().equalsIgnoreCase(cod) && entrarIf == false) {

						entrarIf = true;
						discos[i].setCodigo("Libre");
						discos[i].setAutor("");
						discos[i].setDuracion(0);
						discos[i].setGenero("");
						discos[i].setTitulo("");

						ordenarArray(contDiscos, discos);
						contDiscos--;
					}
				}

				if (!entrarIf) {
					System.out.println("No se encontró un disco con esas carácterísticas\n");
				}
				break;
			case "5":
				salir = true;
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("ERROR -> COMANDO DESCONOCIDO");
			}
		}

		sn.close();
	}

	public static void ordenarArray(int contDiscos, Disco[] discos) {
		Disco aux = new Disco();
		for (int i = 1; i < contDiscos; i++) {
			if (discos[i - 1].getCodigo().equalsIgnoreCase("libre")) {
				aux = discos[i - 1];
				discos[i - 1] = discos[i];
				discos[i] = aux;
			}
		}
	}
}