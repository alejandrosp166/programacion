Algoritmo Ejercicio5
	
	Escribir "Dame tu sueldo: "
	Leer sueldo
	Escribir "Dame los años que llevas trabajando: "
	Leer anios
	
	si sueldo>=500 Entonces
		Escribir "El sueldo a pagar sería: ", sueldo
	SiNo
		si anios>=10 Entonces
			Escribir "El sueldo a pagar sería: ", ((sueldo*20)/100)+sueldo
		SiNo
			Escribir "El sueldo a paga sería: ", ((sueldo*5)/100)+sueldo
		FinSi
	FinSi	
FinAlgoritmo
