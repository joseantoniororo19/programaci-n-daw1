Algoritmo ejemplo007a
	Repetir
		Escribir "Dime tu codigo de usuario"
		Leer codigousuario
		Escribir "Dime tu contrase�a"
		Leer contrase�a
		Si codigousuario <> 1  Entonces
			Escribir "codigo incorrecto"
		Fin Si
		Si contrase�a <> 1234 Entonces
			Escribir "contrase�a incorrecta"
		Fin Si
	Hasta Que codigousuario = 1 y contrase�a = 1234
	Escribir "Bienvenido, todo es correcto"
	
FinAlgoritmo
