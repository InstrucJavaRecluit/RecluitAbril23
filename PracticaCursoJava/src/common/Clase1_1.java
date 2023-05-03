package common;

import java.util.Scanner;

public class Clase1_1 {

	public static void main(String[] args) {
		
		
		//Estructuras de control
		//if, if-else, 
		//el operador == sirve para comprar primitivos
		//Para comparar String se usa equals
		
		int x = 11;
		String m = "Puebla 2023";
		
		// IF con AND
//		if (x == 10 && m.equals("Puebla 2023")) {
//			System.out.println("Ok");
//			
//		}else {
//			System.out.println("No lo es");
//		}
			
		
		//If con OR
//		if (x == 10 || m.equals("Puebla 2023")) {
//			System.out.println("Ok");
//			
//		}else {
//			System.out.println("No lo es");
//		}
		
		 	//Negando la estructura !
//		if ( !(x == 10 || m.equals("Puebla 2023")) ) {
//			System.out.println("Ok");
//			
//		}else {
//			System.out.println("No lo es");
//		}
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el mes del año que quieras saber");
		int mes = lector.nextInt();
		
		
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;

		default:
			System.out.println("Mes desconocido");
			break;
		}	
		}
}
