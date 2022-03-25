//Escribe un algoritmo que simule el juego de piedra, papel, tijera 
//(pidiendo a cada jugador que escriba
//PIEDRA,PAPEL o TIJERA). El juego debe mostrar por pantalla 
//quien ha ganado el juego tras jugar una
//partida (puede que hayan empatado).

Algoritmo Ejercicio10
	
	Escribir "Jugada del jugador 1: "
	Leer jugada1
	Escribir "Jugada del jugador 2: "
	Leer jugada2
	
	
	//J1 ESCOGE PIEDRA
	si jugada1=="PIEDRA" y jugada2=="PAPEL" Entonces
		Escribir "Gana Jugador2"
	FinSi
	
	si jugada1=="PIEDRA" y jugada2=="TIJERAS" Entonces
		Escribir "Gana Jugador1"
	FinSi
	
	si jugada1=="PIEDRA" y jugada2=="PIEDRA" Entonces
		Escribir "EMPATE"
	FinSi
	//J1 ESCOGE PAPEL
	si jugada1=="PAPEL" y jugada2=="PAPEL" Entonces
		Escribir "EMPATE"
	FinSi
	
	si jugada1=="PAPEL" y jugada2=="PIEDRA" Entonces
		Escribir "Gana Jugador1"
	FinSi
	
	si jugada1=="PAPEL" y jugada2=="TIJERAS" Entonces
		Escribir "Gana Jugador2"
	FinSi
	//J1 ESCOGE TIJERAS
	si jugada1=="TIJERAS" y jugada2=="PAPEL" Entonces
		Escribir "Gana Jugador1"
	FinSi
	
	si jugada1=="TIJERAS" y jugada2=="TIJERAS" Entonces
		Escribir "EMPATE"
	FinSi
	
	si jugada1=="TIJERAS" y jugada2=="PIEDRA" Entonces
		Escribir "Gana Jugador1"
	FinSi
	
FinAlgoritmo
