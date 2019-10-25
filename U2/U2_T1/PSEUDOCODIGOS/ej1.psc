Algoritmo ej1
	Escribir "vamos a calcular tu sueldo semanal"
	Escribir "¿cuantas horas has trabajado?"
	Leer numerohoras
	Si numerohoras = 41 o numerohoras > 41 Entonces
		Escribir "Tu sueldo semanal es 15€/horas"
	SiNo numerohoras = 40
		Escribir "Tu sueldo semanal es de 400€"
	Fin Si
	Segun sueldosemanal Hacer
		36 horas:
			Escribir "Tu sueldo semanal será 360€"
		50 horas:
			Escribir "Tu sueldo semanal será 550€"
	Fin Segun
	
FinAlgoritmo
