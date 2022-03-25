//Escribe un algoritmo que pida al usuario dos números enteros y muestre por pantalla si el primer número
//es múltiplo del segundo número.

Algoritmo Ejercicio3
	
	Escribir "Dame dos números: "
	Leer num1, num2
	
	si num2%num1==0 Entonces
		Escribir num1," es mltiplo de ", num2
	SiNo
		Escribir num1," NO es múltiplo de ", num2
	FinSi
	
FinAlgoritmo
