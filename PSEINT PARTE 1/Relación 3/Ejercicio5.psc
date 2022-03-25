//Escribe un algoritmo que pida al usuario tres caracteres y muestre por pantalla los tres caracteres
//ordenados de mayor a menor.


Algoritmo Ejercicio5
	
	Definir car1,car2,car3 Como Caracter
	
	Escribir "Dame 3 carcteres: "
	Leer car1,car2,car3
	
	si car1>car2 y car1>car3 Entonces
		si car2>car3 Entonces
			Escribir car1, " ", car2, " ", car3
		SiNo
			Escribir car1, " ", car3, " ", car2
		FinSi
	FinSi
	
	si car2>car1 y car2>car3 Entonces
		si car1>car3 Entonces
			Escribir car2, " ", car1, " ", car3
		SiNo
			Escribir car2, " ", car3, " ", car1
		FinSi
	FinSi
	
	si car3>car1 y car3>car2 Entonces
		si car1>car2 Entonces
			Escribir car3, " ", car1, " ", car2
		SiNo
			Escribir car3, " ", car2, " ", car1
		FinSi
	FinSi
	
FinAlgoritmo
