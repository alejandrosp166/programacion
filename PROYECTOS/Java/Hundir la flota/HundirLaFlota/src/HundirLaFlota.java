import java.util.Scanner;
//ALEJANDRO SECO PINEDA 1ºDAM
public class HundirLaFlota {

	private static int puntosUsuario = 24;
	private static int puntosOrdenador = 24;

	public static void main(String[] args) {

		String tUsuario[][] = new String[10][10];
		String tOrdenador[][] = new String[10][10];
		Scanner sn = new Scanner(System.in);
		boolean turno = true; // USAMOS ESTA VARIABLE PARA SABER A QUE JUGADOR LE TOCA / TRUE -> Usuario FALSE -> Ordenador
		boolean turnoMostrarMenu = false; // USAMOS ESTA VARIABLE PARA SABER QUE TABLERO TIENE QUE PINTAR LA FUNCIÓN mostrarTablero
		//ESTAS 4 VARIABLES GUARDAN LAS JUGADAS DEL USUARIO Y ORDENADOR
		int yUsuario = 0;
		int xUsuario = 0;
		int yOrdenador = 0;
		int xOrdenador = 0;
		String jugadaUsuario = "";

		rellenarTablero(tUsuario);
		rellenarTablero(tOrdenador);

		System.out.println("MAPA DEL ORDENADOR\n");
		mostrarTablero(tOrdenador, turnoMostrarMenu);
		turnoMostrarMenu = true;
		System.out.println("\nPUNTOS DEL ORDENADOR -> " + puntosOrdenador + "\n");

		System.out.println("MAPA DEL USUARIO\n");
		mostrarTablero(tUsuario, turnoMostrarMenu);
		turnoMostrarMenu = false;
		System.out.println("\nPUNTOS DEL USUARIO -> " + puntosUsuario);

		while (puntosUsuario > 0 && puntosOrdenador > 0) {

			System.out.println("\nTURNO DEL USUARIO:\nIntroduzca una casilla (ejemplo: A2)-> ");
			jugadaUsuario = sn.next();
			// ESTE BUCLE VALIDA LOS DATOS INTRODUCIDOS POR EL USUARIO, SI NO CUMPLE EL
			// FORMATO NOS LOS VUELVE A PEDIR, EL MÉTODO MATCHES USA EXPRESIONES REGULARES PARA QUE NO PODAMOS POR EJEMPLO HACER 1A o AA
			while (jugadaUsuario.length() != 2 || jugadaUsuario.substring(1, 2).matches("[+-]?\\d*(\\.\\d+)?") == false
					|| jugadaUsuario.substring(0, 1).matches("[+-]?\\d*(\\.\\d+)?") == true) {
				System.out.println("FORMATO DE DATOS ERRÓNEO, POR FAVOR VUELVA A INTRODUCIR LOS DATOS (ejemplo: A2 o a2)");
				jugadaUsuario = sn.next();
			}

			yUsuario = Integer.parseInt(jugadaUsuario.substring(1, 2));
			xUsuario = cambiarLetraANumeroUsuario(jugadaUsuario);

			yOrdenador = (int) (Math.random() * 10);
			xOrdenador = (int) (Math.random() * 10);

			tOrdenador = comprobarBomba(tOrdenador, xUsuario, yUsuario, turno); // SE COMPRUEBA DONDE TIRÓ LA BOMBA EL USUARIO
			turno = false;

			System.out.println("MAPA DEL ORDENADOR\n");
			mostrarTablero(tOrdenador, turnoMostrarMenu);
			turnoMostrarMenu = true;
			System.out.println("\nPUNTOS DEL ORDENADOR -> " + puntosOrdenador + "\n");
			System.out.println("TURNO DEL ORDENADOR:");

			tUsuario = comprobarBomba(tUsuario, xOrdenador, yOrdenador, turno); // SE COMPRUEBA DONDE TIRÓ LA BOMBA EL ORDENADOR
			turno = true;

			System.out.println("MAPA DEL USUARIO\n");
			mostrarTablero(tUsuario, turnoMostrarMenu);
			turnoMostrarMenu = false;
			System.out.println("\nPUNTOS DEL USUARIO -> " + puntosUsuario);
		}

		if (puntosUsuario == 0) {
			System.out.println("EL GANADOR DE LA PARTIDA FUE EL ORDENADOR");
		} else {
			System.out.println("ENHORABUENA HAS GANADO LA PARTIDA");
		}

		sn.close();
	}

	// COMPROBACIÓN DE DONDE CAE LA BOMBA, ADEMÁS DE RESTAR LOS PUNTOS
	public static String[][] comprobarBomba(String tablero[][], int x, int y, boolean turno) {

		if (tablero[x][y].trim().equals("5") || tablero[x][y].trim().equals("3") || tablero[x][y].trim().equals("1")) {

			if (turno == true) {
				System.out.println("BARCO ALCANZADO TURNO DEL ORDENADOR\n");
				puntosOrdenador--;
			} else {
				System.out.println("BARCO ALCANZADO " + "(" + cambiarNumeroALetraOrdenador(x) + y + ")" + " TURNO DEL USUARIO\n");
				puntosUsuario--;
			}
		} else if (tablero[x][y].trim().equals("*")) {

			if (turno == true) {
				System.out.println("LA BOMBA TOCÓ AGUA TURNO DEL ORDENADOR");
			} else {
				System.out.println("LA BOMBA TOCÓ AGUA " + "(" + cambiarNumeroALetraOrdenador(x) + y + ")" + " TURNO DEL USUARIO\n");
			}
		} else {
			if (turno == true) {
				System.out.println("YA HAS TIRADO UNA BOMBA AHÍ, PIERDES TURNO\nTURNO DEL ORDENADOR");
			} else {
				System.out.println("EL ORDENADOR YA HA TIRADO UNA BOMBA EN ESA POSICIÓN " + "("+ cambiarNumeroALetraOrdenador(x) + y + ")" + "\nTURNO DEL USUARIO");
			}
		}

		tablero[x][y] = "X   ";
		return tablero;
	}

	// MOSTRAR TABLERO DE LOS JUGADORES
	public static void mostrarTablero(String tablero[][], boolean turno) {
		// CON ESTES BUCLE PRIMERO PINTAMOS LOS NÚMERO SUPERIORES DEL TABLERO DEL 0 AL 9
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				System.out.print("   ");
			}
			System.out.print("[" + i + "] ");
		}
		System.out.println("");
		// CON ESTE BULCE PINTAMOS LAS LETRAS Y LO QUE VAYA DENTRO DEL TABLERO
		char letra = 'A';
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + letra + "] ");
			letra++;// SUMAMOS ESTA VARIABLE PARA QUE LAS LETRAS SEAN MÁS FÁCILES DE IMPRIMIR
			for (int j = 0; j < 10; j++) {
				if (turno == false) { // CON ESTE IF FILTRAMOS QUE TABLERO SE DEBE IMPRIMIR
					if (tablero[i][j].trim().equalsIgnoreCase("x")) {
						System.out.print("X   ");
					} else {
						System.out.print("*   ");
					}
				} else {
					System.out.print(tablero[i][j]);
				}
			}
			System.out.println("");
		}
	}

	// RELLENAR EL TABLERO DE LOS JUGADORES
	public static String[][] rellenarTablero(String tablero[][]) {
		// ESTE BUCLE SIRVE PARA RELLENAR LOS BARCOS DE *
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tablero[i][j] = "*   ";
			}
		}

		int hoVe = (int) (Math.random() * 2);// Esta varible decide si el barco se genera en "0" horizontal "1" vertical
		int v = (int) (Math.random() * 10); // CONTROLA COLUMNAS (vertical)
		int h = (int) (Math.random() * 10); // CONTROLA LAS FILAS (horizontal)

		// ESTA CONDICIÓN SIRVE PARA DECIDIR COMO SE IMPRIMIRÁ EL PRIMER BARCO DE 5
		if (hoVe == 0) {
			v = (int) (Math.random() * 6);
		} else if (hoVe == 1) {
			h = (int) (Math.random() * 6);
		}

		// ESTE BUCLE GENERA LOS BARCOS
		boolean pisar = true; // Esta variable sirve para saber si estamos "pisando un barco"
		for (int i = 0; i <= 24; i++) {
			if (i < 10) { // SI ENTRA AQUÍ PINTARÁ BARCOS DE 5

				if (hoVe == 0) {
					// ESTE BUCLE BUSCA UNA POSICIÓN VÁLIDA PARA EL BARCO
					while (pisar == true) {
						if (tablero[h][v].trim().equals("*") && tablero[h][v + 1].trim().equals("*")
								&& tablero[h][v + 2].trim().equals("*") && tablero[h][v + 3].trim().equals("*")
								&& tablero[h][v + 4].trim().equals("*")) {
							pisar = false;
						} else {
							h = (int) (Math.random() * 10);
						}
					}
					tablero[h][v] = "5   "; // Y POR ÚLTIMO LO IMPRIME EN LA POSICIÓN
					v++; // SUMAMOS ESTA VARIABLE PARA EL SIGUIENTE CICLO
				} else if (hoVe == 1) {
					// ESTE BUCLE ES UN ESPEJO DEL ANTERIOR PERO PARA PINTAR LOS BARCOS EN VERTICAL
					while (pisar == true) {
						if (tablero[h][v].trim().equals("*") && tablero[h + 1][v].trim().equals("*")
								&& tablero[h + 2][v].trim().equals("*") && tablero[h + 3][v].trim().equals("*")
								&& tablero[h + 4][v].trim().equals("*")) {
							pisar = false;
						} else {
							v = (int) (Math.random() * 10);
						}
					}
					tablero[h][v] = "5   ";
					h++;
				}

			} else if (i > 10 && i < 20) { // SI ENTRA AQUÍ PINTARÁ BARCOS DE 3

				if (hoVe == 0) {
					// ES LOS MISMO QUE LOS BUCLES ANTERIORES PERO ADADTADO PARA QUE PINTE BARCOS DE 3
					while (pisar == true) {
						if (tablero[h][v].trim().equals("*") && tablero[h][v + 1].trim().equals("*")
								&& tablero[h][v + 2].trim().equals("*")) {
							pisar = false;
						} else {
							h = (int) (Math.random() * 10);
						}
					}
					tablero[h][v] = "3   ";
					v++;
				} else if (hoVe == 1) {

					while (pisar == true) {
						if (tablero[h][v].trim().equals("*") && tablero[h + 1][v].trim().equals("*")
								&& tablero[h + 2][v].trim().equals("*")) {
							pisar = false;
						} else {
							v = (int) (Math.random() * 10);
						}
					}
					tablero[h][v] = "3   ";
					h++;
				}

			} else if (i >= 19) { // SI ENTRA AQUÍ PINTARÁ BARCOS DE 1

				while (pisar == true) {
					if (tablero[h][v].trim().equals("*")) {
						tablero[h][v] = "1   ";
						pisar = false;
					} else {
						v = (int) (Math.random() * 10);
						h = (int) (Math.random() * 10);
					}
				}
				pisar = true;
			}
			// ESTE CONDICIONAL REINICIA LAS VARIABLES Y BUSCA UN LUGAR NUEVO PARA EL BARCO
			if (i == 4 || i == 10 || i == 13 || i == 16 || i >= 19) {// ESTAS CONDICIONES SON LAS VECES EN LAS CUALES PINTAREMOS UN BARCO NUEVO

				v = (int) (Math.random() * 10);
				h = (int) (Math.random() * 10);
				hoVe = (int) (Math.random() * 2);
				pisar = true;

				if (i == 4) { // CICLO DE DECIDE DONDE PONER EL 2º BARCO DE 5

					if (hoVe == 0) {
						v = (int) (Math.random() * 6);
					} else if (hoVe == 1) {
						h = (int) (Math.random() * 6);
					}

				} else if (i == 10 || i == 13 || i == 16) { // CICLO DE DECIDE DONDE PONER LOS 3 BARCOS DE 3

					if (hoVe == 0) {
						v = (int) (Math.random() * 8);
					} else if (hoVe == 1) {
						h = (int) (Math.random() * 8);
					}
				}

			}
		}
		return tablero;
	}

	// CAMBIAMOS LA LETRA QUE METE EL USUARIO A UN NÚMERO PARA QUE PUEDA SER OPERADO
	public static int cambiarLetraANumeroUsuario(String jugada) {
		char lt1 = 'a';// a EN ASCII ES 97
		int c = 0;

		while (lt1 <= 'j') {// j EN ASCII ES 106
			String lt2 = String.valueOf(lt1); // PASAMOS EL CHAR A STRING CON ESTA FUNCIÓN
			if (lt2.equals(jugada.substring(0, 1).toLowerCase())) { // LO COMPARAMOS CON LA X DEL USUARIO
				return c; // DEVOLVEMOS UN NÚMERO DEL 0 AL 9
			}
			lt1++;
			c++;
		}
		return -1;
	}

	// CAMBIAMOS LA CORDENADA X DEL ORDENADOR A UNA LETRA PARA SABER DONDE A CAIDO Y
	// PODER IMPRIMIRLO EN PANTALLA
	public static char cambiarNumeroALetraOrdenador(int x) {
		char lt1 = 'a';

		for (int i = 0; i < 9; i++) {
			if (i == x) {
				return lt1;
			}
			lt1++;
		}
		return '~';
	}
}