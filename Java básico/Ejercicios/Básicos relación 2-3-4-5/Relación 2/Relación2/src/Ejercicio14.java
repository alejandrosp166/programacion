//Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Dame el valor de la base:");
		int base = sn.nextInt();
		
		System.out.println("Dame el valor del exponente:");
		int exp = sn.nextInt();
		int mul=1;
		
		for(int i =0;i<exp;i++) {
			mul*=base;//mul=mul*base	
		}
		System.out.println(mul);
		sn.close();
	}

}
