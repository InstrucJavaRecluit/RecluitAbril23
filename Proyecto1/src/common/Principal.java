package common;

import java.util.Scanner;

public class Principal {
	

	public static void main (String[] args) {
	
//	int x = 10;
//	String m = "Puebla 2023";
	
//	in con AND
//	if(x==10 && m.equals("Puebla 2023")) {
//		System.out.println("Es verdadero");
//	}else {
//		System.out.println("No lo es");
//		
//	}
	
// if con OR	
//	if(x==10 || m.equals("puebla 2023")) {
//		System.out.println("Es verdadero");
//	}else {
//		System.out.println("No lo es");
//	
//}
//
	
	Scanner lector = new Scanner(System.in);
//	System.out.println("Ingresa un mensaje:");
//	String xx = lector.nextLine();
//	System.out.println(xx+50);
	Integer mes = lector.nextInt();
	
	System.out.println("Ingresa un número:");
	
	
	switch(mes) {
	
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
		
	case 6:
		System.out.println("Junio");
		break;
		
	case 7:
		System.out.println("Julio");
		
	case 8:
		System.out.println("Agosto");
		break;
		
	case 9:
		System.out.println("Septiembre");
		break;
		
	case 10:
		System.out.println("Octubre");
		break;
		
	case 11:
		System.out.println("Noviembre");
		break;
		
	case 12:
		System.out.println("Diciembre");
		break;
		
	default:
		System.out.println("Valor desconocido");
		
	}
}
}
	
	