//Escribe un algoritmo que pida al usuario un número real y muestre por pantalla la nota del alumno,
//teniendo en cuenta:
	//a. 0-5 es INSUFICIENTE (0 inclusive)
	//b. 5-6 es SUFICIENTE (5 inclusive)
	//c. 6-7 es BIEN (6 inclusive)
	//d. 7-9 es NOTABLE (7 inclusive)
	//e. 9-10 es SOBRESALIENTE (9 y 10 inclusives)

Algoritmo Ejercicio7
	
	Escribir "Dame tu nota: "
	Leer nota
	
	si nota >= 0 y nota < 5 Entonces
		Escribir "Insuficiente"
	FinSi
	
	si nota >= 5 y nota < 6 Entonces
		Escribir "Suficiente"
	FinSi
	
	si nota >= 6 y nota < 7 Entonces
		Escribir "Bien"
	FinSi
	
	si nota >= 7 y nota <9 Entonces
		Escribir "Notable"
	FinSi
	
	si nota >= 9 y nota < 11 Entonces
		Escribir "Sobresaliente"
	FinSi
	
FinAlgoritmo
