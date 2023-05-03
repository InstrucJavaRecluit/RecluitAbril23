package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

Scanner lector = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Introduce del 1 al 12 para saber los dias que tiene el mes");
		mes = lector.nextInt();
		
		
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 dias");
			break;
		case 2:
			System.out.println("El mes tiene 28 o 29");
			break;
			
			default:
				System.out.println("Error: Numero incorrecto");
				break;
		}
	}
	}

