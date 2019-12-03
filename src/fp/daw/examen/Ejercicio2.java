package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números enteros y calcule
	 * la suma de todos los números impares comprendidos entre ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se introduzcan los dos números
	 * (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */
	
	public static void main(String[] args) throws IOException {
		
		int numMayor, numMenor, suma = 0, seguir=1;
		String numUno, numDos, seguimos;
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("Introduzca un número: ");
			numUno = reader.readLine();
			int numero1 = Integer.parseInt(numUno);
			System.out.println("Introduzca otro número: ");
			numDos = reader.readLine();
			int numero2 = Integer.parseInt(numDos);
			
			if(numero1 > numero2) {
				numMayor = numero1;
				numMenor = numero2;
			}else {
				numMayor = numero2;
				numMenor = numero1;
			}
			
			for(int i=numMenor ; i <= numMayor; i++) {
				
				if(i%2 != 0) {
					suma+=i;
				}
			}
			
			System.out.println("La suma de todos los números impares comprendidos entre "+numMenor+" y "+numMayor+" es "+suma);
			
			System.out.println("¿Quieres volver a introducir números? Escribe 1 para SI o 0 para NO");
			seguimos = reader.readLine();
			seguir = Integer.parseInt(seguimos);
			
		} while (seguir == 1);
		
		if(seguir == 0) {
			System.out.println("Fin de programa");
		}
	}

}
