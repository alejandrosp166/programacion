//Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos que debe ir sumando.
//Cuando el usuario no quiera insertar m�s n�meros, 
//introducir� un n�mero negativo y el algoritmo, antes
//de acabar, mostrar� la suma de los n�meros positivos introducidos anteriormente por el usuario.


Algoritmo Ejercicio7
	Definir num como entero
	Escribir "Dame n�meros y los ir� sumando: "
	Leer num
	Mientras num>0 Hacer
		suma<-num+suma
		Escribir "Dame otro n�mero: "
		Leer num
	FinMientras
	Escribir "La suma de los n�meros introducidos es: " suma
FinAlgoritmo
