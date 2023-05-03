package common;

import java.util.Scanner;

public class Siete {
public static void main(String[]args) {
		
        Scanner lector= new Scanner(System.in);
        System.out.println("Inversion de con 2% de interes\n");
       
		
		System.out.println("Ingrese cuanto desea invertir: ");
		double dinero = lector.nextInt();
		
		System.out.println("Ingrese cuanto desea obtener ");
		double dinerofin = lector.nextInt();
		double ganan =0;
		int mes =1;
		
		do {
			
	        	ganan = (dinero/100)*2+dinero;
	        	dinero = ganan;
	        	
	        	System.out.println("en el mes " + mes + " mas 2% de interes tiene: " + ganan );
	        	mes++;
	       
			
		}while(ganan<=dinerofin);
				
		
	}


}
