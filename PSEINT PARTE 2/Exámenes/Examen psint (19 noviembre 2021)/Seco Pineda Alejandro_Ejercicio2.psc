//Alejandro Seco Pineda 1�DAM
Algoritmo Ejercicio2
	programaCompleto
FinAlgoritmo

SubProceso programaCompleto
	menuPrincipal
	Escribir "Dime la opci�n que quieres elegir: "
	Leer opcMP//opciones men� principal
	Mientras opcMP<>0 Hacer
		Segun opcMP Hacer
			1://MEN� OPERACIONES B�SICAS
				menuPrimero
				Escribir "Dime la opci�n que quieres elegir: "
				Leer opcPri
				Mientras opcPri<>0 Hacer
					Segun opcPri Hacer
						1:
							Escribir "Ha elegido sumar, dame el primer n�mero: "
							Leer num1
							Escribir "Dame el segundo n�mero: "
							Leer num2
							Escribir "Resultado: ", sumar(num1,num2)
							menuPrimero
							Escribir "�Qu� quieres hacer ahora?"
							Leer opcPri
						2:
							Escribir "Ha elegido restar, dame el primer n�mero: "
							Leer num1
							Escribir "Dame el segundo n�mero: "
							Leer num2
							Escribir "Resultado: ", restar(num1,num2)
							menuPrimero							
							Escribir "�Qu� quieres hacer ahora?"
							Leer opcPri
						3:
							Escribir "Ha elegido multiplicar, dame el primer n�mero: "
							Leer num1
							Escribir "Dame el segundo n�mero: "
							Leer num2
							Escribir "Resultado: ", multiplicar(num1,num2)
							menuPrimero
							Escribir "�Qu� quieres hacer ahora?"
							Leer opcPri
						4:
							Escribir "Ha elegido dividir, dame el primer n�mero: "
							Leer num1
							Escribir "Dame el segundo n�mero: "
							Leer num2
							Escribir "Resultado: ", dividir(num1,num2)
							menuPrimero
							Escribir "�Qu� quieres hacer ahora?"
							Leer opcPri
						0:
							//NO CONSIGO HACER QUE VUELVA ATR�S, HE PENSADO QUE METIENDO AQU� EL SUBPROCESO DEL PROGRAMA AL COMPLETO PODR�A FUNCIONAR PERO NO FUNCIONA
						De Otro Modo:
							Escribir "Opci�n no reconocida, introduzca de nuevo que quiere seleccionar"
							menuPrimero
							Leer opcPri
					FinSegun
				FinMientras
			2://MEN� OPERACIONES M�S COMPLEJAS
				menuSegundo
				Escribir "Dime la opci�n que quieres elegir: "
				Leer opcSeg
				Mientras opcSeg<>0 Hacer
					Segun opcSeg Hacer
						1:
							Escribir "Dame un n�mero y lo transformo al lugar que ocupa en la semana: "
							Leer n
							Escribir  diaSemana(n)
						2:
							Escribir "Dame un n�mero y te digo la suma desde 1 hasta el n�mero introducido:"
							Leer n
							Escribir sumanNumeros(n)
						3:
							Escribir "Dame un n�mero y te digo si es primo o no: "
							Leer n
							Escribir numerosPrimos(n)
						4:
							Escribir "Dame un n�mero de 4 cifras y lo invierto: "
							Definir n Como Caracter
							Leer n
							Escribir numeroInvertido(n)
						0:
							//NO CONSIGO HACER QUE VUELVA ATR�S, HE PENSADO QUE METIENDO AQU� EL SUBPROCESO DEL PROGRAMA AL COMPLETO PODR�A FUNCIONAR PERO NO FUNCIONA
						De Otro Modo:
							Escribir "Opci�n no  reconocida, vuelva a introducir la opci�n que quieres elegir"
							menuSegundo
							Leer opcSeg
					FinSegun
				FinMientras
			0:
				//SALIR DEL PROGRAMA
			De Otro Modo:
				Escribir "Opci�n no  reconocida, vuelva a introducir la opci�n que quieres elegir"
				menuPrincipal
				Leer opcMP
		FinSegun
	FinMientras
FinSubProceso

SubProceso menuSegundo
	Escribir "-----------------MEN� OPC 2----------------"
	Escribir "1.N�mero y d�a                            -"
	Escribir "2.Suma de los n primeros n�meros naturales-"
	Escribir "3.N�mero primo                            -"
	Escribir "4.Invertir un n�mero de 4 cifras          -"
	Escribir "0.Volver al men� principal                -"
	Escribir "-------------------------------------------"
FinSubProceso

SubProceso menuPrincipal
	Escribir "-------MEN� PRINCIPAL--------"
	Escribir "1.Operaciones b�sicas       -"
	Escribir "2.Operaciones variadas      -"
	Escribir "0.SALIR                     -"
	Escribir "-----------------------------"
FinSubProceso

SubProceso menuPrimero
	Escribir "---------MEN� OPC 1-------"
	Escribir "1.Sumar dos n�meros      -"
	Escribir "2.Restar dos n�meros     -"
	Escribir "3.Multiplicar dos n�meros-"
	Escribir "4.Dividir dos n�meros    -"
	Escribir "0.-------SALIR------------"
FinSubProceso

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
//FUNCI�N QUE PREGUNTA UN N�MERO Y TE DEVUELVE EL D�A DE LA SEMANA
Funcion resultado=diaSemana(nDia)
	Segun nDia Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Mi�rcoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "S�bado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "El n�mero debe estar comprendido entre el 1 y el 7"
	FinSegun
	Escribir "�Qu� quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion
//FUNCI�N QUE HACE UNA SUMA DE LOS N�MEROS DESDE 1 HASTA UN N�MERO QUE INTRODUZCAS
Funcion resultado = sumanNumeros(nNaturales)
	Para i=1 Hasta nNaturales Hacer
		sumaNaturales=sumaNaturales+i
	FinPara
	Escribir "La suma desde 1 hasta ", nNaturales, " es: ", sumaNaturales
	
	Escribir "�Qu� quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion
//FUNCI�N QUE TE DICE SI EL N�MERO ES PRIMO O NO
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
	Escribir "�Qu� quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion

Funcion resultado=numeroInvertido(nInvertido)	
	Mientras Longitud(nInvertido)<>4 Hacer
		Escribir "El n�mero debe ser de 4 cifras"
		Leer nInvertido
	FinMientras
	contInvertido=Longitud(nInvertido)
	
	Para i=1 Hasta Longitud(nInvertido) Hacer
		car=Subcadena(nInvertido,contInvertido,contInvertido)
		reves=reves+car
		contInvertido=contInvertido-1
	FinPara
	Escribir nInvertido, "al rev�s es: ", reves
	Escribir "�Qu� quieres hacer ahora?"
	menuSegundo
	Leer opcSeg
FinFuncion	