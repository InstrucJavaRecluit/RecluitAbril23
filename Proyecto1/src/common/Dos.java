package common;

import java.util.Scanner;

public class Dos {
	public static void main (String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el primer número:");
		Integer n1 = lector.nextInt();
		System.out.println("Ingresa el segundo número:");
		Integer n2 = lector.nextInt();
		
		if (n1 == n2) {
			System.out.println("Los números son iguales");
		}else {
			if (n1 > n2) {
				System.out.println("El número " + n1 + " es mayor que " + n2);
			}
			else {
				System.out.println("El número " +n2 + " es mayor que" +n1); 
			}
				
		}
		
	}
}
