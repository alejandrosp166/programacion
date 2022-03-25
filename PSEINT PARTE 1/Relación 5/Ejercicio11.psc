//Escribe un algoritmo que pida al usuario 10 números enteros 
//(pueden ser positivos, negativos o cero).
//Cuando acabe de insertar los números, el algoritmo debe mostrar 
//la suma de los números positivos, la
//media de los números negativos y el número de ceros que ha introducido el usuario.

Algoritmo Ejercicio11
	contNums<-0
	mediaNumsNegs<-1
	
	Mientras contNums<10 Hacer
		Escribir "Has introducido: " contNums " números: "
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
	
	Escribir "Has introducido 10 números"
	Escribir "La cantidad de 0 que se han introducido ha sido: " contCeros
	Escribir "La suma de los números positivos es: " numPos
	Escribir "La media de los números negativos es: " mediaNumsNegs

FinAlgoritmo
