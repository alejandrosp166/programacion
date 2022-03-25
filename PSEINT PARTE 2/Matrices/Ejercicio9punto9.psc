//Si has estudiado álgebra matricial, haz un programa que calcule el determinante de una 
//matriz de 2x2, 
//a partir de datos que introduzca el usuario.

Algoritmo Ejercicio9punto9
	Dimension datos[2,2]
	
	Para i=1 Hasta 2 Hacer
		Para z=1 Hasta 2 Hacer
			Escribir "Dame los datos de la posición ",i,",",z
			Leer datos[i,z]
		FinPara
	FinPara
	determinate=datos[1,1] * datos[2,2] - datos[1,2] * datos[2,1]
	Escribir "El resultado es: " determinate
FinAlgoritmo
