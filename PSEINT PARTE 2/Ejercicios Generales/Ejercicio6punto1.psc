//Crea un programa que pida al usuario una contrase�a, de forma repetitiva mientras 
//que no introduzca "1234". Cuando finalmente escriba la contrase�a correcta, se le dir� "
//Bienvenido" y terminar� el programa.

Algoritmo Ejercicio6punto1
	Escribir "Dame la contrase�a: "
	Definir contra Como Caracter
	Leer contra
	
	Mientras contra<>"1234" Hacer
		Leer contra
	FinMientras
	Escribir "Bienvenido"
FinAlgoritmo
