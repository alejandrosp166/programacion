/*Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son
negativos.*/
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		int vec[]=new int[10];
		Scanner sn = new Scanner(System.in);
		int contNegs=0, contPos=0;
		
		for(int i = 0;i<vec.length;i++) {
			
			System.out.println("Dame el valor de la posición: " + i);
			vec[i]=sn.nextInt(); //Dar valores al vector
			
			if(vec[i]>0) {
				contPos++;
			}
			else {
				contNegs++;
			}
		 }
		System.out.println("El total de números negativos introducidos es: " + contNegs + "\n\nEl total de números positivos es: " + contPos);
		sn.close();
	}

}
