//Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame un número y digo cuantas cifras tiene");
		
		int numUsuario= sn.nextInt();
		
		if(numUsuario < 10) {
			System.out.println("El número tiene 1 cifra");
		}
		else if(numUsuario>=10 && numUsuario<100) {
			System.out.println("El número tiene 2 cifras");
		}
		else if(numUsuario>=100 && numUsuario<1000) {
			System.out.println("El número tiene 3 cifras");
		}
		else if(numUsuario>=1000 && numUsuario<10000) {
			System.out.println("El número tiene 4 cifras");
		}
		else if(numUsuario>=10000 && numUsuario<100000) {
			System.out.println("El número tiene 5 cifras");
		}
		else {
			System.out.println("El número tiene más de 5 cifras");
		}
		sn.close();
	}

}
