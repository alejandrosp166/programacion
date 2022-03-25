/*Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es
aquel que sólo es divisible entre él mismo y la unidad*/
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame un número y te digo si es primo o no");
		int primo = sn.nextInt();
		int cont=0;
		
		for(int i=1;i<=primo;i++) {
			if(primo%i == 0) {
				cont++;
			}
		}
		if(cont==2) {
			System.out.println("El número es primo");
		}
		else {
			System.out.println("El número no es primo");
		}
		sn.close();
	}

}
