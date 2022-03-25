/*Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por
teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).*/
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		System.out.println("Dame un número: ");
		Scanner sn = new Scanner(System.in);
		int numUser=sn.nextInt();
		
		if(numUser<0) {
			System.out.println("El número no puede ser negativo");
		}
		else {
			int suma=0;
			for(int i = numUser;i<(numUser+100);i++) {
				suma+=i;
			}
			System.out.println(suma);
		}
		sn.close();
	}
}
//NOTA: En un condicional, si el resultado es verdadero no hará falta poner en la condición x==verdadero solo con
//if(x){} sería válido