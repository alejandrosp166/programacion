//Escribe un algoritmo que pida al usuario el radio de un c�rculo e imprima por pantalla
//el �rea y el per�metro del circulo. Ten en cuenta que debes tener una constante para
//guardar el valor de PI (que debe ser 3.1416).

Algoritmo Ejercicio4
	
	Escribir "Dame el radio: "
	Leer radio
	
	area<-0
	perimetro<-0
	
	area<-PI*radio^2//EST� MAL LA F�RMULA
	perimetro<-2*PI*radio//ESTA MAL LA F�RMULA
	
	Escribir "El �rea del c�rculo es: ", area," y el per�metro: ", perimetro
	
FinAlgoritmo
