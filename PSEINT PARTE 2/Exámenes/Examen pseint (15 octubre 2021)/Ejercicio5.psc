Algoritmo Ejercicio5
	
	Escribir "Dame tu sueldo: "
	Leer sueldo
	Escribir "Dame los a�os que llevas trabajando: "
	Leer anios
	
	si sueldo>=500 Entonces
		Escribir "El sueldo a pagar ser�a: ", sueldo
	SiNo
		si anios>=10 Entonces
			Escribir "El sueldo a pagar ser�a: ", ((sueldo*20)/100)+sueldo
		SiNo
			Escribir "El sueldo a paga ser�a: ", ((sueldo*5)/100)+sueldo
		FinSi
	FinSi	
FinAlgoritmo
