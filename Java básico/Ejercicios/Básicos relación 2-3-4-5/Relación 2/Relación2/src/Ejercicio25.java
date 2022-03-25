import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sn =new Scanner(System.in);
		int numUsuario = sn.nextInt();
		int resto;
		
		while(numUsuario>0) {
			resto=numUsuario%10;
			System.out.print(resto);
			numUsuario=numUsuario/10;
		}
		sn.close();
		
	}

}
//Podemos escribir System.out.print de manera más rápida escribiendo syso + Ctrl + espacio