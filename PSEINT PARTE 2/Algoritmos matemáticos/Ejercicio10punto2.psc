Algoritmo Ejercicio10punto2
	Escribir "Dame un n�mero y hago su ra�z: "
	Leer num
	Mientras num<>0 Hacer
		si num<0 Entonces
			Escribir "El n�mero es negativo por lo que no hay resultado"
			Escribir "Dame otro n�mero: "
			Leer num
		SiNo
			Escribir RC(num)," Es el resultado de la ra�z"
			Escribir "Dame otro n�mero: "
			Leer num
		FinSi
	FinMientras
	
	Escribir "Fin del programa"
FinAlgoritmo
