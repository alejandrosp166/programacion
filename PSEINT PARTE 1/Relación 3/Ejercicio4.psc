//Escribe un algoritmo que pida al usuario dos n�meros enteros y muestre por pantalla si alguno de ellos es
//m�ltiplo del otro

Algoritmo Ejercicio4
	
	Escribir "Dame dos numeros: "
	Leer num1, num2
	
	si num1%num2==0 Entonces
		Escribir num1," es m�ltiplo de ", num2
		si num2%num1==0 Entonces
			Escribir num2," es m�ltiplo de ", num1," tambi�n"
		SiNo
			Escribir "pero ", num2," no es m�ltiplo de ", num1
		FinSi
	SiNo
		Escribir num1," NO es m�ltiplo de ", num2
		si num2%num1==0 Entonces
			Escribir "pero ",num2," es m�ltiplo de ", num1
		SiNo
			Escribir num2," tampoco es m�ltiplo de ", num1
		FinSi
	FinSi
	
FinAlgoritmo
