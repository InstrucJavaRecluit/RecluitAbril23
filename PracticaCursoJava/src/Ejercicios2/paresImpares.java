package Ejercicios2;

import java.util.Scanner;

public class paresImpares {

	public static void main(String[] args) {

		
		Scanner lector = new Scanner(System.in);
		
		int num;
		int Positivos = 0;
		int sumImpares = 0;
		
		
		for (int i = 0; i <= 20 ; i++) {
			
			System.out.println("Ingrese un numero");
			num = lector.nextInt();
			
			if (num > 0) {
				System.out.println("Es positivo");
				Positivos = Positivos + num;
			}else {
				System.out.println("El numero es negativo");
			}
			
			if (num % 2 == 0) {
				System.out.println("El numero es PAR");
			}else {
				System.out.println("El numero es IMPAR");
			}
		}
		
		System.out.println("La suma de los numeros positivos son: " + Positivos);
		System.out.println("La suma de los numeros negativos son: " + sumImpares);
	}

}
