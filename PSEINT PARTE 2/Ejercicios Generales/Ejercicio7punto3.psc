//Prepara un programa que divida dos n�meros que introduzca el usuario. 
//Si el segundo n�mero es cero, se le deber� avisar y volver a pedir tantas veces 
//como sea necesario, hasta que introduzca un n�mero distinto de cero, 
//momento en que se calcular� y mostrar� el resultado de la divisi�n.

Algoritmo Ejercicio7punto3
	Escribir "Dame dos n�meros: "
	Leer num1,num2
	
	Mientras num2=0 Hacer
		Escribir "El segundo n�mero no puede ser 0, por favor escr�belo de nuevo"
		Leer num2
	FinMientras
	div<-num1/num2
	Escribir "El resultado es: " div
FinAlgoritmo
