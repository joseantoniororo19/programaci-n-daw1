Algoritmo ejemplo007a
	Repetir
		Escribir "Dime tu codigo de usuario"
		Leer codigousuario
		Escribir "Dime tu contraseña"
		Leer contraseña
		Si codigousuario <> 1  Entonces
			Escribir "codigo incorrecto"
		Fin Si
		Si contraseña <> 1234 Entonces
			Escribir "contraseña incorrecta"
		Fin Si
	Hasta Que codigousuario = 1 y contraseña = 1234
	Escribir "Bienvenido, todo es correcto"
	
FinAlgoritmo
