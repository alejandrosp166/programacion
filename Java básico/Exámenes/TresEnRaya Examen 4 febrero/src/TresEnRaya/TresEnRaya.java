package TresEnRaya;

import java.util.Scanner;

public class TresEnRaya {
	
	public static int o1 = 0, o2 = 0, o3 = 0;//No he sabido como usar estas variables 
	public static int x1 = 0, x2 = 0, x3 = 0;
	
	public static void main(String[] args) {
		int[] tablero = new int[9];
		Scanner sn = new Scanner(System.in);

		boolean jugar=true;//Sirve para sabr si podemos volver a jugar otra partida
		int validar = 0; //Sirve para validar la jugada del ordenador y además controlamos la partida con ella
		System.out.println("BIENVENIDO AL JUEGO DEL TRES EN RAYA");

		while(jugar==true) {
			while (validar != -1) {
				
				imprimeTablero(tablero);

				System.out.println("\nTu turno\n");
				System.out.println("Elije donde quieres colocar la ficha: ");
				
				boolean pintar = false;//Sirve para pedir los datos del usuario de manera infinita
				String jUsuario = sn.nextLine();
				
				while (pintar == false) {

					if (usuarioMueveFicha(tablero, jUsuario)) {
						imprimeTablero(tablero);
						pintar = true;
					} else {
						System.out.println("Movimiento no válido vuelve a darme la jugada: ");
						jUsuario = sn.nextLine();
					}
				}
				
				if(ganaUsuario(o1, o2, o3, tablero)) {//Validamos si gana el usuario primero ya que es el el que pinta primero en cada ciclo
					System.out.println("\nHa ganado el usuario");
					validar=-1;
					break;
				}
				
				System.out.println("\nTurno de la máquina");
				validar = mueveFichaAleatoria(tablero);
				
				if(validar==-1) {
					System.out.println("EMPATE");
				} else {
					tablero[validar] = 1;
				}

				if(ganaPrograma(x1, x2, x3, tablero)) {//Validamossi ha ganado el ordenador
					imprimeTablero(tablero);
					System.out.println("\nHa ganado el programa");
					validar=-1;
				}
			}
			
			System.out.println("¿Quieres volver a jugar al juego? (y/n)");
			String volverAjugar = sn.next();
			if(volverAjugar.equalsIgnoreCase("y")|| volverAjugar.equalsIgnoreCase("s")) {
				limpiarTablero(tablero);
				validar=0;
				//REINICIAR VARIABLES
			} else {
				jugar=false;
				System.out.println("Vale ¡Qué tengas un buen día!");
			}
		}
		sn.close();
	}
	//ESTA FUNCIÓN IMPRIME EL TABLERO
	public static int[] imprimeTablero(int[] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			if (i == 2 || i == 5) {//Esto especifica los bordes del tablero por lo que tendrán un salto de líne en ligar de un tab
				if (tablero[i] != 0) {
					if (tablero[i] == 1) {//Comprobamos que no haya nada pintado y si lo hay pintamos x u o
						System.out.print("x\n");
					} else if (tablero[i] == 2) {
						System.out.print("o\n");
					}
				} else {
					System.out.print("-\n");
				}
			} else {
				if (tablero[i] != 0) {
					if (tablero[i] == 1) {
						System.out.print("x	");
					} else if (tablero[i] == 2) {
						System.out.print("o	");
					}
				} else {
					System.out.print("-	");
				}
			}
		}
		return tablero;
	}
	//ESTA FUNCIÓN COLOCA LA FICHA DEL ORDENADOR
	public static int mueveFichaAleatoria(int[] tablero) {
		int jugadaOrdenador = (int) (Math.random() * 9);
		boolean puedePintar = false;
		int cont = 0;
		
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i] == 0) {
				cont++; // Si cont es 0 significa que no hay espacios para poder pintar
			}
		}

		if (cont == 0) {
			return -1;//le enviamos un -1 y pintamos el empate
		}

		while (puedePintar == false) {

			if (tablero[jugadaOrdenador] == 0) {
				puedePintar = true;//Si la jugada del ordenador es 0 devolvemos true
			} else {
				jugadaOrdenador = (int) (Math.random() * 9);//Reiniciamos la jugada del ordenador
			}
		}
		return jugadaOrdenador;
	}
	//ESTA FUNCIÓN COLOCA LA FICHA DEL USUARIO
	public static boolean usuarioMueveFicha(int[] tablero, String jugadaUsuario) {
		int jugada = conviertePosicionEnMovimiento(jugadaUsuario);//Convertimos la jugada a número

		if (jugada!=-1 && tablero[jugada] == 0) {
			System.out.println("\nMOVIMIENTO VÁLIDO");
			tablero[jugada] = 2;//Pintamos un 2 si se puede pintar
			return true;
		} else {
			return false;
		}
	}
	//CON ESTO CONVERTIMOS LA JUGADA DEL USUARIO EN MOVIMIENTO
	public static int conviertePosicionEnMovimiento(String jugadaUsuario) {
		if (jugadaUsuario.equalsIgnoreCase("arriba izquierda")) {
			return 0;
		} else if (jugadaUsuario.equalsIgnoreCase("arriba centro")) {
			return 1;
		} else if (jugadaUsuario.equalsIgnoreCase("arriba derecha")) {
			return 2;
		} else if (jugadaUsuario.equalsIgnoreCase("centro izquierda")) {
			return 3;
		} else if (jugadaUsuario.equalsIgnoreCase("centro centro")) {
			return 4;
		} else if (jugadaUsuario.equalsIgnoreCase("centro derecha")) {
			return 5;
		} else if (jugadaUsuario.equalsIgnoreCase("abajo izquierda")) {
			return 6;
		} else if (jugadaUsuario.equalsIgnoreCase("abajo centro")) {
			return 7;
		} else if (jugadaUsuario.equalsIgnoreCase("abajo derecha")) {
			return 8;
		}
		return -1;
	}
	//LIMPIAMOS EL TABLERO PARA VOLVER A JUGAR
	public static void limpiarTablero(int[] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = 0;
		}
	}
	
	// CON LAS DOS ÚLTIMAS FUNCIONES COMPROBAMOS QUIEN HA GANADO LA PARTIDA
	public static boolean ganaPrograma(int x1, int x2, int x3, int[] tablero) {
		//Debería haber usado las variables x1,x2 y x3 pero no sabía como guardar la posición y después comprobarlo
		if ((tablero[0] == 1 && tablero[1] == 1 && tablero[2] == 1) || (tablero[3] == 1 && tablero[4] == 1 && tablero[5] == 1) || (tablero[6] == 1 && tablero[7] == 1 && tablero[8] == 1) || (tablero[0] == 1 && tablero[3] == 1 && tablero[6] == 1) || (tablero[1] == 1 && tablero[4] == 1 && tablero[7] == 1) || (tablero[2] == 1 && tablero[5] == 1 && tablero[8] == 1) || (tablero[6] == 1 && tablero[4] == 1 && tablero[2] == 1) || (tablero[0] == 1 && tablero[4] == 1 && tablero[8] == 1)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean ganaUsuario(int x1, int x2, int x3, int[] tablero) {
		if ((tablero[0] == 2 && tablero[1] == 2 && tablero[2] == 2) || (tablero[3] == 2 && tablero[4] == 2 && tablero[5] == 2) || (tablero[6] == 2 && tablero[7] == 2 && tablero[8] == 2) || (tablero[0] == 2 && tablero[3] == 2 && tablero[6] == 2) || (tablero[1] == 2 && tablero[4] == 2 && tablero[7] == 2) || (tablero[2] == 2 && tablero[5] == 2 && tablero[8] == 2) || (tablero[6] == 2 && tablero[4] == 2 && tablero[2] == 2) || (tablero[0] == 2 && tablero[4] == 2 && tablero[8] == 2)) {
			return true;
		} else {
			return false;
		}
	}

}
