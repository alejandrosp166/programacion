Algoritmo Ejercicio12punto8
	Escribir "Dame tu nombre: "
	Leer palabra
	Escribir cadna(palabra)
FinAlgoritmo

Funcion resultado=cadna(p)
	Para i=1 Hasta Longitud(p) Hacer
		si i=1 y Subcadena(p,i,i)<>" " Entonces
			resultado = resultado + Mayusculas(Subcadena(p,i,i))
		SiNo
			si Subcadena(p,i,i) = " " y Subcadena(p,i+1,i+1)<>" " Entonces
				resultado = resultado + Mayusculas(Subcadena(p,i+1,i+1))
			FinSi
		FinSi
	FinPara
FinFuncion
	