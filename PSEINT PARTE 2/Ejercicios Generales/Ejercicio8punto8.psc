//Dibuja un triángulo creciente de asteriscos, del tamaño que indique el usuario. 
//Por ejemplo, si escoge 4, el resultado debería ser:

Algoritmo Ejercicio8punto8
	Escribir "Dame el tamaño de la escalera: "
	Leer lado
	cont<-0
	//lado<-lado-1
	Para x<-1 Hasta lado Hacer
		Para i<-0 Hasta cont Hacer
			Escribir Sin Saltar "*"
		FinPara
		Escribir ""
		cont<-cont+1
	FinPara
FinAlgoritmo
