//Haz un programa que pida al usuario dos n�meros y 
//diga cu�ntos de ellos son positivos

Algoritmo Ejercicio11
	
	Escribir "Dame dos n�meros: "
	Leer num1, num2
	conPos<-0
	
	si num1 >= 0 Entonces
		conPos=conPos+1
	FinSi
	
	si num2 >= 0 Entonces
		conPos=conPos+1
	FinSi
	
	Escribir "El n�mero de positivos es: ", conPos
	
FinAlgoritmo
