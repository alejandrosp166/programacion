//Haz un programa que pida al usuario dos números y 
//diga cuántos de ellos son positivos

Algoritmo Ejercicio11
	
	Escribir "Dame dos números: "
	Leer num1, num2
	conPos<-0
	
	si num1 >= 0 Entonces
		conPos=conPos+1
	FinSi
	
	si num2 >= 0 Entonces
		conPos=conPos+1
	FinSi
	
	Escribir "El número de positivos es: ", conPos
	
FinAlgoritmo
