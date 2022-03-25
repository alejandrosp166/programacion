Algoritmo Ejercicio2
	
	Escribir "Dame dos números: "
	Leer num1,num2
	Escribir "-------Elija una opción-------"
	Escribir "A. Sumar los números         -"
	Escribir "B. Restar los números        -"
	Escribir "C. Multiplicar los números   -"
	Escribir "D. Dividir los números       -"
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
			Escribir "El resultado de la multiplicación es: " mul
		"D" o "d":
			div<-num1/num2
			Escribir "El resultado de la división es: " div
		De Otro Modo:
			Escribir "Porfavor elige entre A,B,C y D"
	FinSegun
	
FinAlgoritmo
