/*Realiza un programa que pinte una pir�mide por pantalla. La altura se debe pedir por teclado. El car�cter con
el que se pinta la pir�mide tambi�n se debe pedir por teclado.*/
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame la altura de la pir�mide");
		int altura=sn.nextInt();
		System.out.println("Dame un caracter");
		String car = sn.next();
		
		int control=altura-1;
		
		for(int i = 0; i<altura; i++) {
			
			for(int z = control; z!=0; z--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j<=i; j++) {
				System.out.print(car + " ");
			}
			System.out.println("");
			control--;
		}
		sn.close();
	}

}
