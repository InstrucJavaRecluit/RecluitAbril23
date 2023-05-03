package common;

import java.util.Scanner;

public class Ejercicio4 {
	
	
	public static void main (String[] args) {
		
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa la Nota:");
		Integer nota = lector.nextInt();
		System.out.println("Ingresa la edad:");
		Integer edad = lector.nextInt();
		System.out.println("Ingresa el género - M/F:");
		Character genero = lector.next().charAt(0); //Tuve que quitar Line de nextLine
		
		
		if(nota >= 5 && edad >= 18  && genero.equals('M') ) {
			System.out.println("Tu solicitud será posiblemente aceptada");
		}else if (nota >= 5 && edad >= 18  && genero.equals('F')) {
			System.out.println("Tu solicitud es aceptada");
		}else {
			System.out.println("Tu solicitud no es aceptada");
		}
			
			
		
	}
}
