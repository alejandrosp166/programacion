import java.util.Scanner;
public class Bingo {
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		int vecj1[][] = new int[3][5];
		int vecj2[][] = new int[3][5];
		int rdnJuego;
		int dineroj1=0, dineroj2=0;
		boolean mostrarTxtJugador = false;
		boolean bingoj1=false, bingoj2=false;
		boolean lj1=false, lj2=false; //Esto sirve para el bucle que comprueba las líneas, líneas (90 hasta 132)

		System.out.println("\n******BINGO IES MARTÍNEZ MONTAÑÉS******");
		System.out.println("PREMIOS");
		System.out.println("Línea: 100 $");
		System.out.println("BINGO: 500 $\n");
		
		//Generar los cartones
		mostrarTxtJugador = mostrarTxtJugadores(mostrarTxtJugador);
		crearTableros(vecj1);
		mostrarTxtJugador = mostrarTxtJugadores(mostrarTxtJugador);
		crearTableros(vecj2);
		
		//ESTE BUCLE ES EL QUE JUEGA AL JUEGO
		while(bingoj1==false && bingoj2 == false) {
			
			System.out.println("-----------------------");
			System.out.println("\nPulse cualquier tecla para sacar bola");
			@SuppressWarnings("unused")
			String continuar = sn.nextLine();
			
			rdnJuego = (int) Math.floor(Math.random()*(1-50)+50);

			System.out.println("Ha salido el número: " + rdnJuego + "\n");
			System.out.println("Pulse cualquier tecla para continuar");
			continuar=sn.nextLine();
			
			//Este bucle compara el número randon con los cartones
			for(int i=0;i<3;i++) {
				for(int j=0;j<5;j++) {
					if(vecj1[i][j]==rdnJuego) {
						vecj1[i][j] = 0;
					} 
					
					if(vecj2[i][j]==rdnJuego) {
						vecj2[i][j]= 0;
					}
				}
			}
			
			//Lo que hacemos en este bucle es enseñar por un mismo bucle los dos cartones del bingo, 
			int contMenu=0;
			int x;
			for(int i=0;i<3;i++) {
				for(x=0;x<5;x++) {
					if(contMenu==4) {
						//Pintar el vector 2 y comprobar si tiene que poner la X
						if(i==0 && x==0) {
							mostrarTxtJugador = mostrarTxtJugadores(mostrarTxtJugador);
						}
						
						if(vecj2[i][x]==0) {
							System.out.printf("%3s","X | ");
						} else {
							System.out.printf("%3s",vecj2[i][x]+" | ");
						}
					} else {
						//Pintar el vector 1 y comprobar si tiene que poner la X
						if(i==0 && x==0) {
							mostrarTxtJugador = mostrarTxtJugadores(mostrarTxtJugador);
						}
						
						if(vecj1[i][x]==0) {
							System.out.printf("%3s","X | ");
						} else {
							System.out.printf("%3s",vecj1[i][x]+" | ");
						}
					}
				}
				if(contMenu!=3 && contMenu!=4) {
					contMenu++;
					if(contMenu==3) {
						i=-1;
						x=0;
						contMenu++;
					}
				}
				System.out.println("");
			}
			//Este bucle comprueba si hay línea o no además de comprobar si hay bingo
			short lineaj1=0, lineaj2=0;
			int sumaj1=0, sumaj2=0;
			
			for(int i=0;i<3;i++) {
				for(int j =0;j<5;j++) {
					sumaj1+=vecj1[i][j];
					sumaj2+=vecj2[i][j];
				}
				
				if(sumaj1==0) {
					lineaj1++;
					
					if(lineaj1 == 1 && lj1 == false && lj2 == false) {
						System.out.println("-----------------------");
						System.out.println("EL JUGADOR 1 HA CANTADO LÍNEA");
						dineroj1=dineroj1+100;
						lj1 = true;
						System.out.println("-----------------------");
						System.out.println("Dinero acumulado\n-----------------------");
						System.out.println("Jugador 1 " + dineroj1 + " $");
						System.out.println("Jugador 2 " + dineroj2 + " $");
					}
					
					if(lineaj1==3) {
						System.out.println("-----------------------");
						System.out.println("EL JUGADOR 1 HA CANTADO BINGO");
						bingoj1=true;
						dineroj1=dineroj1+500;
						System.out.println("-----------------------");
						System.out.println("Dinero acumulado\n-----------------------");
						System.out.println("Jugador 1 " + dineroj1 + " $");
						System.out.println("Jugador 2 " + dineroj2 + " $");
						System.out.println("-----------------------");
					}
				}
				
				if(sumaj2==0) {
					lineaj2++;
					
					if(lineaj2 == 1 && lj2 == false && lj1 == false) {
						System.out.println("-----------------------");
						System.out.println("EL JUGADOR 2 HA CANTADO LÍNEA");
						dineroj2=dineroj2+100;
						lj2 = true;
						System.out.println("-----------------------");
						System.out.println("Dinero acumulado\n------------");
						System.out.println("Jugador 1 " + dineroj1 + " $");
						System.out.println("Jugador 2 " + dineroj2 + " $");
					}
										
					if(lineaj2==3) {
						System.out.println("-----------------------");
						System.out.println("EL JUGADOR 2 HA CANTADO BINGO");
						bingoj2=true;
						dineroj2=dineroj2+500;
						System.out.println("-----------------------");
						System.out.println("Dinero acumulado\n-----------------------");
						System.out.println("Jugador 1 " + dineroj1 + " $");
						System.out.println("Jugador 2 " + dineroj2 + " $");
						System.out.println("-----------------------");
					}
				}
				sumaj1=0;
				sumaj2=0;
			}
		}
		//Aquí mostramos que jugador ha ganado la partida, también se tiene en cuenta que haya un empate
		if(bingoj1==true && bingoj2==true) {		
			System.out.println("HUBO UN EMPATE, LOS DOS JUGADORES CANTARON EL BINGO AL MISMO TIEMPO");	
		} else if(bingoj1==true) {			
			System.out.println("EL JUGADOR 1 HA GANADO LA PARTIDA");
		} else if(bingoj2==true) {
			System.out.println("EL JUGADOR 2 HA GANADO LA PARTIDA");
		}
		
		sn.close();
	}
	//Este método pinta el encabezado de los cartones en el juego
	public static boolean mostrarTxtJugadores(boolean mostrar) {
		
		if(mostrar==false) {
			System.out.println("-----------------------");
			System.out.println("     JUGADOR 1");
			System.out.println("-----------------------");
			mostrar=true;
		} else {
			System.out.println("-----------------------");
			System.out.println("     JUGADOR 2");
			System.out.println("-----------------------");
			mostrar=false;
		}
		return mostrar;
	}
	//Esta función crea los cartones que usaremos en el juego
	public static int[][] crearTableros (int[][] tablero) {
		
		int n=0, m=10;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				tablero[i][j]=(int) Math.floor(Math.random()*(n-m+1)+m);
				System.out.printf("%3s",tablero[i][j]+" | ");
				n=n+10;
				m=m+10;
			}
			System.out.println("");
			n=0;
			m=10;
		}
		return tablero;
	}
}