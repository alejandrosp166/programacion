//ALEJANDRO SECO PINEDA 1�DAM
Algoritmo Ejercicio3
	Escribir "Dame una palabra/frase y te digo si es pal�ndroma o no"
	Leer palabra
	
	si palidroma(palabra)==Verdadero Entonces
		Escribir "La palabra/frase es pal�ndroma"
	SiNo
		Escribir "La palabra/frase no es pal�ndroma"
	FinSi
FinAlgoritmo
//FUNCI�N QUE DICE SI LA PALABRA ES PAL�NDROMA O NO
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
