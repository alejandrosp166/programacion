//Dibuja un tri�ngulo creciente de asteriscos, del tama�o que indique el usuario. 
//Por ejemplo, si escoge 4, el resultado deber�a ser:

Algoritmo Ejercicio8punto8
	Escribir "Dame el tama�o de la escalera: "
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
