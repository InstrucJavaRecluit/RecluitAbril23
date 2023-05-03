package common;

import java.util.Scanner;

public class Ejercicio7 {

	
	public static void main (String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el n�mero que cay� al lanzar el dado:");
		int numDado = lector.nextInt();
		
		if(numDado <= 1 || numDado > 6) {
			System.out.println("ERROR: n�mero incorrecto");
		}
		
		switch(numDado) {
		
			case 1:
			System.out.println("El n�mero de la cara opuesta es SEIS ");
			break;
			
			case 2:
				System.out.println("El n�mero de la cara opuesta es CINCO ");
				break;
			case 3:
				System.out.println("El n�mero de la cara opuesta es CUATRO ");
				break;
			case 4:
				System.out.println("El n�mero de la cara opuesta es TRES ");
				break;
			case 5:
				System.out.println("El n�mero de la cara opuesta es DOS ");
				break;
			case 6:
				System.out.println("El n�mero de la cara opuesta es UNO ");
				break;
				
			default:
				System.out.println("N�mero incorrecto");
				
		
		}
		
		
		
	}
	
}
