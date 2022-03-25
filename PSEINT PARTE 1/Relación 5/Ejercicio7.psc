//Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
//Cuando el usuario no quiera insertar más números, 
//introducirá un número negativo y el algoritmo, antes
//de acabar, mostrará la suma de los números positivos introducidos anteriormente por el usuario.


Algoritmo Ejercicio7
	Definir num como entero
	Escribir "Dame números y los iré sumando: "
	Leer num
	Mientras num>0 Hacer
		suma<-num+suma
		Escribir "Dame otro número: "
		Leer num
	FinMientras
	Escribir "La suma de los números introducidos es: " suma
FinAlgoritmo
