Algoritmo Ejercicio11punto6
	Escribir "Dame tu nombre y apellidos"
	Definir palabra, solucion Como Caracter
	Leer palabra
	palabra=Minusculas(palabra)
	
	Para i=1 Hasta Longitud(palabra) Hacer
		letra=Subcadena(palabra,i,i)
		letraAnterior=Subcadena(palabra,i-1,i-1)
		si i=1 Entonces
			letra=Mayusculas(letra)
		SiNo
			si letraAnterior=" " Entonces
				letra=Mayusculas(letra)
			FinSi
		FinSi
		solucion=solucion+letra
	FinPara
	Escribir solucion
FinAlgoritmo
