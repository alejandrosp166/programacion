// A partir del ejemplo que dibuja un rectángulo de asteriscos, crea un que 
//dibuje un cuadrado (deberá pedir sólo un dato, el lado, y ambas órdenes "para" 
//deberán tener ese valor como límite).

Algoritmo Ejercicio8punto7
	Escribir "Dame el lado del cuadrado: "
	Leer lado
	Para x<-1 Hasta lado Hacer
		Para i<-1 Hasta lado Hacer
			Escribir Sin Saltar "*"
		FinPara
		Escribir ""
		//x<-x+1
	FinPara
	
FinAlgoritmo
