//Escribe un algoritmo que pida al usuario 10 n�meros enteros 
//(pueden ser positivos, negativos o cero).
//Cuando acabe de insertar los n�meros, el algoritmo debe mostrar 
//la suma de los n�meros positivos, la
//media de los n�meros negativos y el n�mero de ceros que ha introducido el usuario.

Algoritmo Ejercicio11
	contNums<-0
	mediaNumsNegs<-1
	
	Mientras contNums<10 Hacer
		Escribir "Has introducido: " contNums " n�meros: "
		Leer num
		si num = 0 Entonces
			contCeros<-contCeros+1
		FinSi
		si num>0 Entonces
			numPos<-num+numPos
		SiNo
			numNeg<-num+numNeg
			contNeg<-contNeg+1
			mediaNumsNegs<-numNeg/contNeg
		FinSi
		contNums<-contNums+1
	FinMientras
	
	Escribir "Has introducido 10 n�meros"
	Escribir "La cantidad de 0 que se han introducido ha sido: " contCeros
	Escribir "La suma de los n�meros positivos es: " numPos
	Escribir "La media de los n�meros negativos es: " mediaNumsNegs

FinAlgoritmo
