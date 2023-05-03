package common;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String[] args) {
		
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el primer número:");
		float n1 = lector.nextInt();
		System.out.println("Ingresa el segundo número:");
		float n2 = lector.nextInt();
		
		if(n2 == 0) {
			System.out.println("Error, no debes ingrsar el número cero");
		}else {
			System.out.println(n1/n2);
		}
		
	}
}
