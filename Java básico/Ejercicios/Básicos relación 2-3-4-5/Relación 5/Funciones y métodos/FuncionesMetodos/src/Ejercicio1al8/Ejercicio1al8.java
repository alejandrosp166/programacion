package Ejercicio1al8;

public class Ejercicio1al8 {
	/*esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
	y falso en caso contrario.*/
	public static boolean esCapicua(int num) {
		int numReves=0, aux=num, cifra;
		
		while (aux!=0) {
			cifra=aux%10;
			numReves=numReves*10 + cifra;
			aux=aux/10;
		}
		
		if(num==numReves) {
			return true;
		} else {
			return false;
		}
	}
	
	/*Devuelve verdadero si el número que se pasa como parámetro es primo y
	falso en caso contrario.*/
	public static boolean esPrimo(int num) {
		int cont=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cont++;
			}
		}
		
		if(cont==2) {
			return true;
		} else {
			return false;
		}
	}
	
	/*Devuelve el menor primo que es mayor al número que se pasa
	como parámetro.*/
	public static int siguientePrimo(int num) {
		
		int numSig=num+1;
		
		while(esPrimo(numSig)!=true) {
			numSig++;
		}
		
		return numSig;
	}
	
	/*Dada una base y un exponente devuelve la potencia.*/
	public static int potencia(int base, int exponente) {
		
		int aux=base;
		
		for(int i=1; i<exponente; i++) {
			base*=aux;
		}
		return base;
	}
	
	/*Cuenta el número de dígitos de un número entero*/
	public static int digitos(int num) {
		int cont=0;
	
		while(num!=0) {
			num=num/10;
			cont++;
		}
		return cont;
	}
	
	/*Le da la vuelta a un número.*/
	public static int voltea(int num) {
		
		int cifra=0, invertido = 0;
		
		while(num!=0) {
			cifra=num%10;
			invertido=invertido*10+cifra;
			num=num/10;
		}
		
		return invertido;
	}
	
	/*Devuelve el dígito que está en la posición n de un número entero. Se
	empieza contando por el 0 y de izquierda a derecha*/
	public static int digitoN(int num, int pos) {
		
		int cont=0;
		num=voltea(num);
		int cifra=0;
		
		while(num!=0) {
			
			cifra=num%10;
			if(pos==cont) {
				return cifra;
			}
			num=num/10;
			cont++;
		}
		
		return -1;
	}
	
	/*Da la posición de la primera ocurrencia de un dígito dentro de
	un número entero. Si no se encuentra, devuelve -1.*/
	public static int posicionDeDigito(int num, int num2) {
		int cont=0;
		num=voltea(num);
		int cifra=0;
		
		while(num!=0) {
			
			cifra=num%10;
			if(cifra==num2) {
				return cont;
			}
			num=num/10;
			cont++;
		}
		return -1;
	}
}
