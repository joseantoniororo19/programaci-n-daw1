Algoritmo ejemplo0011a
		Repetir
			Escribir "Dime un numero"
			Leer x
			Si x > Azar(101) Entonces
				Escribir "Numero incorrecto, el numero es menor" 
			Fin Si
			Si x < Azar(101) Entonces
				Escribir "Numero incorrecto, el numero es mayor"
			Fin Si
			Si x = Azar(101) Entonces
				Escribir "Numero correcto, felicidades"
			Fin Si
		Hasta Que x = Azar(101)
		Escribir Azar(101)

FinAlgoritmo
