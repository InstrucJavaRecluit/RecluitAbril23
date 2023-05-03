package common;

import java.util.Scanner;

public class Multiplicar2 {
	
	public static void main(String[] args) {

		
		Scanner lector = new Scanner(System.in);
		System.out.println("Tabla de multiplicar del número:");
		int num = lector.nextInt();
		System.out.println("Hasta qué múltiplo:");
		int multiplo = lector.nextInt();
		
		for(multiplo = 0; multiplo*num; multiplo++) {
			
			System.out.println(num*multiplo);
		}
			
		
		 
			
			
			
				
	}

}
