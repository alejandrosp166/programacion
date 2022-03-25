//Prepara un programa que pida al usuario tres números y diga cuál es el mayor de los tres.

Algoritmo Ejercicio13
	
	Escribir "Dame 3 números: "
	Leer num1,num2,num3
	
	si num1 > num2 y num1 > num3 Entonces
		
		si num2 > num3 Entonces
			Escribir "El orden es: " num1," ",num2," ", num3
		SiNo
			Escribir "El orden es: " num1," ",num3," ", num2
		FinSi
		
	FinSi
	
	si num2 > num1 y num2 > num3 Entonces
		
		si num1 > num3 Entonces
			Escribir "El orden es: " num2," ",num1," ", num3
		SiNo
			Escribir "El orden es: " num2," ",num3," ", num1
		FinSi
		
	FinSi
	
	si num3 > num2 y num3 > num2 Entonces
		
		si num1 > num2 Entonces
			Escribir "El orden es: " num3," ",num1," ", num2
		SiNo
			Escribir "El orden es: " num3," ",num2," ", num1
		FinSi
		
	FinSi
	
FinAlgoritmo
