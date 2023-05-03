package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		
		Scanner lector = new Scanner(System.in);
		
		int resultado;
		String numeroOpuesto = "";
		
		System.out.println("Introduce el numero del lanzamiento del DADO");
		resultado = lector.nextInt();
		
		
		switch (resultado) {
		case 1:
			numeroOpuesto = "seis";
			break;
			
		case 2:
			numeroOpuesto = "cinco";
			break;
			
		case 3:
			numeroOpuesto = "cuatro";
			break;
			
		case 4:
			numeroOpuesto = "tres";
			break;
	
		case 5:
			numeroOpuesto = "dos";
			break;
	
		case 6:
			numeroOpuesto = "uno";
			break;

		default:
			System.out.println("Numero incorrecto");
			break;
		}
		
		System.out.println("El numero en letras es " + numeroOpuesto);
		
	}

}
