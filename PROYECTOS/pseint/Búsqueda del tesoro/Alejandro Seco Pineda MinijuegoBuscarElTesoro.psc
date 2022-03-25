Algoritmo EjercicioMiniJuegoBuscaTesoro
	//ANOTACIÓN: EL CÓDIGO SE PODRÍA SIMPLIFICAR MUCHÍSIMO MÁS SI USARAMOS LA FUNCIÓN DE "SUBPROCESO" YA QUE HAY VARIAS VECES QUE SE REPITE CÓDIGO EJ: PINTAR LA INTERFAZ Y CAMBAIR LAS VARIABLES DE X
	Dimension datos[4,5]
	posFilaMin=azar(3)+1//X i mina
	posColumnaMin=azar(4)+1//Y j mina
	
	posFilaTes=azar(3)+1//X i Tesoro
	posColumnaTes=azar(4)+1//Y jTesoro

	Para i=1 Hasta 4 Hacer//Le damos el valor de espacio al vector para tener un tablero en el que trabajar
		Para j=1 Hasta 5 Hacer
			datos[i,j]=" "
		FinPara
		Escribir ""
	FinPara
	
	datos[posFilaTes,posColumnaTes]="$"//Le damos una posición al tesoro
	Mientras posFilaTes==posFilaMin y posColumnaTes==posColumnaMin Hacer//Se comprueba que donde se va a meter la mina, no esté el tesoro
		posFilaMin=azar(3)+1
		posColumnaMin=azar(4)+1
	FinMientras
	datos[posFilaMin,posColumnaMin]="*"//Le damos un valor a la mina
	
	datos[posFilaMin,posColumnaMin]=" "//Hacemos esto para que sea "invisible"
	datos[posFilaTes,posColumnaTes]=" "//Hacemos esto para que sea "invisible"
	
	//Esto escribe la interfaz minijuego por primera vez
	n=4
	Escribir "¡BUSCA EL TESORO!"
	Escribir "---------"
	Para i=1 Hasta 4 Hacer
		Para j=1 Hasta 5 Hacer
			si j=1 y (i=1 o i=2 o i=3 o i=4) Entonces
				Escribir Sin Saltar ConvertirATexto(n) + "|" + datos[i,j]
				n=n-1
			SiNo
				Escribir Sin Saltar datos[i,j]
			FinSi
		FinPara
		Escribir ""
	FinPara
	Escribir "  -----"
	Escribir "  12345"
	
	Definir encontrado Como Logico//Variable que controla si puedes seguir jugando o no
	encontrado=Falso //Variable que controla si puedes seguir jugando o no
	
	//Pedimos los datos al jugador
	Escribir "Dame la cordenada X"
	Leer jugadaJugadorX 
	Escribir "Dame la cordenada Y"
	Leer jugadaJugadorY
	//Invertimos la variable X para que coincida con al interfaz
	Segun jugadaJugadorX  Hacer
		1:
			jugadaJugadorX=4
		2:
			jugadaJugadorX=3
		3:
			jugadaJugadorX=2
		4:
			jugadaJugadorX=1
	FinSegun
	
	Mientras encontrado == Falso hacer

		si jugadaJugadorX>4 o jugadaJugadorY>5 o jugadaJugadorX<=0 o jugadaJugadorY<=0 Entonces //Cambiar condicion para no poder meter nums negs
			Escribir "Estamos jugando en un 4x5!"
			Escribir ""
			Escribir "Dame la cordenada X"
			Leer jugadaJugadorX 
			Escribir "Dame la cordenada Y"
			Leer jugadaJugadorY
			//Invertimos la variable X para que coincida con al interfaz
			Segun jugadaJugadorX  Hacer
				1:
					jugadaJugadorX=4
				2:
					jugadaJugadorX=3
				3:
					jugadaJugadorX=2
				4:
					jugadaJugadorX=1
			FinSegun
		FinSi

		si (jugadaJugadorX == posFilaTes) y (jugadaJugadorY == posColumnaTes) Entonces //$ //Comprueba que en la posición que ha metido el usuario no esté el tesoro
			Escribir "HAS GANADO"
			datos[posFilaMin,posColumnaMin]="*"//HACEMOS ESTO PARA QUE LA MINA DEJE DE SER "INVISIBLE"
			datos[posFilaTes,posColumnaTes]="$"//HACEMOS ESTO PARA QUE EL TESORO DEJE DE SER "INVISIBLE"
			//Esto escribe la interfaz minijuego
			n=4
			Escribir "---------"
			Escribir "Cordenada X: ", jugadaJugadorX
			Escribir "Cordenada Y: ", jugadaJugadorY
			Escribir "---------"
			Para i=1 Hasta 4 Hacer
				Para j=1 Hasta 5 Hacer
					si j=1 y (i=1 o i=2 o i=3 o i=4) Entonces
						Escribir Sin Saltar ConvertirATexto(n) + "|" + datos[i,j]
						n=n-1
					SiNo
						Escribir Sin Saltar datos[i,j]
					FinSi
				FinPara
				Escribir ""
			FinPara
			Escribir "  -----"
			Escribir "  12345"
			
			encontrado=Verdadero
		SiNo
			si (jugadaJugadorX == posFilaMin) y (jugadaJugadorY == posColumnaMin)  Entonces //* //Comprueba que en la posición que ha metido el usuario no esté la mina
				Escribir "HAS PERDIDO"
				datos[posFilaMin,posColumnaMin]="*"//HACEMOS ESTO PARA QUE LA MINA DEJE DE SER "INVISIBLE"
				datos[posFilaTes,posColumnaTes]="$"//HACEMOS ESTO PARA QUE EL TESORO DEJE DE SER "INVISIBLE"
				//Esto escribe la interfaz minijuego
				n=4
				Escribir "---------"
				Escribir "Cordenada X: ", jugadaJugadorX
				Escribir "Cordenada Y: ", jugadaJugadorY
				Escribir "---------"
				Para i=1 Hasta 4 Hacer
					Para j=1 Hasta 5 Hacer
						si j=1 y (i=1 o i=2 o i=3 o i=4) Entonces
							Escribir Sin Saltar ConvertirATexto(n) + "|" + datos[i,j]
							n=n-1
						SiNo
							Escribir Sin Saltar datos[i,j]
						FinSi
					FinPara
					Escribir ""
				FinPara
				Escribir "  -----"
				Escribir "  12345"
				
				encontrado=Verdadero
			SiNo
				//Si no se cumple ninguna de las anteriores escribimos una X en la posición que toca
				datos[jugadaJugadorX,jugadaJugadorY]="X"
				
				//Esto escribe la interfaz minijuego
				n=4
				Escribir "---------"
				Escribir "Cordenada X: ", jugadaJugadorX
				Escribir "Cordenada Y: ", jugadaJugadorY
				Escribir "---------"
				Para i=1 Hasta 4 Hacer
					Para j=1 Hasta 5 Hacer
						si j=1 y (i=1 o i=2 o i=3 o i=4) Entonces
							Escribir Sin Saltar ConvertirATexto(n) + "|" + datos[i,j]
							n=n-1
						SiNo
							Escribir Sin Saltar datos[i,j]
						FinSi
					FinPara
					Escribir ""
				FinPara
				Escribir "  -----"
				Escribir "  12345"
				
				//SI NO PEDIMOS OTRA VEZ LOS DATOS HAY UN BUCLE INFINITO
				Escribir "Dame la cordenada X"
				Leer jugadaJugadorX 
				Escribir "Dame la cordenada Y"
				Leer jugadaJugadorY
				
				Segun jugadaJugadorX  Hacer
					1:
						jugadaJugadorX=4
					2:
						jugadaJugadorX=3
					3:
						jugadaJugadorX=2
					4:
						jugadaJugadorX=1
				FinSegun
			FinSi
		FinSi
	FinMientras
FinAlgoritmo