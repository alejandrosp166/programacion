Algoritmo Ejercicio3
	
	
	Definir T1 Como Caracter
	Definir T2 Como Caracter	
	
	Escribir "Dame lo que te ha salido en la tirada 1: "
	Leer T1
	Escribir "Dame lo que te ha salido en la tirada 2: "
	Leer T2
	
	Segun T1 Hacer
		"UNO":
			numT1<-1
		"DOS":
			numT1<-2
		"TRES":
			numT1<-3
		"CUATRO":
			numT1<-4
		"CINCO":
			numT1<-5
		"SEIS":
			numT1<-6
		De Otro Modo:
			Escribir "ERROR"
	FinSegun
	
	Segun T2 Hacer
		"UNO":
			numT2<-1
		"DOS":
			numT2<-2
		"TRES":
			numT2<-3
		"CUATRO":
			numT2<-4
		"CINCO":
			numT2<-5
		"SEIS":
			numT2<-6
		De Otro Modo:
			Escribir "ERROR"
	FinSegun
	
	suma<-numT1+numT2
	Escribir "La suma de las dos tiradas es: " suma
	
FinAlgoritmo
