//Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido por teclado.
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame un n�mero y digo cuantas cifras tiene");
		
		int numUsuario= sn.nextInt();
		
		if(numUsuario < 10) {
			System.out.println("El n�mero tiene 1 cifra");
		}
		else if(numUsuario>=10 && numUsuario<100) {
			System.out.println("El n�mero tiene 2 cifras");
		}
		else if(numUsuario>=100 && numUsuario<1000) {
			System.out.println("El n�mero tiene 3 cifras");
		}
		else if(numUsuario>=1000 && numUsuario<10000) {
			System.out.println("El n�mero tiene 4 cifras");
		}
		else if(numUsuario>=10000 && numUsuario<100000) {
			System.out.println("El n�mero tiene 5 cifras");
		}
		else {
			System.out.println("El n�mero tiene m�s de 5 cifras");
		}
		sn.close();
	}

}
