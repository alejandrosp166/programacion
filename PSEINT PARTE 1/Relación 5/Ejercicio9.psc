//Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos. 
//Cuando el usuario no quiera
//insertar m�s n�meros, introducir� un n�mero negativo y el algoritmo, 
//antes de acabar, mostrar� la media
//de los n�meros positivos que ha introducido anteriormente el usuario.

Algoritmo Ejercicio9
	Escribir "Dame n�meros positivos y hago la media: "
	Leer num
	Mientras num>0 Hacer
		suma<-suma+num
		cont<-cont+1
		Escribir "Dame otro n�mero: "
		Leer num
	FinMientras
	media<-suma/cont
	Escribir "La media de los n�meros introducidos es: " media
FinAlgoritmo
