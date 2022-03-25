Algoritmo Ejercicio9punto6
	Dimension datos[7]
	Para i=1 Hasta 7 Hacer
		Escribir "Dame la posición ", i
		Leer datos[i]
	FinPara
	maayor=datos[1]
	
	Para i=1 Hasta 7 Hacer
		si datos[i]>maayor Entonces
			maayor=datos[i]
		FinSi
	FinPara
	
	Escribir "El mayor de los números introducidos es: " maayor
FinAlgoritmo
