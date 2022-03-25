//Crea un programa que genere dos números al azar entre el 0 y el 100, 
//y pida al usuario que calcule e introduzca su suma. Si la respuesta no es correcta, 
//deberá volver a pedirla tantas veces como sea necesario hasta que el usuario acierte. 
//Pista: como verás en el apartado 10, para generar un número al azar del 0 al 100 puedes 
//hacer numero <- AZAR 101
	

Algoritmo Ejercicio6punto3
	Definir resp,random1,random2 Como Entero
	random1<-AZAR(101)
	random2<-AZAR(101)
	Escribir "Dame la respuesta de sumar: " ,random1 " + " ,random2
	Leer resp
	
	Mientras resp<>random1+random2 Hacer
		Escribir "Incorrecto"
		Escribir "Dame la respuesta de sumar: " ,random1 " + " ,random2
		Leer resp
	FinMientras
	Escribir "Correcto"
FinAlgoritmo
