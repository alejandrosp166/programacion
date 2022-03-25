
import java.util.Scanner;

import Ejercicio1al8.Ejercicio1al8;
import Ejercicios9al11.Ejercicios9al11;
public class Biblioteca {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Dame un n�mero y te digo si es capicua o no:");
		int numeroCapicua = sn.nextInt();

		if(Ejercicio1al8.esCapicua(numeroCapicua)==true) {
			System.out.println("El n�mero es capicua");
		} else {
			System.out.println("El n�mero no es capicua");
		}
		
		System.out.println("Dame un n�mero y te digo si es primo o no");
		int numeroPrimo = sn.nextInt();

		if(Ejercicio1al8.esPrimo(numeroPrimo)==true) {
			System.out.println("El n�mero es primo");
		} else {
			System.out.println("El n�mero no es primo");
		}
		
		System.out.println("Dame un n�mero y te digo el siguinete que sea primo");
		int numeroSiguientePrimo = sn.nextInt();
		System.out.println("El siguiente n�mero que es primo es: " + Ejercicio1al8.siguientePrimo(numeroSiguientePrimo));
		
		System.out.println("Dame un n�mero: ");
		int numeroBasePotencia=sn.nextInt();
		System.out.println("Dame el exponente: ");
		int numeroExponentePotencia=sn.nextInt();
		System.out.println(numeroBasePotencia + "^" + numeroExponentePotencia + " = " + Ejercicio1al8.potencia(numeroBasePotencia, numeroExponentePotencia));
		
		System.out.println("Dame un n�mero y te digo el n�mero de d�gitos: ");
		int numeroDigitos=sn.nextInt();
		System.out.println("El n�mero de d�gitos de " + numeroDigitos +" es: " + Ejercicio1al8.digitos(numeroDigitos));
		
		System.out.println("Dame un n�mero y le doy la vuelta: ");
		int numeroInvetido=sn.nextInt();
		System.out.println("El n�mero invertido es: " + Ejercicio1al8.voltea(numeroInvetido));
		
		System.out.println("Dame un n�mero: ");
		int numeroDigitoN = sn.nextInt();
		System.out.println("Dame otro n�mero y te digo que n�mero ocupa esa posici�n en el n�mero: ");
		int numeroPos = sn.nextInt();
		if(Ejercicio1al8.digitoN(numeroDigitoN, numeroPos)==-1) {
			System.out.println("No hay ning�n n�mero en esa posici�n");
		} else {
			System.out.println("El n�mero que est� en la posici�n: " + numeroPos +" Es: " + Ejercicio1al8.digitoN(numeroDigitoN, numeroPos));
		}
		
		System.out.println("Dame un n�mero: ");
		int numeroA = sn.nextInt();
		System.out.println("Dame otro n�mero y te digo la posici�n que ocupa en el n�mero: ");
		int numeroB=sn.nextInt();
		System.out.println("El n�mero que ocupa: " + numeroB + " en " + numeroA + " es la posici�n: " + Ejercicio1al8.posicionDeDigito(numeroA, numeroB));
		
		System.out.println("Los primos que hay entre 1 y 1000 son: ");
		Ejercicios9al11.numerosPrimosEntre1y1000();
		
		System.out.println("Los n�meros capicuas entre 1 y 99999 son: ");
		Ejercicios9al11.numerosCapicuasEntre1y99999();
		
		System.out.println("Dame un n�mero en binario y te lo paso a decimal: ");
		int numDecimalBinario = sn.nextInt();
		
		if(Ejercicios9al11.binarioDecimal(numDecimalBinario)==-1) {
			System.out.println("ERROR el valor introducido no est� en binario");
		} else {
			System.out.println("El n�mero: " + numDecimalBinario + " a decimal es: " + Ejercicios9al11.binarioDecimal(numDecimalBinario));
		}
		
		sn.close();
	}
}