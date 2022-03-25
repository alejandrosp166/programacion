Algoritmo Ejercicio11punto4
	Escribir "Dame una palabra"
	Definir palabra, solucion Como Caracter
	Leer palabra
	contA=0
	contE=0
	contI=0
	contO=0
	contU=0
	Para i=1 Hasta Longitud(palabra) Hacer
		letra=Subcadena(palabra,i,i)
		si Minusculas(letra) ="a" y contA<>1 Entonces
			solucion=solucion+letra
			contA=contA+1
		SiNo
			si Minusculas(letra) ="e" y contE<>1 Entonces
				solucion=solucion+letra
				contE=contE+1
			SiNo
				si Minusculas(letra) ="i" y contI<>1 Entonces
					solucion=solucion+letra
					contI=contI+1
				SiNo
					si Minusculas(letra) ="o" y contO<>1 Entonces
						solucion=solucion+letra
						contO=contO+1
					SiNo
						si Minusculas(letra)="u" y contU<>1 Entonces
							solucion=solucion+letra
							contU=contU+1
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	Dimension VectorVocal[Longitud(solucion)]
	//SEPARAMOS LA CADENA Y LA METEMOS EN UN VECTOR 
	Para i=1 Hasta Longitud(solucion) Hacer
		letra=Subcadena(solucion,i,i)
		VectorVocal[i]=letra
	FinPara
	//APLICAMOS EL ALGORITMO DE LA BURBÚJA SOBRE EL VECTOR
	Para i=2 Hasta Longitud(solucion) Hacer
		Para j=1 Hasta Longitud(solucion)-1 hacer
			si VectorVocal[j]>VectorVocal[j+1] Entonces
				aux=VectorVocal[j]
				VectorVocal[j]=VectorVocal[j+1]
				VectorVocal[j+1]=aux
			FinSi
		FinPara
	FinPara
	//CONCATENAMOS LOS DATOS EN UNA ÚNICA VARIABLE
	Para i=1 Hasta Longitud(solucion) Hacer
		soluFinal=soluFinal+VectorVocal[i]
	FinPara
	
	Escribir "La palabra tiene las siguientes vocal/es: " ,soluFinal
FinAlgoritmo
