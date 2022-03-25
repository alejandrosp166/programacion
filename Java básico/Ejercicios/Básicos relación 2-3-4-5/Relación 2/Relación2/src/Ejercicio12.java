/*Escribe un programa que muestre los n primeros t�rminos de la serie de Fibonacci. El primer t�rmino de la
serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que
tendr�amos que los t�rminos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144� El n�mero n se debe introducir
por teclado.*/
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("�Cu�ntos n�meros quieres que te muestre de la sucesi�n de Fibonacci?");
		
		int numUsuario= sn.nextInt();
		int x = 0, y = 1, aux = 0;
		
		for (int i=1;i<=numUsuario;i++) {
			aux=x+y;
			x=y;
			y=aux;
			System.out.println(x);
		}
		sn.close();
	}

}
