/*Escribe un programa que diga si un n�mero introducido por teclado es o no primo. Un n�mero primo es
aquel que s�lo es divisible entre �l mismo y la unidad*/
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame un n�mero y te digo si es primo o no");
		int primo = sn.nextInt();
		int cont=0;
		
		for(int i=1;i<=primo;i++) {
			if(primo%i == 0) {
				cont++;
			}
		}
		if(cont==2) {
			System.out.println("El n�mero es primo");
		}
		else {
			System.out.println("El n�mero no es primo");
		}
		sn.close();
	}

}
