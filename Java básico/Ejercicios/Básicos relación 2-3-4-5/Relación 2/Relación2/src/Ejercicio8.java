//Muestra la tabla de multiplicar de un número introducido por teclado.
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Dame un número y muestro su tabala de multiplicar");
		int num = sn.nextInt();
		
		for (int i=0;i<=10;i++) {
			System.out.println(num*i);
		}
		sn.close();
	}

}
