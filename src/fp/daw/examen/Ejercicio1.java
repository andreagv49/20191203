package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio1 {

	/* 
	 * 4 puntos
	 * 
	 * Escribir en el método main un programa que pida por teclado un número decimal menor o igual
	 * que 3000 y muestre por pantalla el resultado de convertirlo a un número romanos.
	 *     
	 *     La conversión se realizará transformando individualmente cada dígito, empezando por el correspondiente
	 *     a las unidades de millar, seguido de las centenas, decenas y unidades de la forma siguiente:
	 *     
	 *     		Dígito decimal		|	Transformación
	 *     		--------------------|----------------------------------------------------------------------------
	 *     		1, 2 o 3			|	Escribir C1 de una a tres veces
	 *     		4					|	Escribir C1 seguido de C2
	 *     		5, 6, 7 o 8			|	Escribir una vez C2 seguido de C1 de cero a tres veces
	 *     		9					|	Escribir C1 seguido de C3
	 *     
	 *     donde C1, C2 y C3 son los caracteres de numeración romana que corresponda según la tabla siguiente:
	 *     
	 *     							|   C1   |   C2   |   C3   |
	 *     		--------------------|--------|--------|--------|        
	 *     		unidades			|	I    |   V    |   X    |
	 *     		decenas				|	X    |   L    |   C    |
	 *     		centenas			|	C    |   D    |   M    |
	 *     		unidades de millar	|	M    |        |        |
	 *     
	 *     Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */

	public static void main(String[] args) {
		
		int numero, unidad, decena, centena, millar, seguir=1;
		String unidadRom="", decenaRom="", centenaRom="", millarRom="";
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			do {
				System.out.println("Introduzca un número decimal menor o igual que 3000");
				numero = scan.nextInt();
				
				if(numero > 3000) {
					System.out.println("Número no válido");
				}
			
			} while (numero > 3000);
			
			millar = numero/1000;
			switch(millar) {
				case 1:
					millarRom = "M";
					break;
				case 2:
					millarRom = "MM";
					break;
				case 3:
					millarRom = "MMM";
					break;
			}
			
			centena = numero/100;
			centena = centena%10;
			
			switch(centena) {
				case 1:
					centenaRom = "C";
					break;
				case 2:
					centenaRom = "CC";
					break;
				case 3:
					centenaRom = "CCC";
					break;
				case 4:
					centenaRom = "CD";
					break;
				case 5:
					centenaRom = "D";
					break;
				case 6:
					centenaRom = "DC";
					break;
				case 7:
					centenaRom = "DCC";
					break;
				case 8:
					centenaRom = "DCCC";
					break;
				case 9:
					centenaRom = "CM";
					break;
			}
			
			decena = numero/10;
			decena = decena%10;
			
			switch(decena) {
				case 1:
					decenaRom = "X";
					break;
				case 2:
					decenaRom = "XX";
					break;
				case 3:
					decenaRom = "XXX";
					break;
				case 4:
					decenaRom = "XL";
					break;
				case 5:
					decenaRom = "L";
					break;
				case 6:
					decenaRom = "LX";
					break;
				case 7:
					decenaRom = "LXX";
					break;
				case 8:
					decenaRom = "LXXX";
					break;
				case 9:
					decenaRom = "XC";
					break;
			}
			
			unidad = numero%10;
			
			switch(unidad) {
			case 1:
				unidadRom = "I";
				break;
			case 2:
				unidadRom = "II";
				break;
			case 3:
				unidadRom = "III";
				break;
			case 4:
				unidadRom = "IV";
				break;
			case 5:
				unidadRom = "V";
				break;
			case 6:
				unidadRom = "VI";
				break;
			case 7:
				unidadRom = "VII";
				break;
			case 8:
				unidadRom = "VIII";
				break;
			case 9:
				unidadRom = "IX";
				break;
			}
			
			System.out.println("El número " + numero + " en romano es: " + millarRom + " " + centenaRom + " " + decenaRom + " " + unidadRom);
			System.out.println("¿Quieres volver a introducir un número? Escribe 1 para SI o 0 para NO");
			seguir = scan.nextInt();
			
		
		}while (seguir == 1);
		
		if(seguir == 0) {
			System.out.println("Fin de programa");
		}
		
		scan.close();
	}
	
}
