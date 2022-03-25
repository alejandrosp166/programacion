import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame números: ");
		int numUsuario = sn.nextInt();
		int cont=0, suma=numUsuario;
		
		while(suma<10000) {
			if (cont!=0) {
				suma+=numUsuario;
			}
			cont++;
			if(suma>10000) {
				System.out.println("La suma de todos los números es: " + suma);
				System.out.println("El total de números introducidos fue: " + cont);
				System.out.println("La media de los números es: " + suma/cont);
			}else {
				System.out.println("Dame otro número");
				numUsuario=sn.nextInt();
			}
		}
		sn.close();
	}
}