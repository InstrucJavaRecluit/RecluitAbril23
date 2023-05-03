package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		int num1, num2;
		double resultado = 0;
		
		System.out.println("Ingrese el primer digito");
		num1 = lector.nextInt();
		
		System.out.println("Ingrese el primer digito");
		num2 = lector.nextInt();
		
		
		if (num2 ==  0) {
			
			System.out.println("El segundo valor es 0, Ingrese valor mayor a 0");
		}else {
			resultado = num1/num2;
			System.out.println("El resultado de la division es: " + resultado);
		}
		
		
	}

}
