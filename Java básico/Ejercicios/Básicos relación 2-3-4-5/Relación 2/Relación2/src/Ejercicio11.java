/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros
a partir de uno que se introduce por teclado.*/

import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numUsuario = sn.nextInt();
		int n1=numUsuario+1,n2=numUsuario+2,n3=numUsuario+3,n4=numUsuario+4,n5=numUsuario+5;
		
		System.out.println(n1 + " | "+n1*n1+" | "+n1*n1*n1);
		System.out.println(n2 + " | "+n2*n2+" | "+n2*n2*n2);		
		System.out.println(n3 + " | "+n3*n3+" | "+n3*n3*n3);		
		System.out.println(n4 + " | "+n4*n4+" | "+n4*n4*n4);
		System.out.println(n5 + " | "+n5*n5+" | "+n5*n5*n5);
		sn.close();
	}

}
