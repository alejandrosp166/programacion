//Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos. 
//Cuando el usuario no quiera
//insertar más números, introducirá un número negativo y el algoritmo, 
//antes de acabar, mostrará la media
//de los números positivos que ha introducido anteriormente el usuario.

Algoritmo Ejercicio9
	Escribir "Dame números positivos y hago la media: "
	Leer num
	Mientras num>0 Hacer
		suma<-suma+num
		cont<-cont+1
		Escribir "Dame otro número: "
		Leer num
	FinMientras
	media<-suma/cont
	Escribir "La media de los números introducidos es: " media
FinAlgoritmo
