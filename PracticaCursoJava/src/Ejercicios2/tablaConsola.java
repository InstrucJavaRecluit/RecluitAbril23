package Ejercicios2;

import java.util.Scanner;

public class tablaConsola {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		int numero, iteracionMaxica;
		
		System.out.println("Ingresa digito a multiplicar");
		numero = lector.nextInt();
		
		System.out.println("Ingresa digito de la iteracion Maxica a multiplicar");
		iteracionMaxica = lector.nextInt();
		
		for (int i = 1; i <= iteracionMaxica; i++) {
			
			System.out.println(numero + "x" + i + "=" + i*numero);
			
		}
		
		
	}

}
