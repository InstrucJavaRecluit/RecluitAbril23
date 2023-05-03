package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

Scanner lector = new Scanner(System.in);
		
		int numSemana;
		
		System.out.println("Introduce el numero de la semana");
		numSemana = lector.nextInt();
		
		
		switch (numSemana) {
		case 1:
			System.out.println("LUNES");
			break;
			
		case 2:
			System.out.println("MARTES");
			break;
			
		case 3:
			System.out.println("MIERCOLES");
			break;
			
		case 4:
			System.out.println("JUEVES");
			break;
	
		case 5:
			System.out.println("VIERNES");
			break;
	
		case 6:
			System.out.println("SABADO");
			break;
			
		case 7:
			System.out.println("DOMINGO");
			break;

		default:
			System.out.println("Ingrese un numero correcto del 1 - 7");
			break;
		}
	}
		
	}


