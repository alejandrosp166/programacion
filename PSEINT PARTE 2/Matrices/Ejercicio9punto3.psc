Algoritmo Ejercicio9punto3
	Dimension datos[5]
	Definir almacenMayores Como Caracter
	
	Para i=1 Hasta 5 Hacer
		leer datos[i]
		suma=datos[i]+suma
	FinPara
	media=suma/5
	
	Para i=1 Hasta 5 Hacer
		si datos[i]>media Entonces
			almacenMayores=almacenMayores + " " + ConvertirATexto(datos[i])
		FinSi
	FinPara
	Escribir "La media de los números es: ", media
	Escribir "Los números mayores a la media son: ", almacenMayores
FinAlgoritmo
