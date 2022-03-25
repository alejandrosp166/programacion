/*Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4 cifras. El programa nos
pedir� la combinaci�n para abrirla. Si no acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la
combinaci�n� y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�. Tendremos cuatro
oportunidades para abrir la caja fuerte.*/
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println("Dame la contrase�a de la caja fuerte, recuerde que tiene 3 oportunidades");
		Scanner sn = new Scanner(System.in);
		int contra=1234;
		int contraUsuario=sn.nextInt();
		int oportunidades=3;
		
		while(oportunidades>1) {
			
			if (contraUsuario==contra) {
				System.out.print("Acceso concedido");
				break;//Hacerlo sin esto
			}
			else {
				oportunidades--;
				System.out.println("Acceso denegado, le quedan " + oportunidades+" Oportunidad/es");
				contraUsuario=sn.nextInt();
			}
		}
		if(oportunidades==1) {
			System.out.println("Acceso denegado, se le agotaron los intentos");
		}
		sn.close();
	}
}
//import java.util.Scanner; Es lo que se pone en la primera l�nea
//Sacar por pantalla los datos
//El otro m�todo vale si usamos un di�logo de texto
//scanner sn =new scanner(system.in);
//int num = sn.nextInt();
//next.line para leer la l�nea directamente
//String x = sn.next.line();
//Es necesario cerrar el m�todo con sc.close()