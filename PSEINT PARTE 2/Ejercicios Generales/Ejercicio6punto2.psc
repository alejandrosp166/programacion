//Haz un programa que permita calcular la suma de pares de n�meros. 
//Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir 
//hasta que ambos n�meros introducidos sean 0.

Algoritmo Ejercicio6punto2
	Escribir "Dame dos n�meros: "
	Definir suma,num1,num2 Como Entero
	
	Leer num1,num2
	
	Mientras !(num1=0 y num2=0) Hacer
		suma<-num1+num2
		Escribir "La suma es: " suma
		Leer num1,num2
	FinMientras
FinAlgoritmo
