package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		Scanner lector = new Scanner(System.in);
		
		int nota, edad;
		char sexo;
		
		
		System.out.println("Ingrese la nota");
		nota = lector.nextInt();
		
		System.out.println("Ingrese edad");
		edad = lector.nextInt();
		
		System.out.println("Ingrese el sexo M/F");
		sexo = lector.next().charAt(0);
		
		
		if (nota >= 5 && edad >= 18) {
			if(sexo == 'M') {
				System.out.println("POSIBLE");
			}else if (sexo == 'F') {
				System.out.println("ACEPTADO");
				
			}else {
				System.out.println("NO ACEPTADO");
			}
		}
		
		
		
	}

}
