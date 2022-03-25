//Escribe un algoritmo que pida al usuario dos números enteros y muestre por pantalla qué número es
//mayor que el otro. En caso que sean iguales, mostrará por pantalla un mensaje diciendo que ambos
//números son iguales.


Algoritmo Ejercicio2
	
	Escribir "Dame dos números: "
	Leer num1,num2
	
	si num1==num2 Entonces
		Escribir "Los número son iguales"
	SiNo
		si num1>num2 Entonces
			Escribir num1,">",num2
		SiNo
			Escribir num2,">",num1
		FinSi
	FinSi
	
FinAlgoritmo
