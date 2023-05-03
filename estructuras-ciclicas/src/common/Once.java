package common;

import java.util.Scanner;

public class Once {
	public static void main(String[] args) {
		
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me diga el cuadrado: \n");
		
				
		System.out.println("Ingrese el ancho: ");
		int num1 = lector.nextInt();
		
		System.out.println("Ingrese el alto: ");
		int num2 = lector.nextInt();
		
		
		for (int i = 1; i <= num1; i++) {
			for (int j = 0; j < num2; j++) {
				//System.out.println("El resultado de "+num1+" x "+i+" es: "+i*num1);
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

}
