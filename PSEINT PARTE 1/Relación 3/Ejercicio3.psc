//Escribe un algoritmo que pida al usuario dos n�meros enteros y muestre por pantalla si el primer n�mero
//es m�ltiplo del segundo n�mero.

Algoritmo Ejercicio3
	
	Escribir "Dame dos n�meros: "
	Leer num1, num2
	
	si num2%num1==0 Entonces
		Escribir num1," es mltiplo de ", num2
	SiNo
		Escribir num1," NO es m�ltiplo de ", num2
	FinSi
	
FinAlgoritmo
