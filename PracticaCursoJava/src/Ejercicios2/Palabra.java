package Ejercicios2;

import java.util.Scanner;

public class Palabra {

	public static void main(String[] args) {

		
		Scanner lector = new Scanner(System.in);
		
		String frase;
		char letraBuscar;
		int contador = 0;
		
		
		System.out.println("Ingresa la frase");
		frase = lector.nextLine();
		
		System.out.println("Ingresa la letra a buscar");
		letraBuscar = lector.next().charAt(0);
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letraBuscar) {
				contador++;
			}
			
		}
		
		if (contador > 0) {
			System.out.println("La letra " + letraBuscar + " se encontro" + contador);
			
		}
		
	}

}
