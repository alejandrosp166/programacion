Algoritmo Ejercicio12punto3
	Escribir "Dame dos n�meros enteros: "
	Leer num1,num2
	
	si 	EsMultiplo(num1,num2) Entonces
		Escribir num2, " es m�ltiplo de: ", num1
	SiNo
		Escribir num2, " no es m�ltiplo de: ", num1
	FinSi
FinAlgoritmo

Funcion  varlog = EsMultiplo(n1,n2)
	varLog=Falso
	Para i=0 Hasta n2 Hacer
		si n2 == n1*i Entonces
			varLog=Verdadero
		FinSi
	FinPara
FinFuncion