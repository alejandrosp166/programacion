//Alejandro Seco Pineda 1�DAM
Algoritmo Ejercicio1
	printMenu
	Escribir "Dame una opci�n"
	Leer opc
	Mientras opc<>0 Hacer
		Segun opc Hacer
			1:
				Escribir "Ha elegido sumar, dame el primer n�mero: "
				Leer num1
				Escribir "Dame el segundo n�mero: "
				Leer num2
				Escribir "Resultado: ", sumar(num1,num2)
				printMenu
				Escribir "�Qu� quieres hacer ahora?"
				Leer opc
			2:
				Escribir "Ha elegido restar, dame el primer n�mero: "
				Leer num1
				Escribir "Dame el segundo n�mero: "
				Leer num2
				Escribir "Resultado: ", restar(num1,num2)
				printMenu
				Escribir "�Qu� quieres hacer ahora?"
				Leer opc
			3:
				Escribir "Ha elegido multiplicar, dame el primer n�mero: "
				Leer num1
				Escribir "Dame el segundo n�mero: "
				Leer num2
				Escribir "Resultado: ", multiplicar(num1,num2)
				printMenu
				Escribir "�Qu� quieres hacer ahora?"
				Leer opc
			4:
				Escribir "Ha elegido dividir, dame el primer n�mero: "
				Leer num1
				Escribir "Dame el segundo n�mero: "
				Leer num2
				Escribir "Resultado: ", dividir(num1,num2)
				printMenu
				Escribir "�Qu� quieres hacer ahora?"
				Leer opc
			0:
				//SALIR DEL EJERCICIO
			De Otro Modo:
				Escribir "Opci�n no reconocida, introduzca de nuevo que quiere seleccionar"
				printMenu
				Leer opc
	FinSegun
	FinMientras
FinAlgoritmo

//FUNCI�N PARA SUMAR LOS VALORES
Funcion resultado = sumar(n1,n2)
		resultado=n1+n2
FinFuncion
//FUNCI�N PRA RESTAR LOS VALORES
Funcion resultado = restar(n1,n2)
	resultado=n1-n2
FinFuncion
//FUNCI�N PARA MULTIPLICAR LOS VALORES
Funcion resultado = multiplicar(n1,n2)
	resultado=n1*n2
FinFuncion
//FUNCI�N PARA DIVIDIR LOS VALORES
Funcion resultado = dividir(n1,n2)
	resultado=n1/n2
FinFuncion
//SUBPROCESO QUE LLAMA AL MEN�
SubProceso printMenu
	Escribir "-----MEN� DE OPCIONES-----"
	Escribir "1.Sumar dos n�meros-------"
	Escribir "2.Restar dos n�meros------"
	Escribir "3.Multiplicar dos n�meros-"
	Escribir "4.Dividir dos n�meros-----"
	Escribir "0.-------SALIR------------"
FinSubProceso
	