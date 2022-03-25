//Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos que debe ir contando.
//Cuando el usuario no quiera insertar más números, 
//introducirá un número negativo y el algoritmo, antes
//de acabar, mostrará cuantos números positivos ha introducido anteriormente el usuario.


Algoritmo Ejercicio8
	Definir cont,num Como Entero
	Escribir "Dame números y cuento los que son positivos: "
	Leer num
	Mientras num>0 Hacer
		cont<-cont+1
		Escribir "Dame otro número: "
		Leer num
	FinMientras
	Escribir "El número total de positivos es: " cont
FinAlgoritmo
