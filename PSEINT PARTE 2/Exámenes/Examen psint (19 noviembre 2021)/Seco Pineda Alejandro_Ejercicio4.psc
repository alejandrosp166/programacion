//ALEJANDRO SECO PINEDA 1ºDAM
Algoritmo Ejercicio4
	Escribir "introduce la longitud de la serpiente: "
	Leer longSerp
	//Pintar la cabeza de la serpiente
	Para i=1 Hasta 12 Hacer
		Escribir Sin Saltar " "
	FinPara
	Escribir "@"
	//PINTAR EL CUERPO DE LA SERPIENTE
	contEspacios=0
	Para i=1 Hasta longSerp Hacer
		numAzar=AZAR(3)+1
		Para j=1 Hasta numAzar+10 Hacer
			Escribir Sin Saltar " "
		FinPara
		Escribir "*"
	FinPara
	Escribir ""
FinAlgoritmo
