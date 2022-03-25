Algoritmo Ejercicio11punto5
	Escribir "Dame un frase: "
	Definir frase Como Caracter
	contEsp=1
	Leer frase
	
	Para i=1 Hasta Longitud(frase) Hacer
		letra=Subcadena(frase,i,i)
		letraSiguiente=Subcadena(frase,i+1,i+1)
		letraFinal=Subcadena(frase,Longitud(frase),Longitud(frase))
		si letra == " " y letraSiguiente <> " " Entonces
			contEsp=contEsp+1
		FinSi
	FinPara
	Escribir "La frase tiene " ,contEsp, " palabras"
FinAlgoritmo
//SI PONES ESPACIOS AL PRINCIPIO Y AL FINAL SE DUPLICAN LAS PALABRAS