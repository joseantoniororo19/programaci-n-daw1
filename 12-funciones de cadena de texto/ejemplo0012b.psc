Algoritmo ejemplo0012b
	Escribir "Dime tu nombre"
	Leer r1
	Para j<-1 Hasta longitud(r1) Hacer
		p<-subcadena( r1,j,j)
		Si j%2=1  Entonces
			Escribir Mayusculas(p)
		Sino
			Escribir Minusculas(p)
		finsi
	Fin Para

FinAlgoritmo
