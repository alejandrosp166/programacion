//Escribe un algoritmo que vaya pidiendo n�meros al usuario y vaya mostrando 
//por pantalla si el n�mero
//introducido es par o impar (indistintamente que sea positivo o negativo). 
//El algoritmo terminar� cuando el
//usuario introduzca el n�mero cero.

Algoritmo Ejercicio10
	Escribir "Dame n�mero y te digo si son par o impar: "
	Leer num
	Mientras num<>0 Hacer
		si num%2=0 Entonces
			Escribir "El n�mero: ", num ," es par"
		SiNo
			Escribir "El n�mero: ", num," es impar"
		FinSi
		Escribir "Dame otro n�mero: "
		Leer num
	FinMientras
	Escribir "Fin del programa, has introducido 0"
FinAlgoritmo
