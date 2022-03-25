Algoritmo Ejercicio12punto6
	Escribir "Dame un número: "
	Leer n
	si EsPar(n)=Verdadero Entonces
		Escribir "Es par"
	SiNo
		Escribir "Es impar"
	FinSi
FinAlgoritmo

Funcion varlog = Espar(num)
	varlog=Falso
	si num%2=0 Entonces
		varlog=Verdadero
	FinSi
FinFuncion

	