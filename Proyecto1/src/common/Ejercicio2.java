package common;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa un número:");
		Integer num = lector.nextInt();
		
		if(num%2 == 0) {
			System.out.println("El número es par");		
	}else {
		System.out.println("El número es impar");
	}
}
}