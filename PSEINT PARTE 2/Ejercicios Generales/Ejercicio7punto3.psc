//Prepara un programa que divida dos números que introduzca el usuario. 
//Si el segundo número es cero, se le deberá avisar y volver a pedir tantas veces 
//como sea necesario, hasta que introduzca un número distinto de cero, 
//momento en que se calculará y mostrará el resultado de la división.

Algoritmo Ejercicio7punto3
	Escribir "Dame dos números: "
	Leer num1,num2
	
	Mientras num2=0 Hacer
		Escribir "El segundo número no puede ser 0, por favor escríbelo de nuevo"
		Leer num2
	FinMientras
	div<-num1/num2
	Escribir "El resultado es: " div
FinAlgoritmo
