Algoritmo Ejercicio11punto3
	Escribir "Dame una palabra"
	Definir palabra Como Caracter
	Leer palabra
	cont=0
	Para i=1 Hasta Longitud(palabra) Hacer
		letra=Subcadena(palabra,i,i)
		si letra="a" o letra="e" o letra="i" o letra="o" o letra="u" Entonces
			cont=cont+1
		FinSi
	FinPara
	Escribir "La palabra tiene: " ,cont," vocales"
FinAlgoritmo
