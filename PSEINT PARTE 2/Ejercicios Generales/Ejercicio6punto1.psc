//Crea un programa que pida al usuario una contraseña, de forma repetitiva mientras 
//que no introduzca "1234". Cuando finalmente escriba la contraseña correcta, se le dirá "
//Bienvenido" y terminará el programa.

Algoritmo Ejercicio6punto1
	Escribir "Dame la contraseña: "
	Definir contra Como Caracter
	Leer contra
	
	Mientras contra<>"1234" Hacer
		Leer contra
	FinMientras
	Escribir "Bienvenido"
FinAlgoritmo
