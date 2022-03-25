//Crea un programa que pida al usuario dos números y muestre su división 
//si el segundo no es cero, o un mensaje de aviso en caso contrario.

Algoritmo Ejercicio12
	
	Escribir "Dame dos números: "
	Leer num1, num2
	div<-0
	si num2 = 0 Entonces
		Escribir "No se puede dividir entre 0"
	Sino
		div = num1/num2
		Escribir "El resultado de divir es: " div
	FinSi
	
FinAlgoritmo
