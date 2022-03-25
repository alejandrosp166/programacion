//Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) 
//y diga cuántos días tiene (por ejemplo, 30). Debes usar una matriz.

Algoritmo Ejercicio9punto1
	Dimension datos[12]
	Escribir "Dame un número: "
	Leer num
	
	datos[1]=31
	datos[2]=28
	datos[3]=31
	datos[4]=30
	datos[5]=31
	datos[6]=30
	datos[7]=31
	datos[8]=31
	datos[9]=30
	datos[10]=31
	datos[11]=30
	datos[12]=31
	
	Escribir "Ese mes tiene: ", datos[num]," días"
	
FinAlgoritmo
