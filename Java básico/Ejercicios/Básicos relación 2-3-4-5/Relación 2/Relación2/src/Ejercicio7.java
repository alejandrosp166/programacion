/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos
pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la
combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
oportunidades para abrir la caja fuerte.*/
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println("Dame la contraseña de la caja fuerte, recuerde que tiene 3 oportunidades");
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
//import java.util.Scanner; Es lo que se pone en la primera línea
//Sacar por pantalla los datos
//El otro método vale si usamos un diálogo de texto
//scanner sn =new scanner(system.in);
//int num = sn.nextInt();
//next.line para leer la línea directamente
//String x = sn.next.line();
//Es necesario cerrar el método con sc.close()