package common;

import java.util.Scanner;

public class Seis {
public static void main(String[]args) {
		
        Scanner lector= new Scanner(System.in);
        System.out.println("Inversion de con 2% de interes\n");
       
		
		System.out.println("Ingrese cuanto desea invertir: ");
		double dinero = lector.nextInt();
		int mes = 12;
                       
        for (int i = 1; i <= mes; i++)
        {
        	double ganan = (dinero/100)*2+dinero;
        	dinero = ganan;
        	
        	System.out.println("en el mes " + i + " mas 2% de interes tiene: " + ganan );
        	
        }
        
        System.out.println("Simulacion finalizada.");
        
    
	}

}
