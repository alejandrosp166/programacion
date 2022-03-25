//Escribe un algoritmo que vaya pidiendo números al usuario y vaya mostrando 
//por pantalla si el número
//introducido es par o impar (indistintamente que sea positivo o negativo). 
//El algoritmo terminará cuando el
//usuario introduzca el número cero.

Algoritmo Ejercicio10
	Escribir "Dame número y te digo si son par o impar: "
	Leer num
	Mientras num<>0 Hacer
		si num%2=0 Entonces
			Escribir "El número: ", num ," es par"
		SiNo
			Escribir "El número: ", num," es impar"
		FinSi
		Escribir "Dame otro número: "
		Leer num
	FinMientras
	Escribir "Fin del programa, has introducido 0"
FinAlgoritmo
