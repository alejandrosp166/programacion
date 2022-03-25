import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame números: ");
		int numUsuario = sn.nextInt();
		int sumaImp = 0;
		int mayor = numUsuario;
		int contImp=0;
		
		while(numUsuario>=0) {
			
			if(numUsuario%2!=0) {
				sumaImp+=numUsuario;
				contImp++;
			}else {
				if(numUsuario>mayor) {
					mayor=numUsuario;
				}
			}
			System.out.println("Dame otro número: ");
			numUsuario = sn.nextInt();
		}
		System.out.println("La media de los números impares es: " + sumaImp/contImp);
		System.out.println("El mayor de los números pares es: " + mayor);
		sn.close();
	}

}