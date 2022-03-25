Algoritmo Ejercicio12punto4
	EscribirEspacios("Hola, tú")
FinAlgoritmo

SubProceso EscribirEspacios(txt)
	Para i=1 Hasta Longitud(txt) Hacer
		letra=Subcadena(txt,i,i)
		si letra<>" " Entonces
			Escribir Sin Saltar letra, " " 
		FinSi
	FinPara
FinSubProceso
	