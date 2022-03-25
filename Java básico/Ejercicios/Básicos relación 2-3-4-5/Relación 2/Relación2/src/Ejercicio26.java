/*Realiza un programa que pida primero un n�mero y a continuaci�n un d�gito. El programa nos debe dar la
posici�n (o posiciones) contando de izquierda a derecha que ocupa ese d�gito en el n�mero introducido*/
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame un n�mero: ");
		int numUsuario = sn.nextInt(), numUsuario2=numUsuario;
		System.out.println("Dame un d�gito: ");
		int digito = sn.nextInt(), cont=0;
		
		while(numUsuario2>0) {
			numUsuario2=numUsuario2/10;
			cont++;
		}
		
		while(numUsuario>0) {
			if(numUsuario%10 == digito%10) {
				System.out.println(digito%10 + " ocupa la posici�n: " + cont);
				digito=digito/10;
			}
			numUsuario=numUsuario/10;
			cont--;
		}
		sn.close();
	}
}