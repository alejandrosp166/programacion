//Haz un programa que pida al usuario 5 datos, los guarde en una matriz 
//y luego muestre su media (la suma de los 5 datos, dividida entre 5).
Algoritmo Ejercicio9punto2
	Dimension datos[5]
	
	Para i=1 Hasta 5 Hacer
		leer datos[i]
		suma=datos[i]+suma
	FinPara
	media=suma/5
	Escribir "La media de los números es: ", media
FinAlgoritmo
