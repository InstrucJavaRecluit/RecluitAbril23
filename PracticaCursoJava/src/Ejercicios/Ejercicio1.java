package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Ingrese el primer digito");
		num1 = lector.nextInt();
		
		System.out.println("Ingrese el segundo digito");
		num2 = lector.nextInt();
		
		if (num1 > num2) {
			
			System.out.println("El primer digito es mayor que el segundo digito");
		}else {
			System.out.println("El segundo digito es mayor que el primer digito");
		}
		
		
	}

}
