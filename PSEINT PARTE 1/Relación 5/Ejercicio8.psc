//Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos que debe ir contando.
//Cuando el usuario no quiera insertar m�s n�meros, 
//introducir� un n�mero negativo y el algoritmo, antes
//de acabar, mostrar� cuantos n�meros positivos ha introducido anteriormente el usuario.


Algoritmo Ejercicio8
	Definir cont,num Como Entero
	Escribir "Dame n�meros y cuento los que son positivos: "
	Leer num
	Mientras num>0 Hacer
		cont<-cont+1
		Escribir "Dame otro n�mero: "
		Leer num
	FinMientras
	Escribir "El n�mero total de positivos es: " cont
FinAlgoritmo
