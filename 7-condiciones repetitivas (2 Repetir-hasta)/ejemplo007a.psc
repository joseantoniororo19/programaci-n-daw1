Algoritmo ejemplo007a
	Repetir
		Escribir "Dime tu codigo de usuario"
		Leer codigousuario
		Escribir "Dime tu contraseņa"
		Leer contraseņa
		Si codigousuario <> 1  Entonces
			Escribir "codigo incorrecto"
		Fin Si
		Si contraseņa <> 1234 Entonces
			Escribir "contraseņa incorrecta"
		Fin Si
	Hasta Que codigousuario = 1 y contraseņa = 1234
	Escribir "Bienvenido, todo es correcto"
	
FinAlgoritmo
