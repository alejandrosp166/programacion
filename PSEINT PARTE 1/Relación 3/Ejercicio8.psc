//Escribe un algoritmo que calcule el área de un triángulo y el área de un círculo y 
//que muestre por pantalla
//cual de las dos figuras es mayor.

Algoritmo Ejercicio8
	
	Escribir "Dame la base y la altura del triángulo: "
	Leer baseT, alturaT
	Escribir "Dame el radio del círculo: "
	Leer radio
	
	areaT<-(baseT*alturaT)/2
	areaC<-PI*radio^2
	
	si areaT>areaC Entonces
		Escribir "El triángulo tiene más superficie ",areaC," < ", areaT
	SiNo
		Escribir "El círculo tiene más superficie ", areaC," > ", areaT
	FinSi
	
FinAlgoritmo
