//Alejandro Seco Pineda 1ºDAM
Algoritmo Ejercicio2
	programaCompleto
FinAlgoritmo

SubProceso programaCompleto
	menuPrincipal
	Escribir "Dime la opción que quieres elegir: "
	Leer opcMP//opciones menú principal
	Mientras opcMP<>0 Hacer
		Segun opcMP Hacer
			1://MENÚ OPERACIONES BÁSICAS
				menuPrimero
				Escribir "Dime la opción que quieres elegir: "
				Leer opcPri
				Mientras opcPri<>0 Hacer
					Segun opcPri Hacer
						1:
							Escribir "Ha elegido sumar, dame el primer número: "
							Leer num1
							Escribir "Dame el segundo número: "
							Leer num2
							Escribir "Resultado: ", sumar(num1,num2)
							menuPrimero
							Escribir "¿Qué quieres hacer ahora?"
							Leer opcPri
						2:
							Escribir "Ha elegido restar, dame el primer número: "
							Leer num1
							Escribir "Dame el segundo número: "
							Leer num2
							Escribir "Resultado: ", restar(num1,num2)
							menuPrimero							
							Escribir "¿Qué quieres hacer ahora?"
							Leer opcPri
						3:
							Escribir "Ha elegido multiplicar, dame el primer número: "
							Leer num1
							Escribir "Dame el segundo número: "
							Leer num2
							Escribir "Resultado: ", multiplicar(num1,num2)
							menuPrimero
							Escribir "¿Qué quieres hacer ahora?"
							Leer opcPri
						4:
							Escribir "Ha elegido dividir, dame el primer número: "
							Leer num1
							Escribir "Dame el segundo número: "
							Leer num2
							Escribir "Resultado: ", dividir(num1,num2)
							menuPrimero
							Escribir "¿Qué quieres hacer ahora?"
							Leer opcPri
						0:
							//NO CONSIGO HACER QUE VUELVA ATRÁS, HE PENSADO QUE METIENDO AQUÍ EL SUBPROCESO DEL PROGRAMA AL COMPLETO PODRÍA FUNCIONAR PERO NO FUNCIONA
						De Otro Modo:
							Escribir "Opción no reconocida, introduzca de nuevo que quiere seleccionar"
							menuPrimero
							Leer opcPri
					FinSegun
				FinMientras
			2://MENÚ OPERACIONES MÁS COMPLEJAS
				menuSegundo
				Escribir "Dime la opción que quieres elegir: "
				Leer opcSeg
				Mientras opcSeg<>0 Hacer
					Segun opcSeg Hacer
						1:
							Escribir "Dame un número y lo transformo al lugar que ocupa en la semana: "
							Leer n
							Escribir  diaSemana(n)
						2:
							Escribir "Dame un número y te digo la suma desde 1 hasta el número introducido:"
							Leer n
							Escribir sumanNumeros(n)
						3:
							Escribir "Dame un número y te digo si es primo o no: "
							Leer n
							Escribir numerosPrimos(n)
						4:
							Escribir "Dame un número de 4 cifras y lo invierto: "
							Definir n Como Caracter
							Leer n
							Escribir numeroInvertido(n)
						0:
							//NO CONSIGO HACER QUE VUELVA ATRÁS, HE PENSADO QUE METIENDO AQUÍ EL SUBPROCESO DEL PROGRAMA AL COMPLETO PODRÍA FUNCIONAR PERO NO FUNCIONA
						De Otro Modo:
							Escribir "Opción no  reconocida, vuelva a introducir la opción que quieres elegir"
							menuSegundo
							Leer opcSeg
					FinSegun
				FinMientras
			0:
				//SALIR DEL PROGRAMA
			De Otro Modo:
				Escribir "Opción no  reconocida, vuelva a introducir la opción que quieres elegir"
				menuPrincipal
				Leer opcMP
		FinSegun
	FinMientras
FinSubProceso

SubProceso menuSegundo
	Escribir "-----------------MENÚ OPC 2----------------"
	Escribir "1.Número y día                            -"
	Escribir "2.Suma de los n primeros números naturales-"
	Escribir "3.Número primo                            -"
	Escribir "4.Invertir un número de 4 cifras          -"
	Escribir "0.Volver al menú principal                -"
	Escribir "-------------------------------------------"
FinSubProceso

SubProceso menuPrincipal
	Escribir "-------MENÚ PRINCIPAL--------"
	Escribir "1.Operaciones básicas       -"
	Escribir "2.Operaciones variadas      -"
	Escribir "0.SALIR                     -"
	Escribir "-----------------------------"
FinSubProceso

SubProceso menuPrimero
	Escribir "---------MENÚ OPC 1-------"
	Escribir "1.Sumar dos números      -"
	Escribir "2.Restar dos números     -"
	Escribir "3.Multiplicar dos números-"
	Escribir "4.Dividir dos números    -"
	Escribir "0.-------SALIR------------"
FinSubProceso

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
//FUNCIÓN QUE PREGUNTA UN NÚMERO Y TE DEVUELVE EL DÍA DE LA SEMANA
Funcion resultado=diaSemana(nDia)
	Segun nDia Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Miércoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "Sábado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "El número debe estar comprendido entre el 1 y el 7"
	FinSegun
	Escribir "¿Qué quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion
//FUNCIÓN QUE HACE UNA SUMA DE LOS NÚMEROS DESDE 1 HASTA UN NÚMERO QUE INTRODUZCAS
Funcion resultado = sumanNumeros(nNaturales)
	Para i=1 Hasta nNaturales Hacer
		sumaNaturales=sumaNaturales+i
	FinPara
	Escribir "La suma desde 1 hasta ", nNaturales, " es: ", sumaNaturales
	
	Escribir "¿Qué quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion
//FUNCIÓN QUE TE DICE SI EL NÚMERO ES PRIMO O NO
Funcion resultado = numerosPrimos(nPrimo)
	cont=0
	Para i=1 Hasta nPrimo Hacer
		si nPrimo%i==0 Entonces
			cont=cont+1
		FinSi
	FinPara
	
	si cont==2 Entonces
		Escribir nPrimo," es primo"
	SiNo
		Escribir  nPrimo, " no es primo"					
	FinSi
	Escribir "¿Qué quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion

Funcion resultado=numeroInvertido(nInvertido)	
	Mientras Longitud(nInvertido)<>4 Hacer
		Escribir "El número debe ser de 4 cifras"
		Leer nInvertido
	FinMientras
	contInvertido=Longitud(nInvertido)
	
	Para i=1 Hasta Longitud(nInvertido) Hacer
		car=Subcadena(nInvertido,contInvertido,contInvertido)
		reves=reves+car
		contInvertido=contInvertido-1
	FinPara
	Escribir nInvertido, "al revés es: ", reves
	Escribir "¿Qué quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion	