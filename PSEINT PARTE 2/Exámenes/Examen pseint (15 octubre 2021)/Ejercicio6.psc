Algoritmo Ejercicio6
	Escribir "Dame la cantidad de preguntas: "
	Leer cantP
	Escribir "Dame el n�mero de preguntas que contest� bien: "
	Leer correc
	
	nota=50//Nos� sacar el porcentaje
	
	si nota>=90 Entonces
		Escribir "Nivel m�ximo"
	SiNo
		si nota>=75 y nota<90 Entonces
			Escribir "Nivel medio"
		SiNo
			si nota>=50 y nota<75 Entonces
				Escribir "Nivel regular"
			SiNo
				si nota<50 Entonces
					Escribir "Fuera de nivel"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
