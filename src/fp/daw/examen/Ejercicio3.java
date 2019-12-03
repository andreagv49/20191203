package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/* 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e indique si éste es guay.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero, suma = 0, seguir = 1;
		
		do {
			
			System.out.println("Introduzca un numero entero positivo: ");
			numero = scan.nextInt();
			
			for (int i = (numero-1) ; i>0 ; i--) {
				//System.out.println(i);
				suma+=i;
				
				if(suma>numero) {
					suma=i;
					//System.out.println("suma = "+suma);
				}
				
				if(numero == suma) {
					System.out.println("El número "+numero+" es guay");
					break;
				}
			}
			
			if(numero != suma) {
				System.out.println("El número "+numero+" no es guay");
			}
			
			System.out.println("¿Quieres introducir otro número? Escribe 1 para SI o 0 para NO");
			seguir = scan.nextInt();
		
		}while (seguir == 1);
		
		if(seguir == 0) {
			System.out.println("Fin de programa");
		}
		scan.close();
		
	}

}
