//Escribe un algoritmo que pida al usuario el radio de un círculo e imprima por pantalla
//el área y el perímetro del circulo. Ten en cuenta que debes tener una constante para
//guardar el valor de PI (que debe ser 3.1416).

Algoritmo Ejercicio4
	
	Escribir "Dame el radio: "
	Leer radio
	
	area<-0
	perimetro<-0
	
	area<-PI*radio^2//ESTÁ MAL LA FÓRMULA
	perimetro<-2*PI*radio//ESTA MAL LA FÓRMULA
	
	Escribir "El área del círculo es: ", area," y el perímetro: ", perimetro
	
FinAlgoritmo
