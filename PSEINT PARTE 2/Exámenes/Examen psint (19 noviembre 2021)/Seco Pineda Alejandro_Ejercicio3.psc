//ALEJANDRO SECO PINEDA 1ºDAM
Algoritmo Ejercicio3
	Escribir "Dame una palabra/frase y te digo si es palíndroma o no"
	Leer palabra
	
	si palidroma(palabra)==Verdadero Entonces
		Escribir "La palabra/frase es palíndroma"
	SiNo
		Escribir "La palabra/frase no es palíndroma"
	FinSi
FinAlgoritmo
//FUNCIÓN QUE DICE SI LA PALABRA ES PALÍNDROMA O NO
Funcion resultado=palidroma(p)
	Definir sinEspacios Como Caracter

	Para i=1 Hasta Longitud(p) Hacer
		si Subcadena(p,i,i)<>" " Entonces
			sinEspacios=sinEspacios+Subcadena(p,i,i)
		FinSi
	FinPara
	cont=Longitud(sinEspacios)
	
	Para i=1 Hasta Longitud(sinEspacios) Hacer
		letra=Subcadena(sinEspacios,cont,cont)
		reves=reves+letra
		cont=cont-1
	FinPara
	
	si Minusculas(reves) == Minusculas(sinEspacios) Entonces
		resultado=Verdadero
	SiNo
		resultado=Falso
	FinSi
FinFuncion
