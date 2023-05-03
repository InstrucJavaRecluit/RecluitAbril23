package common;

import java.util.Scanner;

public class Dos {
		public static void main(String[]args) {
		
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me diga la tabla de un numero deseado hasta la iteracion: \n");
		
				
		System.out.println("Ingrese el numero de la tabla: ");
		int num1 = lector.nextInt();
		
		System.out.println("Ingrese el numero de iteraciones: ");
		int num2 = lector.nextInt();
		
		
		for (int i = 1; i <= num2; i++) {
			System.out.println("El resultado de "+num1+" x "+i+" es: "+i*num1);
			
		}
	}
}
