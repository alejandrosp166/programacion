//Crea un programa que pida al usuario dos bloques de 10 números cada uno 
//(usando un array de dos dimensiones). 
//Después deberá mostrar el mayor dato que se ha introducido en cada uno de esos dos bloques.

Algoritmo Ejercicio9punto8
	Dimension datos[2,10]
	Para i=1 Hasta 10 Hacer //Para darle valor al vector de manera sencilla
		datos[1,i]=i
		datos[2,i]=i
	FinPara
	
	mayorFila1=datos[1,1]
	mayorFila2=datos[2,1]
	
	Para i=1 Hasta 10 Hacer
		si datos[1,i]>mayorFila1 Entonces
			mayorFila1=datos[1,i]
		FinSi
	FinPara
	
	Para i=1 Hasta 10 Hacer
		si datos[2,i]>mayorFila2 Entonces
			mayorFila2=datos[1,i]
		FinSi
	FinPara
	
	Escribir "El mayor número de fila 1 es: " mayorFila1
	Escribir "El mayor número de fila 2 es: " mayorFila2
FinAlgoritmo
