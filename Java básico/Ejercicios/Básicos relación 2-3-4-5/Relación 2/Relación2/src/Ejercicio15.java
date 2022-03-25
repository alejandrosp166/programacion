import java.util.Scanner;

/*Escribe un programa que dados dos números, uno real (base) y un entero positivo(exponente), saque por
pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No
se deben utilizar funciones de exponenciación.*/
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Dame el valor de la base:");
		int base = sn.nextInt();
		
		System.out.println("Dame el valor del exponente:");
		int exp = sn.nextInt();
		int resultado = base;
		
		for(int i=0;i<exp;i++) {
			System.out.println(base);
			base*=resultado; //base = base * resultado
		}
		sn.close();
	}
}