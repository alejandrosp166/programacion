Algoritmo Ejercicio12punto2
	Escribir "Dame un número: "
	Leer num
	Escribir "El número de divisores de ", num, " es: ", CantidadDeDivisores(num)
FinAlgoritmo

Funcion cont <- CantidadDeDivisores(n)
	Para i=1 Hasta n Hacer
		si n%i=0 Entonces
			cont=cont+1
		FinSi
	FinPara
FinFuncion
	