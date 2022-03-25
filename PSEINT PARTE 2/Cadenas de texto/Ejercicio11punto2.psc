Algoritmo Ejercicio11punto2
	Escribir "Dame un nombre: "
	Definir palabra, solucion Como Caracter
	Leer palabra
	
	Para  i=1 Hasta Longitud(palabra) Hacer
		letra=Subcadena(palabra,i,i)
		si i%2=0 Entonces
			solucion=solucion+Minusculas(letra)
		SiNo
			solucion=solucion+Mayusculas(letra)
		FinSi
	FinPara
	Escribir solucion
FinAlgoritmo
