//Escribe un algoritmo que pida al usuario dos n�meros enteros y muestre por pantalla qu� n�mero es
//mayor que el otro. En caso que sean iguales, mostrar� por pantalla un mensaje diciendo que ambos
//n�meros son iguales.


Algoritmo Ejercicio2
	
	Escribir "Dame dos n�meros: "
	Leer num1,num2
	
	si num1==num2 Entonces
		Escribir "Los n�mero son iguales"
	SiNo
		si num1>num2 Entonces
			Escribir num1,">",num2
		SiNo
			Escribir num2,">",num1
		FinSi
	FinSi
	
FinAlgoritmo
