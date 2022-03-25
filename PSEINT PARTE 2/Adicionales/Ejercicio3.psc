//Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa


Algoritmo Ejercicio3
	
	Escribir "Dame un número: "
	Leer num
	
	cent=num/100
	unid=cent%100
	
	si cent==unid Entonces 
		Escribir "Es un número capicúa"
	SiNo
		Escribir "No es un número capicúa"
	FinSi
FinAlgoritmo
