/*Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por
teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir
incrementando de 7 en 7.*/
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1 = sn.nextInt(), num2 = sn.nextInt();
		
		if(num1 == num2) {
			System.out.println("Los números introducidos deben ser distintos");
		}
		else {
			for(int i =1; i<num2 ;i++) {
				num1=num1+7;
				if(num1<=num2) {
					System.out.println(num1);
				}
				else {
					System.out.println("El num1 superó al num2");
					break;
				}
			}
		}
		sn.close();
	}

}
