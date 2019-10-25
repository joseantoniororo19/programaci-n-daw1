Algoritmo ejemplo007c
	Repetir
		Escribir "Dime un numero"
		Leer primernumero
		Escribir "Dime otro numero"
		Leer segundonumero
		Si segundonumero = 0 Entonces
			Escribir "El divisor debe ser distinto a cero"
			Leer segundonumero
		Fin Si
	Hasta Que segundonumero <> 0
	Escribir "El resultado de su división es" (primernumero/segundonumero)
FinAlgoritmo
