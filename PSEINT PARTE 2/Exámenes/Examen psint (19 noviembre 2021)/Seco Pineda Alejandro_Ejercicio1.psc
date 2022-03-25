//Alejandro Seco Pineda 1ºDAM
Algoritmo Ejercicio1
	printMenu
	Escribir "Dame una opción"
	Leer opc
	Mientras opc<>0 Hacer
		Segun opc Hacer
			1:
				Escribir "Ha elegido sumar, dame el primer número: "
				Leer num1
				Escribir "Dame el segundo número: "
				Leer num2
				Escribir "Resultado: ", sumar(num1,num2)
				printMenu
				Escribir "¿Qué quieres hacer ahora?"
				Leer opc
			2:
				Escribir "Ha elegido restar, dame el primer número: "
				Leer num1
				Escribir "Dame el segundo número: "
				Leer num2
				Escribir "Resultado: ", restar(num1,num2)
				printMenu
				Escribir "¿Qué quieres hacer ahora?"
				Leer opc
			3:
				Escribir "Ha elegido multiplicar, dame el primer número: "
				Leer num1
				Escribir "Dame el segundo número: "
				Leer num2
				Escribir "Resultado: ", multiplicar(num1,num2)
				printMenu
				Escribir "¿Qué quieres hacer ahora?"
				Leer opc
			4:
				Escribir "Ha elegido dividir, dame el primer número: "
				Leer num1
				Escribir "Dame el segundo número: "
				Leer num2
				Escribir "Resultado: ", dividir(num1,num2)
				printMenu
				Escribir "¿Qué quieres hacer ahora?"
				Leer opc
			0:
				//SALIR DEL EJERCICIO
			De Otro Modo:
				Escribir "Opción no reconocida, introduzca de nuevo que quiere seleccionar"
				printMenu
				Leer opc
	FinSegun
	FinMientras
FinAlgoritmo

//FUNCIÓN PARA SUMAR LOS VALORES
Funcion resultado = sumar(n1,n2)
		resultado=n1+n2
FinFuncion
//FUNCIÓN PRA RESTAR LOS VALORES
Funcion resultado = restar(n1,n2)
	resultado=n1-n2
FinFuncion
//FUNCIÓN PARA MULTIPLICAR LOS VALORES
Funcion resultado = multiplicar(n1,n2)
	resultado=n1*n2
FinFuncion
//FUNCIÓN PARA DIVIDIR LOS VALORES
Funcion resultado = dividir(n1,n2)
	resultado=n1/n2
FinFuncion
//SUBPROCESO QUE LLAMA AL MENÚ
SubProceso printMenu
	Escribir "-----MENÚ DE OPCIONES-----"
	Escribir "1.Sumar dos números-------"
	Escribir "2.Restar dos números------"
	Escribir "3.Multiplicar dos números-"
	Escribir "4.Dividir dos números-----"
	Escribir "0.-------SALIR------------"
FinSubProceso
	