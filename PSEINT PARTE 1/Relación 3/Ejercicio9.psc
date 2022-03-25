//Escribe un algoritmo que pida al usuario tres números enteros, 
//y que muestre por pantalla si la suma de
//dos de esos números da como resultado el otro número

Algoritmo Ejercicio9
	
	Escribir "Dame tres números: "
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
