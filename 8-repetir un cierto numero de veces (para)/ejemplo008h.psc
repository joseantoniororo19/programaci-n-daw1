Algoritmo ejemplo008h
	Escribir "Vamos a dibujar un triangulo"
	Escribir "Dime un numero"
	Leer alto
	Escribir "Dime otro numero"
	Leer ancho
	ancho <- 1
	Para fila<-1 Hasta alto Hacer
		Para columna<-1 Hasta ancho Hacer
			Escribir Sin Saltar "*"
		Fin Para
		Escribir ""; // Avance de linea tras cada fila
		ancho <- ancho + 1
	Fin Para
	
FinAlgoritmo
