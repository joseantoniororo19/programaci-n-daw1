Algoritmo ejemplo0013b
	Escribir 'Ingrese un numero';
    Leer n1;
    Escribir 'Ingrese otro numero';
    Leer n2;
    Si n1>n2 Entonces
        Si n1 MOD n2=0 Entonces
            Escribir 'El numero ',n1,' es multiplo de ',n2;
        Sino
            Escribir 'El numero ',n1,' No es multiplo de ',n2;
        FinSi
    Sino
        Si n2 MOD n1=0 Entonces
            Escribir 'El numero ',n2,' es multiplo de ',n1;
        Sino
            Escribir 'El numero ',n2,' No es multiplo de ',n1;
        FinSi
    FinSi
FinAlgoritmo
