//Crea un programa que pida al usuario un código de usuario y una contraseña. 
//Deberá repetirse hasta que el código sea "1" y la contraseña sea "1234"

Algoritmo Ejercicio7punto1
	Definir usu,contra Como Caracter
	
	Escribir "Dame tu usuario: "
	Leer usu
	Escribir "Dame tu contraseña: "
	Leer contra
	
	Mientras usu<>"1" o contra<>"1234" Hacer
		Escribir "ERROR"
		Escribir "Dame tu usuario: "
		Leer usu
		Escribir "Dame tu contraseña: "
		Leer contra
	FinMientras
	Escribir "Bienvenido"
	
FinAlgoritmo
