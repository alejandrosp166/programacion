Algoritmo Ejercicio2
	
	Escribir "Dame dos n�meros: "
	Leer num1,num2
	Escribir "-------Elija una opci�n-------"
	Escribir "A. Sumar los n�meros         -"
	Escribir "B. Restar los n�meros        -"
	Escribir "C. Multiplicar los n�meros   -"
	Escribir "D. Dividir los n�meros       -"
	Escribir "------------------------------"
	Leer opc
	
	Segun opc Hacer
		"A" o "a":
			suma<-num1+num2
			Escribir "El resultado de la suma es: " suma
		"B" o "b":
			resta<-num1-num2
			Escribir "El resultado de la resta es: " resta
		"C" o "c":
			mul<-num1*num2
			Escribir "El resultado de la multiplicaci�n es: " mul
		"D" o "d":
			div<-num1/num2
			Escribir "El resultado de la divisi�n es: " div
		De Otro Modo:
			Escribir "Porfavor elige entre A,B,C y D"
	FinSegun
	
FinAlgoritmo
