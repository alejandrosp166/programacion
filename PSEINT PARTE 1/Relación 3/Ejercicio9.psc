//Escribe un algoritmo que pida al usuario tres n�meros enteros, 
//y que muestre por pantalla si la suma de
//dos de esos n�meros da como resultado el otro n�mero

Algoritmo Ejercicio9
	
	Escribir "Dame tres n�meros: "
	Leer num1,num2,num3
	
	si num1 + num2 == num3 Entonces
		Escribir num1 "+" num2 "=" num3
	FinSi
	
	si num1 + num3 == num2 Entonces
		Escribir num1 "+" num3 "=" num2
	FinSi
	
	si num2 + num3 == num1 Entonces
		Escribir num2 "+" num3 "=" num1
	FinSi
	
FinAlgoritmo
