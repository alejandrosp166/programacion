/*Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la
siguiente figura:*/
import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int altura = sn.nextInt();
		int car=1;
		int car2, control=altura-1;
		boolean p = true;
		
		for(int i = 0;i<=altura-1;i++) {
			
			for(int x=1;x<=control;x++) {
				System.out.print(" ");
			}
			control--;
			
			for(int j = 0;j<=i;j++) {
				if(p==true) {
					System.out.print(car++);
				}
				if(j==i-1) {
					car2=car;
					for(int y=0;y<=car-1;y++) {
						System.out.print(car2--);
					}
					p=false;
				}
			}
			car=1;
			p=true;
			System.out.println("");
		}
		sn.close();
	}

}