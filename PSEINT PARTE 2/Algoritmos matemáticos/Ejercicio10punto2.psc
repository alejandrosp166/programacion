Algoritmo Ejercicio10punto2
	Escribir "Dame un número y hago su raíz: "
	Leer num
	Mientras num<>0 Hacer
		si num<0 Entonces
			Escribir "El número es negativo por lo que no hay resultado"
			Escribir "Dame otro número: "
			Leer num
		SiNo
			Escribir RC(num)," Es el resultado de la raíz"
			Escribir "Dame otro número: "
			Leer num
		FinSi
	FinMientras
	
	Escribir "Fin del programa"
FinAlgoritmo
