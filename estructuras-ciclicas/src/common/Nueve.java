package common;

import java.util.Scanner;

public class Nueve {
	public static void main(String[] args) {
		
		System.out.println("programa que me pida 2 numero y muestre los pares: \n");
		
				

		Scanner lector = new Scanner(System.in);
        int A, B;

        
        do {
            System.out.print("Introduce un número entero: ");
            A = lector.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            B = lector.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");                  
            }
        } while (A >= B);


        System.out.println("\nNúmeros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
	}

}
