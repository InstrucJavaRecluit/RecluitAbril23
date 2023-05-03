package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		

		Scanner lector = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingresa cualquier digite");
		num = lector.nextInt();
		
		if (num % 2 == 0) {
			
			System.out.println("El digito que ingresaste es PAR");
			
		}else {
			System.out.println("El digito que ingresaste es IMPAR");
		}
		
	}

}
