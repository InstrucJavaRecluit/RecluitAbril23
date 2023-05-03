package Ejercicios2;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		int alto, ancho;
		
		
		System.out.println("Ingresa el ancho");
		ancho = lector.nextInt();
		
		System.out.println("Ingresa la altura");
		alto = lector.nextInt();
		
		for (int i = 1; i <= alto; i++) {
			for (int j = 1; j <= ancho; j++) {
				if (i == 1 || i == alto || j == 1 || j == ancho) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
