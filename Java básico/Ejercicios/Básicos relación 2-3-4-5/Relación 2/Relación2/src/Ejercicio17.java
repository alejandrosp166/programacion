/*Realiza un programa que sume los 100 n�meros siguientes a un n�mero entero y positivo introducido por
teclado. Se debe comprobar que el dato introducido es correcto (que es un n�mero positivo).*/
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		System.out.println("Dame un n�mero: ");
		Scanner sn = new Scanner(System.in);
		int numUser=sn.nextInt();
		
		if(numUser<0) {
			System.out.println("El n�mero no puede ser negativo");
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
//NOTA: En un condicional, si el resultado es verdadero no har� falta poner en la condici�n x==verdadero solo con
//if(x){} ser�a v�lido