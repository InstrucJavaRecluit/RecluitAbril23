package common;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String[] args) {
		
		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el primer n�mero:");
		float n1 = lector.nextInt();
		System.out.println("Ingresa el segundo n�mero:");
		float n2 = lector.nextInt();
		
		if(n2 == 0) {
			System.out.println("Error, no debes ingrsar el n�mero cero");
		}else {
			System.out.println(n1/n2);
		}
		
	}
}
