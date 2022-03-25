//Si has estudiado álgebra matricial, 
//prepara un programa que calcule el determinante de una matriz de 3x3.
Algoritmo Ejercicio9punto10
	Dimension datos[3,3]
	
	Para i=1 Hasta 3 Hacer
		Para z=1 Hasta 3 Hacer
			Escribir "Dame los datos de la posición ",i,",",z
			Leer datos[i,z]
		FinPara
	FinPara
	determinate=datos[1,1]*datos[2,2]*datos[3,3]+datos[1,2]*datos[2,3]*datos[3,1]+datos[2,1]*datos[3,2]*datos[1,3]-datos[1,3]*datos[2,2]*datos[3,1]-datos[1,2]*datos[2,1]*datos[3,3]-datos[2,3]*datos[3,2]*datos[1,1]
	Escribir "El resultado es: " determinate
FinAlgoritmo
