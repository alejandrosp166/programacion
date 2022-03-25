Algoritmo Ejercicio11punto1
	Escribir "Dame una palabra: "
	Definir palabra, letra Como Caracter
	Leer palabra
	cont=Longitud(palabra)
	Para i=1 Hasta Longitud(palabra) Hacer
		letra=Subcadena(palabra,cont,cont)
		reves=reves+letra
		cont=cont-1
	FinPara
	Escribir reves
FinAlgoritmo
