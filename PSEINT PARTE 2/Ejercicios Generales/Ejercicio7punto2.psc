//Haz un programa que permita calcular la suma de pares de n�meros. 
//Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que 
//ambos n�meros introducidos sean 0. Esta vez deber�s usar "Repetir", por lo que tu soluci�n 
//no ser� igual que la del ejercicio 6.2, que empleaba "Mientras".

Algoritmo Ejercicio7punto2
	Escribir "Dame dos n�meros: "
	Definir suma,num1,num2 Como Entero
	suma<-1
	
	Repetir
		Leer num1,num2
		suma<-num1+num2
		Escribir "La suma es: " suma
	Hasta Que suma=0 
FinAlgoritmo
