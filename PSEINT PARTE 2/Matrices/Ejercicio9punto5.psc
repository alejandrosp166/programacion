Algoritmo Ejercicio9punto5
	Dimension datos1[3]
	Dimension datos2[3]
	
	Para i=1 Hasta 3 Hacer
		Escribir "Dame el dato ", i," del primer vector"	
		leer datos1[i]
		Escribir "Dame el dato ", i," del segundo vector"
		Leer datos2[i]
		cuenta=(datos1[i]*datos2[i])+cuenta
	FinPara
	Escribir "El resultado es: " ,cuenta
	
FinAlgoritmo
