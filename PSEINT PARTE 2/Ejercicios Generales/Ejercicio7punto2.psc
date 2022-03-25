//Haz un programa que permita calcular la suma de pares de números. 
//Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que 
//ambos números introducidos sean 0. Esta vez deberás usar "Repetir", por lo que tu solución 
//no será igual que la del ejercicio 6.2, que empleaba "Mientras".

Algoritmo Ejercicio7punto2
	Escribir "Dame dos números: "
	Definir suma,num1,num2 Como Entero
	suma<-1
	
	Repetir
		Leer num1,num2
		suma<-num1+num2
		Escribir "La suma es: " suma
	Hasta Que suma=0 
FinAlgoritmo
