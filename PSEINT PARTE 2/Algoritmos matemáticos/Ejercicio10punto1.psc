Algoritmo Ejercicio10punto1
	numAle=AZAR(100)+1
	//Escribir numAle
	Para  i=1 Hasta 7 Hacer
		Escribir "Dame un número del 1 al 100"
		Leer numUsuario
		si numAle==numUsuario Entonces
			Escribir "Enhorabuena has acertado"
			i=7
		SiNo
			si numUsuario>numAle Entonces
				Escribir "Te has pasado, tienes: ", i, " fallo/s de 7"
			SiNo
				Escribir "Te has quedado corto, tienes: ", i," fallo/s de 7"
			FinSi
		FinSi
	FinPara
FinAlgoritmo
