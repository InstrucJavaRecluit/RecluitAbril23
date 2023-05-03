package Ejercicios2;

import java.util.Scanner;

public class dosNumerosPares {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");
	      int num1 = lector.nextInt();

	      System.out.print("Ingrese el segundo número: ");
	      int num2 = lector.nextInt();

	      if(num1 > num2) {
	         int temp = num1;
	         num1 = num2;
	         num2 = temp;
	      }

	      System.out.println("Los números pares entre " + num1 + " y " + num2 + " son:");
	      for(int i = num1; i <= num2; i++) {
	         if(i % 2 == 0) {
	            System.out.print(i + " ");
	         }
	      }
	   }
	}

