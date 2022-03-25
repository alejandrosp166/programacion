//Escribe un algoritmo que pida al usuario dos números enteros y muestre por pantalla si alguno de ellos es
//múltiplo del otro

Algoritmo Ejercicio4
	
	Escribir "Dame dos numeros: "
	Leer num1, num2
	
	si num1%num2==0 Entonces
		Escribir num1," es múltiplo de ", num2
		si num2%num1==0 Entonces
			Escribir num2," es múltiplo de ", num1," también"
		SiNo
			Escribir "pero ", num2," no es múltiplo de ", num1
		FinSi
	SiNo
		Escribir num1," NO es múltiplo de ", num2
		si num2%num1==0 Entonces
			Escribir "pero ",num2," es múltiplo de ", num1
		SiNo
			Escribir num2," tampoco es múltiplo de ", num1
		FinSi
	FinSi
	
FinAlgoritmo
