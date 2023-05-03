package common;

import java.util.Scanner;

public class Doce {
	public static void main(String[] args) {
		
		   Scanner lector = new Scanner(System.in);
	        int i;
	        double suma = 0;                    
	        
	        System.out.println("Ingrese el tamaño del arreglo: ");
	        int tama = lector.nextInt(); 
	        
	        int[] numeros = new int[tama];
	        
	        System.out.println("Lectura de los elementos del array: ");
	        for (i = 0; i < tama; i++) {
	            System.out.print("Posición [" + i + "]= ");
	            numeros[i]=lector.nextInt();
	        }

	        
	        for (i = 0; i < tama; i++) {
	                suma += numeros[i];
	               
	            } 
	        System.out.println("\nLa suma de los numeros es: "+suma);
	}

}
