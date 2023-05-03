package common;

import java.util.Scanner;

public class Ejercicio6 {

	
public static void main (String[] args) {
		
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el número de estudiantes que van a viajar:");
		int numEst = lector.nextInt(); 
		
		switch(numEst) {
		case 1:
			if(numEst >= 100) {
				System.out.println("El costo por alumno es de 65 euros y el pago a la compañía de autobuses es de "+ numEst*65 + " euros");
			}
			break;
		case 2:
			if(numEst < 100 && numEst >= 50) {
				System.out.println("El costo por alumno es de 70 euros y el pago a la compañía de autobuses es de "+ numEst*70 + " euros");
			}
			break;
		case 3:
			if(numEst < 59 && numEst >= 30) {
				System.out.println("El costo por alumno es de 95 euros y el pago a la compañía de autobuses es de "+ numEst*95 + " euros");
			}
			break;
		case 4:
			if(numEst < 30) {
				System.out.println("El costo del autobús es de 4000 euros");
			}
			break;
		
			
			
		}
		
	}
	
	
}
