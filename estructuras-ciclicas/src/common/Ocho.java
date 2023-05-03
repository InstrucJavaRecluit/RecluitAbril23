package common;

import java.util.Scanner;

public class Ocho {
	public static void main(String[]args) {
		
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que mepida 2 numero y muestre de menor  mayor: \n");
		
				
		System.out.println("Ingrese el primer numero: ");
		int num1 = lector.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		int num2 = lector.nextInt();
		
		if(num1<num2) {
			for (int i = num1; i <= num2; i++) {
			
			
				System.out.println("EL orden de los numeros es: "+num1);
				num1++;
				}
		}else {
			System.out.println("el primer numero debe ser menor.");
		}
		
	}

}
