/*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Dame la altura de la pirámide");
		int altura=sn.nextInt();
		System.out.println("Dame un caracter");
		String car = sn.next();
		
		int control=altura-1;
		int jdesp=1;
		for(int i = 0; i<altura; i++) {
			
			for(int z = control; z!=0; z--) {
				System.out.print(" ");
			}
			control--;
			
			if(i!=0 && i!=altura-1) {
				System.out.print(car);
				
				for(int j=0 ;j<jdesp ; j++) {
					System.out.print(" ");
				}
				System.out.print(car);
				jdesp=jdesp+2;
			}else {
				for(int j=0;j<=i;j++) {
					System.out.print(car+" ");
				}
			}
			System.out.println("");
		}
		sn.close();
	}

}