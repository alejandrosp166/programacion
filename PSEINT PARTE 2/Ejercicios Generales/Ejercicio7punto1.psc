//Crea un programa que pida al usuario un c�digo de usuario y una contrase�a. 
//Deber� repetirse hasta que el c�digo sea "1" y la contrase�a sea "1234"

Algoritmo Ejercicio7punto1
	Definir usu,contra Como Caracter
	
	Escribir "Dame tu usuario: "
	Leer usu
	Escribir "Dame tu contrase�a: "
	Leer contra
	
	Mientras usu<>"1" o contra<>"1234" Hacer
		Escribir "ERROR"
		Escribir "Dame tu usuario: "
		Leer usu
		Escribir "Dame tu contrase�a: "
		Leer contra
	FinMientras
	Escribir "Bienvenido"
	
FinAlgoritmo
