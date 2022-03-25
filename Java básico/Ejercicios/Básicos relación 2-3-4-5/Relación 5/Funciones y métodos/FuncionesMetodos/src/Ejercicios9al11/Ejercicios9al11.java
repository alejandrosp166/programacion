package Ejercicios9al11;

import Ejercicio1al8.Ejercicio1al8;

public class Ejercicios9al11 {
	public static void numerosPrimosEntre1y1000() {
		
		for(int i=1; i<=1000; i++) {
			
			if(Ejercicio1al8.esPrimo(i)==true) {
				System.out.println(i +" Es primo");
			}
		}
	}
	
	public static void numerosCapicuasEntre1y99999() {
		for(int i=1; i<=99999; i++) {
			
			if(Ejercicio1al8.esCapicua(i)==true) {
				System.out.println(i + " Es capicua");
			}
		}
	}
	
	public static int binarioDecimal(int num) {
		//1 1 1 1 = 1x2^3 + 1x2^2 + 1x2^1 + 1x2^0 = 15
		int prueba=num;
		int exponente=Ejercicio1al8.digitos(num);
		int sol=0;
		int cifra=0;
		
		while(prueba!=0) {//1111
			
			if(prueba%10!=0 && prueba%10!=1) {
				return -1;
			}
			prueba=prueba/10;
		}
		
		while(num!=0) {
			
			cifra=num%10;
			sol+=Ejercicio1al8.potencia(cifra*2, exponente);
			num=num/10;
			exponente--;
		}
		//ERROR RARO, EN LA SALIDA DE LOS NÚMEROS EL PROGRAMA PONE UN NÚMERO MÁS Y EL RESULTADO SIEMPRE ES EL DOBLE AL CORRECTO
		return sol;
	}
}
