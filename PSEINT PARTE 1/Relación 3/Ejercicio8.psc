//Escribe un algoritmo que calcule el �rea de un tri�ngulo y el �rea de un c�rculo y 
//que muestre por pantalla
//cual de las dos figuras es mayor.

Algoritmo Ejercicio8
	
	Escribir "Dame la base y la altura del tri�ngulo: "
	Leer baseT, alturaT
	Escribir "Dame el radio del c�rculo: "
	Leer radio
	
	areaT<-(baseT*alturaT)/2
	areaC<-PI*radio^2
	
	si areaT>areaC Entonces
		Escribir "El tri�ngulo tiene m�s superficie ",areaC," < ", areaT
	SiNo
		Escribir "El c�rculo tiene m�s superficie ", areaC," > ", areaT
	FinSi
	
FinAlgoritmo
