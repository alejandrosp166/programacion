//Escribe un algoritmo que pida al usuario un n�mero entero entre 0 y 9999 y muestre por pantalla cuantas
//cifras tiene dicho n�mero.


Algoritmo Ejercicio6
	
	Escribir "Dame un n�mero entre 0 y 9999: "
	Leer num
	
	si num > 9999 o num <0 Entonces
		Escribir "El n�mero no entra en el rango"
	SiNo
		si num >= 0 y num < 10 Entonces
			Escribir "El n�mero tiene una cifra"
		FinSi
		
		si num >= 10 y num < 100 Entonces
			Escribir "El n�mero tiene dos cifras"
		FinSi
		
		si num >= 100 y num < 1000 Entonces
			Escribir "El n�mero tiene tres cifras"
		FinSi
		
		si num >= 1000 y num < 9999 Entonces
			Escribir "El n�mero tiene cuatro cifras"
		FinSi
		
	FinSi
	
FinAlgoritmo
