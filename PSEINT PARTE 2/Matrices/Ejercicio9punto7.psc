Algoritmo Ejercicio9punto7
	Dimension datos[10]
	
	Para i=1 Hasta 10 Hacer //Sirve para darle valores al vector
		datos[i]=i
	FinPara
	
	Escribir "�Qu� dato desea buscar?"
	Leer num
	cont=0
	
	Para i=1 Hasta 10 Hacer
		si datos[i] == num Entonces
			cont=cont+1
		FinSi
	FinPara
	si cont>0 Entonces
		Escribir "El dato se ha encontrado: " cont
	SiNo
		Escribir "No se encontr� el dato dentro del vector"
	FinSi
FinAlgoritmo
