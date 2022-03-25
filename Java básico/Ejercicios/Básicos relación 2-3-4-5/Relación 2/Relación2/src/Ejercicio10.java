/*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
introducir los datos cuando meta un número negativo.*/
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame un número que no sea menor a 0");
		
		int numUsuario =sn.nextInt();
		int media=0,cont=0;
		
		while(numUsuario>=0) {
			
			media = media + numUsuario;
			System.out.println("Dame otro número");
			numUsuario =sn.nextInt();
			cont++;
		}
		System.out.println("La media de los números introducidos es: " + media/cont);
		sn.close();
	}
}
