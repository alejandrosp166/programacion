Algoritmo Ejercicio12punto5
	Escribir "Dame 3 numeros: "
	Leer num1,num2,num3
	Escribir MayorDeTres(num1,num2,num3)
FinAlgoritmo

Funcion  mayr = MayorDeTres(n1,n2,n3)
	si n1>n2 y n1>n3 Entonces
		mayr=n1
	FinSi
	si n2>n1 y n2>n3 Entonces
		mayr=n2
	FinSi
	si n3>n2 y n3>n1 Entonces
		mayr=n3
	FinSi
FinFuncion